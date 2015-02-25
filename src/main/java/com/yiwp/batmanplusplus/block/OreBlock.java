package com.yiwp.batmanplusplus.block;

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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreBlock extends ExtBlock implements IBlock{

	static final String[] metalTypes = new String[] {Names.Metal.titanium, Names.Metal.vibranium};
    private IIcon[] icons = new IIcon[metalTypes.length];	
	private static final float[] hardness = new float[] {7.5f, 15.f};
	private static final float[] resistance = new float[] {20.0f, 30.0f};
	
	public OreBlock() {
		super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(16.0f);
		this.setResistance(35.0f);
		
		setHarvestLevel("pickaxe", 2, 0);
		setHarvestLevel("pickaxe", 3, 1);
		setHarvestLevel("pickaxe", 1, 2);
		setHarvestLevel("pickaxe", 1, 3);
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
	
}
