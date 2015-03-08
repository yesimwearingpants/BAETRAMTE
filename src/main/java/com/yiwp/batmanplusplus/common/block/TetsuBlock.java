package com.yiwp.batmanplusplus.common.block;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class TetsuBlock extends ExtBlock {

	public TetsuBlock(float h, float r) {
		super(Material.iron, Names.Metal.tetsu);
		this.setHardness(h);
		this.setResistance(r);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + Names.Textures.block(Names.Metal.tetsu));
    }

}
