package com.yiwp.batmanplusplus.common.block;

import java.util.List;

import net.minecraft.block.Block;
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

public class OreBlock extends ExtBlock implements IBlock{

	static String[] metalTypes;
    private IIcon[] icons;	
	private static float[] hardness; 
	private static float[] resistance;
	
	public OreBlock() {
		super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(16.0f);
		this.setResistance(35.0f);
		this.initArrays();
		
		setHarvestLevel("pickaxe", 2, 0);
		setHarvestLevel("pickaxe", 3, 1);
		setHarvestLevel("pickaxe", 3, 2);
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
        for (int i = 0; i < metalTypes.length; ++i) {
            icons[i] = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + Names.Textures.ore(metalTypes[i]));
        }
    }
    
	@Override
	    public void getSubBlocks (Item block, CreativeTabs tab, List list) {
	    for (int i = 0; i < metalTypes.length; i++) {
	    	list.add(new ItemStack(block, 1, i));
	    }
	}
	    
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta) {
        return icons[meta];
    }
		
	@Override
    public int damageDropped (int meta) {
        return meta;
    }

	@Override
	public void initArrays() {
		String[] types = new String[] {"Poor"+ Names.Metal.titanium, Names.Metal.titanium, Names.Metal.vibranium, "Poor" + Names.Metal.vibranium};
		float[] hard = new float[] {7.5f, 15.0f, 13.0f};
		float[] res = new float[] {20.0f, 30.0f, 25.0f};
		if(!BlockHelper.disjoint(types)) {
			BlockHelper.newArray(types, metalTypes);
			BlockHelper.newArray(hard, hardness);
			BlockHelper.newArray(res, resistance);
		} else {
			metalTypes = types;
			hardness = hard;
			resistance = res;
		} icons = new IIcon[metalTypes.length];
		
	}
	
}
