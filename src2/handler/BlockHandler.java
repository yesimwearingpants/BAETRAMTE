package yesiwearpants.compressionmod.handler;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import yesiwearpants.compressionmod.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler {
	public static Block pcobble;
	public static Block woodboard;
	public static Block slag;
	public static Block steel;
	public static Block titan;
	public static Block light;
		
	public static Block titanore;
	public static Block steelore; 
	public static Block lumen;
	public static Block nlux;
	public static Block vibore;
	public static Block viles;
	public static Block bstone;
	
	public static Block leaves_1;
	public static Block blackdirt;
	public static Block redgrass;
	public static Block whitesand;
	
	public static final StepSound soundMetalFootstep = new StepSound("stone", 1.0F, 1.5F);
    public static final StepSound soundSandFootstep = new StepSound("sand", 1.0F, 1.0F);
    public static final StepSound soundGravelFootstep = new StepSound("gravel", 1.0F, 1.0F);
    public static final StepSound soundGrassFootstep = new StepSound("grass", 1.0F, 1.0F);

	public static void configureBlocks(Configuration config) {
		pcobble = new Blockyiwp(config.getBlock("Packed_Cobble", 3000).getInt(), Material.rock).setHardness(6.0F)
		.setResistance(15.0F).setUnlocalizedName("pcobble").setCreativeTab(CreativeTabs.tabBlock);		
		woodboard = new Blockyiwp(config.getBlock("Press_Board", 3001).getInt(), Material.wood).setHardness(2.5F)
		.setUnlocalizedName("woodboard").setCreativeTab(CreativeTabs.tabBlock);		
		slag = new Blockyiwp(config.getBlock("Slag_Block", 3002).getInt(), Material.iron).setHardness(3.0F)
		.setResistance(18.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("slag").setCreativeTab(CreativeTabs.tabBlock);
		steel = new Blockyiwp(config.getBlock("Steel", 3003).getInt(), Material.iron).setHardness(3.5F)
		.setResistance(22.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("steel").setCreativeTab(CreativeTabs.tabBlock);
		titan = new Blockyiwp(config.getBlock("Titanium_Block", 3004).getInt(), Material.iron).setHardness(5.0F)
		.setResistance(30.0F).setStepSound(soundMetalFootstep).setUnlocalizedName("titan").setCreativeTab(CreativeTabs.tabBlock);
		light = new LightBlock(config.getBlock("Light Block", 3005).getInt(), Material.glass).setHardness(2.8F)
		.setResistance(11.0F).setLightValue(1.0f).setLightOpacity(15).setUnlocalizedName("light").setCreativeTab(CreativeTabs.tabBlock);
		blackdirt = new Blockyiwp(config.getBlock("Blackened_Dirt", 3006).getInt(), Material.ground).setHardness(0.6F)
		.setStepSound(soundGrassFootstep).setUnlocalizedName("blackdirt").setCreativeTab(CreativeTabs.tabBlock);
		redgrass = new RedGrassBlock(config.getBlock("Red_Grass", 3007).getInt(), Material.grass).setHardness(0.5F)
		.setStepSound(soundGravelFootstep).setUnlocalizedName("redgrass").setTickRandomly(true).setCreativeTab(CreativeTabs.tabBlock);
		whitesand = new WhiteSand(config.getBlock("White_Sand", 3008).getInt(), Material.sand).setHardness(0.5F)
		.setStepSound(soundSandFootstep).setUnlocalizedName("whitesand").setCreativeTab(CreativeTabs.tabBlock);
		leaves_1 = new LeavesBlock(config.getBlock("Leaves", 3009).getInt()).setUnlocalizedName("leaves_1")
		.setTickRandomly(true).setCreativeTab(CreativeTabs.tabDecorations);
		bstone = new Blockyiwp(config.getBlock("BloodStone", 240).getInt(), Material.rock).setHardness(2.8F)
		.setResistance(11.0F).setUnlocalizedName("bstone").setCreativeTab(CreativeTabs.tabBlock);
		titanore = new YIWPOreBlock(config.getBlock("Ore", "Titanium_Ore", 241).getInt(), Material.rock)
		.setHardness(3.5F).setResistance(12.0F).setUnlocalizedName("titanore").setCreativeTab(CreativeTabs.tabBlock);
		steelore = new YIWPOreBlock(config.getBlock("Ore", "Nether_Steel", 242).getInt(), Material.rock).setHardness(3.2F)
		.setResistance(7.0F).setUnlocalizedName("steelore").setCreativeTab(CreativeTabs.tabBlock);
		lumen = new YIWPOreBlock(config.getBlock("Ore", "Lux_Ore", 243).getInt(), Material.rock).setHardness(2.0F)
		.setResistance(7.0F).setLightValue(0.7f).setLightOpacity(15).setUnlocalizedName("lumen").setCreativeTab(CreativeTabs.tabBlock);
		nlux = new YIWPOreBlock(config.getBlock("Ore", "NetherLux_Ore", 244).getInt(), Material.rock)
		.setHardness(2.0F).setResistance(7.0F).setLightValue(0.6f).setLightOpacity(15).setUnlocalizedName("nlux").setCreativeTab(CreativeTabs.tabBlock);
		vibore = new YIWPOreBlock(config.getBlock("Ore", "Vibranium_Ore", 245).getInt(), Material.rock).setHardness(2.6F)
		.setResistance(9.5F).setUnlocalizedName("vibore").setCreativeTab(CreativeTabs.tabBlock);
		viles = new Blockyiwp(config.getBlock("Ore", "Vile_Stone", 246).getInt(), Material.rock).setHardness(3.1F).setResistance(11.0F)
		.setUnlocalizedName("viles").setCreativeTab(CreativeTabs.tabBlock);
				
	}
	
	public static void registerBlocks(GameRegistry registry){
		registry.registerBlock(pcobble, "pcobble");
		registry.registerBlock(woodboard, "pboard");
		registry.registerBlock(slag, "slag");
		registry.registerBlock(steel, "steel");
		registry.registerBlock(titan, "titan");
		registry.registerBlock(light, "light");
		registry.registerBlock(blackdirt, "blackdirt");
		registry.registerBlock(redgrass, "redgrass");
		registry.registerBlock(whitesand, "whitesand");
		registry.registerBlock(leaves_1, "leaves_1");		
		registry.registerBlock(titanore, "titanore");
		registry.registerBlock(steelore, "steelore");
		registry.registerBlock(lumen, "lumen");
		registry.registerBlock(nlux, "nlux");
		registry.registerBlock(vibore, "vibore");
		registry.registerBlock(viles, "viles");
		registry.registerBlock(bstone, "bstone");
	}
	
	public static void setNames(LanguageRegistry registry){
		registry.addName(pcobble, "Packed Cobble");
		registry.addName(woodboard, "Press Board");
		registry.addName(slag, "Slag Block");
		registry.addName(steel, "Steel");
		registry.addName(titan, "Titanium Block");
		registry.addName(light, "Light Block");
		registry.addName(blackdirt, "Blackened Dirt");
		registry.addName(redgrass, "Red Grass");
		registry.addName(whitesand, "White Sand");
		registry.addName(leaves_1, "Leaves");
		registry.addName(titanore, "Titanium Ore");
		registry.addName(steelore, "Steel Ore");
		registry.addName(lumen, "Lux Ore");
		registry.addName(nlux, "Lux Ore");
		registry.addName(vibore, "Vibranium Ore");
		registry.addName(viles, "Vile Stone");
		registry.addName(bstone, "BloodStone");
	}
}