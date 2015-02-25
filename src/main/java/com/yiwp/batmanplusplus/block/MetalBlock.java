package com.yiwp.batmanplusplus.block;

import java.util.List;
import java.util.Random;

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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class MetalBlock extends ExtBlock implements IBlock{

	static final String[] metalTypes = new String[] { Names.Metal.adamantium, Names.Metal.meteoricIron,
	Names.Metal.molybdochalkos, Names.Metal.orichalcum, Names.Metal.titanium, Names.Metal.vibranium, Names.Metal.slag};
    private IIcon[] icons = new IIcon[metalTypes.length];	
	private static final float[] hardness = new float[] { 16.0f, 11.0f, 3.1f, 3.5f, 10.0f, 20.f, 10.5f};
	private static int[] light = new int[] { 0, 0, 0, 0, 0, 0, 0, 15};
	private static final float[] resistance = new float[] { 50.0f, 35.0f, 9.0f, 9.9f, 30.0f, 40.0f, 8.0f};
	
	public MetalBlock() {
		super(Material.iron);
		this.setStepSound(Block.soundTypeMetal);
		this.setHardness(16.0f);
		this.setResistance(35.0f);
		
		setHarvestLevel("pickaxe", 3, 0);
		setHarvestLevel("pickaxe", 3, 1);
		setHarvestLevel("pickaxe", 1, 2);
		setHarvestLevel("pickaxe", 2, 3);
		setHarvestLevel("pickaxe", 2, 4);
		setHarvestLevel("pickaxe", 3, 5);
		setHarvestLevel("pickaxe", 0, 6);
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
        for (int i = 0; i < metalTypes.length; ++i) {
            icons[i] = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + Names.Textures.block(metalTypes[i]));
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
		
	public boolean isBeaconBase (IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)	{
        return true;
        
    }
	
	@Override
    public int damageDropped (int meta) {
        return meta;
    }
	
}
