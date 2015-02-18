package com.yiwp.batmanplusplus.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class MetalBlock extends ExtBlock {
	
	private static final String c = "block";
	
	protected float[] hardness = ExtBlock.hardness = new float[] { 16.0f, 11.0f, 3.1f, 3.5f, 10.0f, 20.f};
	
	static final String[] metalTypes = new String[] { c + Names.adamantium, c + Names.meteoricIron, c + Names.molybdochalkos,
		c + Names.orichalcum, c + Names.titanium, c + Names.vibranium};
	
	private static float[] resistance = ExtBlock.resistance = new float[] { 50.0f, 35.0f, 9.0f, 9.9f, 30.0f, 40.0f};

	public MetalBlock() {
		super(Material.iron, metalTypes);
		this.setStepSound(Block.soundTypeMetal);
			
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
        icons = new IIcon[textureNames.length];

        for (int i = 0; i < textureNames.length; ++i) {
            icons[i] = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + textureNames[i]);
        }
    }
    
	@Override
	    public void getSubBlocks (Item block, CreativeTabs tab, List list) {
	    for (int i = 0; i < textureNames.length; i++) {
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
