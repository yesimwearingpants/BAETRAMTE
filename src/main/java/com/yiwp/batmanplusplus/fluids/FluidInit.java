package com.yiwp.batmanplusplus.fluids;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
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

@GameRegistry.ObjectHolder(Reference.MODID)
public class FluidInit {
	
	public static Fluid FluidDarkIron = new BPPFluid();
	public static Block BlockMoltenDarkIron = new BlockBPPFluid(FluidDarkIron, Names.Textures.liquidstill(Names.darkIron), Names.darkIron);
	public static Fluid FluidMolybdochalkos = new BPPFluid();
	public static Block BlockMoltenMolybdochalkos = new BlockBPPFluid(FluidMolybdochalkos, Names.Textures.liquidstill(Names.molybdochalkos), Names.molybdochalkos);
	public static Fluid FluidOrichalcum = new BPPFluid();
	public static Block BlockMoltenOrichalcum = new BlockBPPFluid(FluidOrichalcum, Names.Textures.liquidstill(Names.orichalcum), Names.orichalcum);
	public static Fluid FluidMoltenCactus = new BPPFluid();
	public static Block BlockMoltenCactus = new BlockBPPFluid(FluidMoltenCactus, "liquid_water", "cactusFluid");
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
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.darkIron));
	        Block regBlockMoltenDarkIron = FluidDarkIron.getBlock();
	        if (regBlockMoltenDarkIron != null)
	        {
	            ((TConstructFluid) BlockMoltenDarkIron).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenDarkIron;
	        }
	        else
	            FluidDarkIron.setBlock(BlockMoltenDarkIron);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidDarkIron, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidDarkIron, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));
	    
	    boolean isMolybdochalkosPreReg = !FluidRegistry.registerFluid(FluidMolybdochalkos);
	    GameRegistry.registerBlock(BlockMoltenMolybdochalkos, Names.fluid(Names.molybdochalkos));
	    if (isMolybdochalkosPreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.molybdochalkos));
	        Block regBlockMoltenMolybdochalkos = FluidMolybdochalkos.getBlock();
	        if (regBlockMoltenMolybdochalkos != null)
	        {
	            ((TConstructFluid) BlockMoltenMolybdochalkos).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenMolybdochalkos;
	        }
	        else
	            FluidMolybdochalkos.setBlock(BlockMoltenMolybdochalkos);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidMolybdochalkos, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidMolybdochalkos, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isOrichalcumPreReg = !FluidRegistry.registerFluid(FluidOrichalcum);
	    GameRegistry.registerBlock(BlockMoltenOrichalcum, Names.fluid(Names.orichalcum));
	    if (isOrichalcumPreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.orichalcum));
	        Block regBlockMoltenOrichalcum = FluidOrichalcum.getBlock();
	        if (regBlockMoltenOrichalcum != null)
	        {
	            ((TConstructFluid) BlockMoltenOrichalcum).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenOrichalcum;
	        }
	        else
	            FluidOrichalcum.setBlock(BlockMoltenOrichalcum);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidOrichalcum, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidOrichalcum, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isCactusSteelPreReg = !FluidRegistry.registerFluid(FluidCactusSteel);
	    GameRegistry.registerBlock(BlockMoltenCactusSteel, Names.fluid(Names.cactusSteel));
	    if (isCactusSteelPreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.cactusSteel));
	        Block regBlockMoltenCactusSteel = FluidCactusSteel.getBlock();
	        if (regBlockMoltenCactusSteel != null)
	        {
	            ((TConstructFluid) BlockMoltenCactusSteel).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenCactusSteel;
	        }
	        else
	            FluidCactusSteel.setBlock(BlockMoltenCactusSteel);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidCactusSteel, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidCactusSteel, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isMeteoricIronPreReg = !FluidRegistry.registerFluid(FluidMeteoricIron);
	    GameRegistry.registerBlock(BlockMoltenMeteoricIron, Names.fluid(Names.meteoricIron));
	    if (isMeteoricIronPreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.meteoricIron));
	        Block regBlockMoltenMeteoricIron = FluidMeteoricIron.getBlock();
	        if (regBlockMoltenMeteoricIron != null)
	        {
	            ((TConstructFluid) BlockMoltenMeteoricIron).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenMeteoricIron;
	        }
	        else
	            FluidMeteoricIron.setBlock(BlockMoltenMeteoricIron);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidMeteoricIron, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidMeteoricIron, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isTitaniumPreReg = !FluidRegistry.registerFluid(FluidTitanium);
	    GameRegistry.registerBlock(BlockMoltenTitanium, Names.fluid(Names.titanium));
	    if (isTitaniumPreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.titanium));
	        Block regBlockMoltenTitanium = FluidTitanium.getBlock();
	        if (regBlockMoltenTitanium != null)
	        {
	            ((TConstructFluid) BlockMoltenTitanium).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenTitanium;
	        }
	        else
	            FluidTitanium.setBlock(BlockMoltenTitanium);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidTitanium, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidTitanium, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isVibraniumPreReg = !FluidRegistry.registerFluid(FluidVibranium);
	    GameRegistry.registerBlock(BlockMoltenVibranium, Names.fluid(Names.vibranium));
	    if (isVibraniumPreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.vibranium));
	        Block regBlockMoltenVibranium = FluidVibranium.getBlock();
	        if (regBlockMoltenVibranium != null)
	        {
	            ((TConstructFluid) BlockMoltenVibranium).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenVibranium;
	        }
	        else
	            FluidVibranium.setBlock(BlockMoltenVibranium);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidVibranium, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidVibranium, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isAdamantiumPreReg = !FluidRegistry.registerFluid(FluidAdamantium);
	    GameRegistry.registerBlock(BlockMoltenAdamantium, Names.fluid(Names.adamantium));
	    if (isAdamantiumPreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.adamantium));
	        Block regBlockMoltenAdamantium = FluidAdamantium.getBlock();
	        if (regBlockMoltenAdamantium != null)
	        {
	            ((TConstructFluid) BlockMoltenAdamantium).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenAdamantium;
	        }
	        else
	            FluidAdamantium.setBlock(BlockMoltenAdamantium);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidAdamantium, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidAdamantium, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isTitaniumAlumidePreReg = !FluidRegistry.registerFluid(FluidTitaniumAlumide);
	    GameRegistry.registerBlock(BlockMoltenTitaniumAlumide, Names.fluid(Names.titaniumAlumide));
	    if (isTitaniumAlumidePreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid(Names.molten(Names.titaniumAlumide));
	        Block regBlockMoltenTitaniumAlumide = FluidTitaniumAlumide.getBlock();
	        if (regBlockMoltenTitaniumAlumide != null)
	        {
	            ((TConstructFluid) BlockMoltenTitaniumAlumide).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenTitaniumAlumide;
	        }
	        else
	            FluidTitaniumAlumide.setBlock(BlockMoltenTitaniumAlumide);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidTitaniumAlumide, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidTitaniumAlumide, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	    boolean isCactusPreReg = !FluidRegistry.registerFluid(FluidMoltenCactus);
	    GameRegistry.registerBlock(BlockMoltenCactus, "fluid.molten.cactus");
	    if (isCactusPreReg)
	    {
	        TinkerSmeltery.moltenCopperFluid = FluidRegistry.getFluid("cactus.molten");
	        Block regBlockMoltenCactus = FluidMoltenCactus.getBlock();
	        if (regBlockMoltenCactus != null)
	        {
	            ((TConstructFluid) BlockMoltenCactus).suppressOverwritingFluidIcons();
	            TinkerSmeltery.moltenCopper = regBlockMoltenCactus;
	        }
	        else
	            FluidMoltenCactus.setBlock(BlockMoltenCactus);
	    }
	    if (FluidContainerRegistry.fillFluidContainer(new FluidStack(FluidMoltenCactus, 1000), new ItemStack(Items.bucket)) == null)
	        FluidContainerRegistry.registerFluidContainer(new FluidContainerData(new FluidStack(FluidMoltenCactus, 1000), new ItemStack
	        		(TinkerSmeltery.buckets, 1, 2), new ItemStack(Items.bucket)));

	}

}
