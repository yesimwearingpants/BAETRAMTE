package com.yiwp.batmanplusplus.common.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;
import com.yiwp.batmanplusplus.lib.utils.BlockHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LuxOreBlock extends ExtBlock implements IBlock {
	
	public static String[] textureNames;
    private IIcon[] icons;	
	private static float[] hardness;
	private static int[] light;
	private static float[] resistance;

	public LuxOreBlock() {
		super(Material.rock);
		this.initArrays();
	}
	
	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z) {

		return light[world.getBlockMetadata(x, y, z)];
	}
	
	@Override
	public float getBlockHardness(World world, int x, int y, int z) {
		return hardness[world.getBlockMetadata(x, y, z)];
	}

	@Override
	public float getExplosionResistance(Entity entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ) {
		return resistance[world.getBlockMetadata(x, y, z)];
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
        for (int i = 0; i < textureNames.length; ++i) {
            icons[i] = iconRegister.registerIcon(Reference.MODID + ":" + Names.Textures.ore(textureNames[i]));
        }
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta) {
        return icons[meta];
    }
    
	@Override
	public void getSubBlocks (Item block, CreativeTabs tab, List list) {
	    for (int i = 0; i < textureNames.length; i++) {
	    	list.add(new ItemStack(block, 1, i));
	    }
	}
	
	@Override
    public boolean isOpaqueCube ()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock ()
    {
        return false;
    }

    @Override
    public int getRenderBlockPass ()
    {
        return 1;
    }

	@Override
	public void initArrays() {
		String[] types = new String[] {Names.Glass.lux, "Nether" + Names.Glass.lux};
		float[] hard = new float[] {2.0f, 0.75f};
		float[] res = new float[] {9.9f, 5.0f};
		int[] ll = new int[] {9, 9};
		if(!BlockHelper.disjoint(types)) {
			BlockHelper.newArray(types, textureNames);
			BlockHelper.newArray(hard, hardness);
			BlockHelper.newArray(res, resistance);
			BlockHelper.newArray(ll, light);
		} else {
			textureNames = types;
			hardness = hard;
			resistance = res;
			light = ll;
		} icons = new IIcon[textureNames.length];
	}
	
}
