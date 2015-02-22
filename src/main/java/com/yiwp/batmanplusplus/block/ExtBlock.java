package com.yiwp.batmanplusplus.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
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

public abstract class ExtBlock extends Block {
	
	//Metadata
	public ExtBlock(Material material) {
		super(material);
		this.setBlockName(Reference.MODID + ":");
		this.setCreativeTab(BPPCreativeTabs.INSTANCE);
	}

	//Non-Metadata
	public ExtBlock(Material material, String tex) {
		super(material);
		this.setCreativeTab(BPPCreativeTabs.INSTANCE);
		this.setBlockName(Reference.MODID + ":" + Names.Textures.block(tex));
		this.setBlockTextureName(Names.Textures.block(tex));
	}

	@SideOnly(Side.CLIENT)
    public int getSideTextureIndex (int side) {
        if (side == 0)
            return 2;
        if (side == 1)
            return 0;

        return 1;
    }

    
}
