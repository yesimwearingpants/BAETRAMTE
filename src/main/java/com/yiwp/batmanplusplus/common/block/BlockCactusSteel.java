package com.yiwp.batmanplusplus.common.block;

import java.util.Random;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockCactusSteel extends ExtBlock {

	public BlockCactusSteel(float h, float r) {
		super(Material.iron, Names.Metal.cactusSteel);
		this.setHardness(h);
		this.setResistance(r);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
    public int quantityDropped(Random rand)
    {
        return 0;
    }
	
	@Override
    protected boolean canSilkHarvest()
    {
        return false;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + Names.Textures.block(Names.Metal.cactusSteel));
    }

}
