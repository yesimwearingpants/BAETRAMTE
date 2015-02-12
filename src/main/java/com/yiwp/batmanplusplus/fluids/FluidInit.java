package com.yiwp.batmanplusplus.fluids;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.smeltery.TinkerSmeltery;
import tconstruct.smeltery.blocks.TConstructFluid;

import com.yiwp.batmanplusplus.fluids.ExtFluid.BPPFluid;
import com.yiwp.batmanplusplus.fluids.ExtFluid.BlockBPPFluid;
import com.yiwp.batmanplusplus.lib.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class FluidInit {
	
	public static Fluid FluidMoltenDarkIron = new BPPFluid();
	public static Block BlockMoltenDarkIron = new BlockBPPFluid(FluidMoltenDarkIron, "tex", Names.darkIron);
	public static Fluid FluidMoltenMolybdochalkos = new BPPFluid();
	public static Block BlockMoltenMolybdochalkos = new BlockBPPFluid(FluidMoltenMolybdochalkos, "tex", Names.molybdochalkos);
	public static Fluid FluidMoltenOrichalcum = new BPPFluid();
	public static Block BlockMoltenOrichalcum = new BlockBPPFluid(FluidMoltenOrichalcum, "tex", Names.orichalcum);
	public static Fluid FluidMoltenCactus = new BPPFluid();
	public static Block BlockMoltenCactus = new BlockBPPFluid(FluidMoltenCactus, "tex", "cactusFluid");
	
	
	public static void init() {
	
	boolean isMolybdochalkosPreReg = !FluidRegistry.registerFluid(FluidMoltenMolybdochalkos);
    GameRegistry.registerBlock(BlockMoltenMolybdochalkos, Names.fluid(Names.molybdochalkos));
    if (isMolybdochalkosPreReg)
    {
        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.molybdochalkos));
        Block regBlockMoltenMolybdochalkos = FluidMoltenMolybdochalkos.getBlock();
        if (regBlockMoltenMolybdochalkos != null)
        {
            ((TConstructFluid) BlockMoltenMolybdochalkos).suppressOverwritingFluidIcons();
            TinkerSmeltery.moltenCopper = regBlockMoltenMolybdochalkos;
        }
        else
            FluidMoltenMolybdochalkos.setBlock(BlockMoltenMolybdochalkos);
    }
    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidMoltenMolybdochalkos, 1000), new ItemStack(Items.bucket)) == null)
        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidMoltenMolybdochalkos, 1000), new ItemStack
        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	}

}
