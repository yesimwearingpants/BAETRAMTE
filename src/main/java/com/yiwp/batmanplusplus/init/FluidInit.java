package com.yiwp.batmanplusplus.init;

import net.minecraft.block.Block;
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

import com.yiwp.batmanplusplus.fluids.ExtFluid;
import com.yiwp.batmanplusplus.fluids.ExtFluid.BPPFluid;
import com.yiwp.batmanplusplus.fluids.ExtFluid.BlockBPPFluid;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class FluidInit {
	
	public static Item buckets;
	
	public static Fluid FluidDarkIron = new BPPFluid();
	public static Block BlockMoltenDarkIron = new BlockBPPFluid(FluidDarkIron, Names.Textures.liquidstill(Names.darkIron), Names.darkIron);
	public static Fluid FluidMolybdochalkos = new BPPFluid();
	public static Block BlockMoltenMolybdochalkos = new BlockBPPFluid(FluidMolybdochalkos, Names.Textures.liquidstill(Names.molybdochalkos), Names.molybdochalkos);
	public static Fluid FluidOrichalcum = new BPPFluid();
	public static Block BlockMoltenOrichalcum = new BlockBPPFluid(FluidOrichalcum, Names.Textures.liquidstill(Names.orichalcum), Names.orichalcum);
	public static Fluid FluidMoltenCactus = new BPPFluid();
	public static Block BlockMoltenCactus = new BlockBPPFluid(FluidMoltenCactus, "liquid_water", "cactusJuice");
	public static Fluid FluidCactusSteel = new BPPFluid();
	public static Block BlockMoltenCactusSteel = new BlockBPPFluid(FluidCactusSteel, Names.Textures.liquidstill(Names.cactusSteel), Names.cactusSteel);
	public static Fluid FluidMeteoricIron = new BPPFluid();
	public static Block BlockMoltenMeteoricIron = new BlockBPPFluid(FluidMeteoricIron, Names.Textures.liquidstill(Names.meteoricIron), Names.meteoricIron);
	public static Fluid FluidTitanium = new BPPFluid();
	public static Block BlockMoltenTitanium = new BlockBPPFluid(FluidTitanium, Names.Textures.liquidstill(Names.titanium), Names.titanium);
	public static Fluid FluidVibranium = new BPPFluid();
	public static Block BlockMoltenVibranium = new BlockBPPFluid(FluidVibranium, Names.Textures.liquidstill(Names.vibranium), Names.vibranium);
	public static Fluid FluidAdamantium = new BPPFluid();
	public static Block BlockMoltenAdamantium = new BlockBPPFluid(FluidAdamantium, Names.Textures.liquidstill(Names.adamantium), Names.adamantium);
	public static Fluid FluidTitaniumAlumide = new BPPFluid();
	public static Block BlockMoltenTitaniumAlumide = new BlockBPPFluid(FluidTitaniumAlumide, Names.Textures.liquidstill(Names.titaniumAlumide), Names.titaniumAlumide);
	
	
	public static void preInit() {
	
		boolean isDarkIronPreReg = !FluidRegistry.registerFluid(FluidDarkIron);
	    GameRegistry.registerBlock(BlockMoltenDarkIron, Names.fluid(Names.darkIron));
	    if (isDarkIronPreReg)
	    {
	        FluidDarkIron = FluidRegistry.getFluid(Names.molten(Names.darkIron));
	        Block regBlockMoltenDarkIron = FluidDarkIron.getBlock();
	        if (regBlockMoltenDarkIron != null)
	        {
	            ((BlockBPPFluid) BlockMoltenDarkIron).suppressOverwritingFluidIcons();
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
	            ((BlockBPPFluid) BlockMoltenMolybdochalkos).suppressOverwritingFluidIcons();
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
	            ((BlockBPPFluid) BlockMoltenOrichalcum).suppressOverwritingFluidIcons();
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
	            ((BlockBPPFluid) BlockMoltenCactusSteel).suppressOverwritingFluidIcons();
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
	            ((BlockBPPFluid) BlockMoltenMeteoricIron).suppressOverwritingFluidIcons();
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
	            ((BlockBPPFluid) BlockMoltenTitanium).suppressOverwritingFluidIcons();
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
	            ((BlockBPPFluid) BlockMoltenVibranium).suppressOverwritingFluidIcons();
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
	            ((BlockBPPFluid) BlockMoltenAdamantium).suppressOverwritingFluidIcons();
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
	            ((BlockBPPFluid) BlockMoltenTitaniumAlumide).suppressOverwritingFluidIcons();
	            BlockMoltenTitaniumAlumide = regBlockMoltenTitaniumAlumide;
	        }
	        else
	            FluidTitaniumAlumide.setBlock(BlockMoltenTitaniumAlumide);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidTitaniumAlumide, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidTitaniumAlumide, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isCactusPreReg = !FluidRegistry.registerFluid(FluidMoltenCactus);
	    GameRegistry.registerBlock(BlockMoltenCactus, "fluid.molten.cactus");
	    if (isCactusPreReg)
	    {
	    	FluidMoltenCactus = FluidRegistry.getFluid("cactus.molten");
	        Block regBlockMoltenCactus = FluidMoltenCactus.getBlock();
	        if (regBlockMoltenCactus != null)
	        {
	            ((BlockBPPFluid) BlockMoltenCactus).suppressOverwritingFluidIcons();
	            BlockMoltenCactus = regBlockMoltenCactus;
	        }
	        else
	            FluidMoltenCactus.setBlock(BlockMoltenCactus);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidMoltenCactus, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidMoltenCactus, 1000), new ItemStack
	        		(buckets, 1, 2), new ItemStack(Items.bucket)));

	    FluidType.registerFluidType(Names.adamantium, BlockInit.BlockAdamantium, 0, 900, FluidAdamantium, true);
	    FluidType.registerFluidType(Names.cactusSteel, Blocks.cactus, 0, 650, FluidCactusSteel, true);
	}

}
