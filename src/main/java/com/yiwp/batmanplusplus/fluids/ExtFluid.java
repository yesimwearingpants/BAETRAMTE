package com.yiwp.batmanplusplus.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import com.yiwp.batmanplusplus.creativetab.BPPCreativeTabs;
import com.yiwp.batmanplusplus.lib.reference.Names;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExtFluid {

	public static class BPPFluid extends Fluid	{
	
		public BPPFluid() {
			super(".molten");
			this.setLuminosity(12);
			this.setDensity(3000);
			this.setViscosity(6000);
			this.setTemperature(1300);
		}
	    
	}
	
	public static class BlockBPPFluid extends BlockFluidClassic {
	    String texture;
	    boolean alpha;
	    public IIcon stillIcon;
	    public IIcon flowIcon;
	    boolean overwriteFluidIcons = true;

	    public BlockBPPFluid(Fluid fluid, Material material, String texture) {
	        super(fluid, material);
	        this.texture = texture;
	        this.setCreativeTab(BPPCreativeTabs.INSTANCE);
	    }
	    
	    public BlockBPPFluid(Fluid fluid, String texture, String metal) {
	        super(fluid, Material.lava);
	        this.texture = texture;
	        this.setBlockName(Names.fluid(metal));
	        this.setCreativeTab(BPPCreativeTabs.INSTANCE);
	    }

	    public BlockBPPFluid(Fluid fluid, Material material, String texture, boolean alpha) {
	        this(fluid, material, texture);
	        this.alpha = alpha;
	    }

	    @Override
	    public int getRenderBlockPass () {
	        return alpha ? 1 : 0;
	    }

	    @Override
	    public void registerBlockIcons (IIconRegister iconRegister) {
	        stillIcon = iconRegister.registerIcon("tinker:" + texture);
	        flowIcon = iconRegister.registerIcon("tinker:" + texture + "_flow");

	        if (overwriteFluidIcons)
	            this.getFluid().setIcons(stillIcon, flowIcon);
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public IIcon getIcon (int side, int meta) {
	        if (side == 0 || side == 1)
	            return stillIcon;
	        return flowIcon;
	    }

	    public void suppressOverwritingFluidIcons () {
	        overwriteFluidIcons = false;
	    }

	}
}