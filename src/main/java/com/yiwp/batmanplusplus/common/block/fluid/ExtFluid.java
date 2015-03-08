package com.yiwp.batmanplusplus.common.block.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import com.yiwp.batmanplusplus.common.creativetab.BPPCreativeTab;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExtFluid {

	public static class MetalFluid extends Fluid	{
		
		public MetalFluid() {
			super(".molten");
			this.setLuminosity(12);
			this.setDensity(3000);
			this.setViscosity(6000);
			this.setTemperature(1300);
		}
	    
	}
	
	public static class BPPFluid extends Fluid	{
		
		public static int temp = 600;
		
		public BPPFluid(int t) {
			super(".soup");
			this.setLuminosity(9);
			this.setDensity(1500);
			this.setViscosity(2000);
			this.setTemperature(300);
		}    
	}
	
	public static class CactusFluid extends Fluid	{

		public CactusFluid() {
			super(".molten");
			this.setLuminosity(9);
			this.setDensity(1000);
			this.setViscosity(6000);
			this.setTemperature(600);
		}    
	}
	
}