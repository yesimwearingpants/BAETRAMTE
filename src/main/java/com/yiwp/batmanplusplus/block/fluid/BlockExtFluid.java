package com.yiwp.batmanplusplus.block.fluid;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import com.yiwp.batmanplusplus.block.ExtBlock;
import com.yiwp.batmanplusplus.creativetab.BPPCreativeTabs;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockExtFluid extends BlockFluidClassic {
	
	public static class BlockBPPFluid extends BlockExtFluid {
		
		public BlockBPPFluid(Fluid fluid, Material material, String metal) {
			super(fluid, material, metal, false);
		}
	}
	
	public static class BlockMetalFluid extends BlockExtFluid {
		
		public BlockMetalFluid(Fluid fluid, String metal) {
			super(fluid, Material.lava, metal, false);
			this.setBlockName(Reference.MODID + ":");
		}
	}

	static String textureName;
    public IIcon stillIcon;
    public IIcon flowIcon;
    boolean overwriteFluidIcon = true;
    boolean alpha;

    public BlockExtFluid(Fluid fluid, Material material, String metal, boolean alpha) {
        super(fluid, material);
        this.alpha = alpha;
        this.setCreativeTab(BPPCreativeTabs.INSTANCE);
		this.setBlockName(Reference.MODID + ":" + Names.fluid(metal));
    }

	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
        stillIcon = iconRegister.registerIcon(Reference.MODID + ":" + Names.Textures.liquidstill(textureName));
        flowIcon = iconRegister.registerIcon(Reference.MODID + ":" + Names.Textures.liquidflowing(textureName));

        if (overwriteFluidIcon)
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
        overwriteFluidIcon = false;
    }

    @Override
    public int getRenderBlockPass () {
        return alpha ? 1 : 0;
    }

}