package com.yiwp.batmanplusplus.block;
/* 
 * 
 * 	This Class Is a Part 
 * 	Tinkers Construct
 * 	all credit goes to them
 *  
 */
import java.util.List;

import mantle.blocks.MantleBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.yiwp.batmanplusplus.creativetab.BPPCreativeTabs;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class ExtBlock extends MantleBlock {
	
	public String[] textureNames;
	public IIcon[] icons;
	public static float[] hardness;
	public static float[] resistance;
	
	
	public ExtBlock(Material material, String[] tex) {
		super(material);
		this.setCreativeTab(BPPCreativeTabs.INSTANCE);
        textureNames = tex;
	}
	
	public ExtBlock(Material material, String tex) {
		super(material);
		this.setCreativeTab(BPPCreativeTabs.INSTANCE);
		this.setBlockName(tex.toLowerCase());
		this.setBlockTextureName(Names.Textures.block(tex).toLowerCase());
	}
	
	//my attempt at varying hardness with metadata
	public void hardness() {
		for (int i = 0; i < hardness.length; ++i) {
			this.setHardness(hardness[i]);
		}
	}
	
	public void resistance() {
		for (int i = 0; i < resistance.length; ++i) {
			this.setResistance(resistance[i]);
		}
	}
	// cause my compiler doesnt work

    @Override
    public int damageDropped (int meta)
    {
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister)
    {
        this.icons = new IIcon[textureNames.length];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + textureNames[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta)
    {
        return meta < icons.length ? icons[meta] : icons[0];
    }

    @SideOnly(Side.CLIENT)
    public int getSideTextureIndex (int side)
    {
        if (side == 0)
            return 2;
        if (side == 1)
            return 0;

        return 1;
    }

    // TODO getSubBlocks
    @Override
    public void getSubBlocks (Item block, CreativeTabs tab, List list)
    {
        for (int iter = 0; iter < icons.length; iter++)
        {
            list.add(new ItemStack(block, 1, iter));
        }
    }
}
