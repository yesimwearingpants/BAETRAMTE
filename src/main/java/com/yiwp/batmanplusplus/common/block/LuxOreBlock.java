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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LuxOreBlock extends ExtBlock implements IBlock {
	
	public static final String[] textureNames = new String[] {Names.Glass.lux, "Nether" + Names.Glass.lux};
    private IIcon[] icons = new IIcon[textureNames.length];	
	private static final float[] hardness = new float[] {2.0f, 0.75f};
	private static final int[] light = new int[] {9, 9};
	private static final float[] resistance = new float[] {9.9f, 5.0f};

	public LuxOreBlock() {
		super(Material.rock);
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
	
}
