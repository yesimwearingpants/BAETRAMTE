package com.yiwp.batmanplusplus.block;

import java.util.List;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class PressBoardBlock extends ExtBlock {


	public PressBoardBlock() {
		super(Material.wood, Names.Misc.board);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
		blockIcon  = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + Names.Textures.block(Names.Misc.board));
    }
	    
}
