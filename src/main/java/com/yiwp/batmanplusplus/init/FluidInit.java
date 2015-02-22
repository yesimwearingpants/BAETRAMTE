package com.yiwp.batmanplusplus.init;

/*import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.crafting.FluidType;

import com.yiwp.batmanplusplus.block.fluid.BlockExtFluid;
import com.yiwp.batmanplusplus.block.fluid.BlockExtFluid.BlockMetalFluid;
import com.yiwp.batmanplusplus.block.fluid.ExtFluid.CactusFluid;
import com.yiwp.batmanplusplus.block.fluid.ExtFluid.MetalFluid;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;*/

//@GameRegistry.ObjectHolder(Reference.MODID)
public class FluidInit {
	
/*	static Item buckets;
	
	static Fluid FluidMoltenCactus = new CactusFluid();
	static Fluid FluidAdamantium = new MetalFluid();
	static Fluid FluidCactusSteel = new MetalFluid();
	static Fluid FluidMeteoricIron = new MetalFluid();
	static Fluid FluidMolybdochalkos = new MetalFluid();
	static Fluid FluidOrichalcum = new MetalFluid();
	static Fluid FluidTitanium = new MetalFluid();
	static Fluid FluidVibranium = new MetalFluid();
	static Fluid FluidTitaniumAlumide = new MetalFluid();
	static Fluid FluidDarkIron = new MetalFluid();
	static Block BlockMoltenDarkIron = new BlockMetalFluid(FluidDarkIron, Names.darkIron);
	static Block BlockMoltenMolybdochalkos = new BlockMetalFluid(FluidMolybdochalkos, Names.molybdochalkos);
	static Block BlockMoltenOrichalcum = new BlockMetalFluid(FluidOrichalcum, Names.orichalcum);
	static Block BlockMoltenCactusSteel = new BlockMetalFluid(FluidCactusSteel, Names.cactusSteel);
	static Block BlockMoltenMeteoricIron = new BlockMetalFluid(FluidMeteoricIron, Names.meteoricIron);
	static Block BlockMoltenTitanium = new BlockMetalFluid(FluidTitanium, Names.titanium);
	static Block BlockMoltenVibranium = new BlockMetalFluid(FluidVibranium, Names.vibranium);
	static Block BlockMoltenAdamantium = new BlockMetalFluid(FluidAdamantium, Names.adamantium);
	static Block BlockMoltenTitaniumAlumide = new BlockMetalFluid(FluidTitaniumAlumide, Names.titaniumAlumide);
	
	public static boolean preInit() {

		FluidRegistry.registerFluid(FluidDarkIron);
		FluidRegistry.registerFluid(FluidTitaniumAlumide);
		FluidRegistry.registerFluid(FluidVibranium);
		FluidRegistry.registerFluid(FluidTitanium);
		FluidRegistry.registerFluid(FluidOrichalcum);
		FluidRegistry.registerFluid(FluidMolybdochalkos);
		FluidRegistry.registerFluid(FluidMeteoricIron);
		FluidRegistry.registerFluid(FluidCactusSteel);
		FluidRegistry.registerFluid(FluidAdamantium);
		FluidRegistry.registerFluid(FluidAdamantium);
		FluidRegistry.registerFluid(FluidMoltenCactus);
		
		boolean isDarkIronPreReg = !FluidRegistry.registerFluid(FluidDarkIron);
	    GameRegistry.registerBlock(BlockMoltenDarkIron, Names.fluid(Names.darkIron));
	    if (isDarkIronPreReg)
	    {
	        FluidDarkIron = FluidRegistry.getFluid(Names.molten(Names.darkIron));
	        Block regBlockMoltenDarkIron = FluidDarkIron.getBlock();
	        if (regBlockMoltenDarkIron != null)
	        {
	            ((BlockExtFluid) BlockMoltenDarkIron).suppressOverwritingFluidIcons();
	            BlockMoltenDarkIron = regBlockMoltenDarkIron;
	        }
	        else
	            FluidDarkIron.setBlock(BlockMoltenDarkIron);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidDarkIron, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidDarkIron, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));
	    
	    boolean isMolybdochalkosPreReg = !FluidRegistry.registerFluid(FluidMolybdochalkos);
	    GameRegistry.registerBlock(BlockMoltenMolybdochalkos, Names.fluid(Names.molybdochalkos));
	    if (isMolybdochalkosPreReg)
	    {
	        FluidMolybdochalkos = FluidRegistry.getFluid(Names.molten(Names.molybdochalkos));
	        Block regBlockMoltenMolybdochalkos = FluidMolybdochalkos.getBlock();
	        if (regBlockMoltenMolybdochalkos != null)
	        {
	            ((BlockExtFluid) BlockMoltenMolybdochalkos).suppressOverwritingFluidIcons();
	            BlockMoltenMolybdochalkos = regBlockMoltenMolybdochalkos;
	        }
	        else
	            FluidMolybdochalkos.setBlock(BlockMoltenMolybdochalkos);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidMolybdochalkos, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidMolybdochalkos, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isOrichalcumPreReg = !FluidRegistry.registerFluid(FluidOrichalcum);
	    GameRegistry.registerBlock(BlockMoltenOrichalcum, Names.fluid(Names.orichalcum));
	    if (isOrichalcumPreReg)
	    {
	        FluidOrichalcum = FluidRegistry.getFluid(Names.molten(Names.orichalcum));
	        Block regBlockMoltenOrichalcum = FluidOrichalcum.getBlock();
	        if (regBlockMoltenOrichalcum != null)
	        {
	            ((BlockExtFluid) BlockMoltenOrichalcum).suppressOverwritingFluidIcons();
	            BlockMoltenOrichalcum = regBlockMoltenOrichalcum;
	        }
	        else
	            FluidOrichalcum.setBlock(BlockMoltenOrichalcum);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidOrichalcum, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidOrichalcum, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isCactusSteelPreReg = !FluidRegistry.registerFluid(FluidCactusSteel);
	    GameRegistry.registerBlock(BlockMoltenCactusSteel, Names.fluid(Names.cactusSteel));
	    if (isCactusSteelPreReg)
	    {
	        FluidCactusSteel = FluidRegistry.getFluid(Names.molten(Names.cactusSteel));
	        Block regBlockMoltenCactusSteel = FluidCactusSteel.getBlock();
	        if (regBlockMoltenCactusSteel != null)
	        {
	            ((BlockExtFluid) BlockMoltenCactusSteel).suppressOverwritingFluidIcons();
	            BlockMoltenCactusSteel = regBlockMoltenCactusSteel;
	        }
	        else
	            FluidCactusSteel.setBlock(BlockMoltenCactusSteel);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidCactusSteel, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidCactusSteel, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isMeteoricIronPreReg = !FluidRegistry.registerFluid(FluidMeteoricIron);
	    GameRegistry.registerBlock(BlockMoltenMeteoricIron, Names.fluid(Names.meteoricIron));
	    if (isMeteoricIronPreReg)
	    {
	        FluidMeteoricIron = FluidRegistry.getFluid(Names.molten(Names.meteoricIron));
	        Block regBlockMoltenMeteoricIron = FluidMeteoricIron.getBlock();
	        if (regBlockMoltenMeteoricIron != null)
	        {
	            ((BlockExtFluid) BlockMoltenMeteoricIron).suppressOverwritingFluidIcons();
	            BlockMoltenMeteoricIron = regBlockMoltenMeteoricIron;
	        }
	        else
	            FluidMeteoricIron.setBlock(BlockMoltenMeteoricIron);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidMeteoricIron, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidMeteoricIron, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isTitaniumPreReg = !FluidRegistry.registerFluid(FluidTitanium);
	    GameRegistry.registerBlock(BlockMoltenTitanium, Names.fluid(Names.titanium));
	    if (isTitaniumPreReg)
	    {
	        FluidTitanium = FluidRegistry.getFluid(Names.molten(Names.titanium));
	        Block regBlockMoltenTitanium = FluidTitanium.getBlock();
	        if (regBlockMoltenTitanium != null)
	        {
	            ((BlockExtFluid) BlockMoltenTitanium).suppressOverwritingFluidIcons();
	            BlockMoltenTitanium = regBlockMoltenTitanium;
	        }
	        else
	            FluidTitanium.setBlock(BlockMoltenTitanium);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidTitanium, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidTitanium, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isVibraniumPreReg = !FluidRegistry.registerFluid(FluidVibranium);
	    GameRegistry.registerBlock(BlockMoltenVibranium, Names.fluid(Names.vibranium));
	    if (isVibraniumPreReg)
	    {
	        FluidVibranium = FluidRegistry.getFluid(Names.molten(Names.vibranium));
	        Block regBlockMoltenVibranium = FluidVibranium.getBlock();
	        if (regBlockMoltenVibranium != null)
	        {
	            ((BlockExtFluid) BlockMoltenVibranium).suppressOverwritingFluidIcons();
	            BlockMoltenVibranium = regBlockMoltenVibranium;
	        }
	        else
	            FluidVibranium.setBlock(BlockMoltenVibranium);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidVibranium, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidVibranium, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isAdamantiumPreReg = !FluidRegistry.registerFluid(FluidAdamantium);
	    GameRegistry.registerBlock(BlockMoltenAdamantium, Names.fluid(Names.adamantium));
	    if (isAdamantiumPreReg)
	    {
	        FluidAdamantium = FluidRegistry.getFluid(Names.molten(Names.adamantium));
	        Block regBlockMoltenAdamantium = FluidAdamantium.getBlock();
	        if (regBlockMoltenAdamantium != null)
	        {
	            ((BlockExtFluid) BlockMoltenAdamantium).suppressOverwritingFluidIcons();
	            BlockMoltenAdamantium = regBlockMoltenAdamantium;
	        }
	        else
	            FluidAdamantium.setBlock(BlockMoltenAdamantium);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidAdamantium, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidAdamantium, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isTitaniumAlumidePreReg = !FluidRegistry.registerFluid(FluidTitaniumAlumide);
	    GameRegistry.registerBlock(BlockMoltenTitaniumAlumide, Names.fluid(Names.titaniumAlumide));
	    if (isTitaniumAlumidePreReg)
	    {
	        FluidTitaniumAlumide = FluidRegistry.getFluid(Names.molten(Names.titaniumAlumide));
	        Block regBlockMoltenTitaniumAlumide = FluidTitaniumAlumide.getBlock();
	        if (regBlockMoltenTitaniumAlumide != null)
	        {
	            ((BlockExtFluid) BlockMoltenTitaniumAlumide).suppressOverwritingFluidIcons();
	            BlockMoltenTitaniumAlumide = regBlockMoltenTitaniumAlumide;
	        }
	        else
	            FluidTitaniumAlumide.setBlock(BlockMoltenTitaniumAlumide);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidTitaniumAlumide, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidTitaniumAlumide, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    FluidType.registerFluidType(Names.cactusSteel, Blocks.cactus, 0, 650, FluidMoltenCactus, false);
	    FluidType.registerFluidType(Names.adamantium, BlockInit.BlockMetaMetal, 0, 900, FluidAdamantium, true);
		
		return true;
	}*/

}
