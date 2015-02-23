package yesiwearpants.compressionmod.handler;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import yesiwearpants.compressionmod.Reference;
import yesiwearpants.compressionmod.tool.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ToolHandler {
	
	public static EnumToolMaterial COMP = EnumHelper.addToolMaterial("COMP", 2, 768, 4.0f, 1.5f, 18);
    public static EnumToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 3, 1536, 5.0f, 2.75f, 22);
    public static EnumToolMaterial TITAN = EnumHelper.addToolMaterial("TITAN", 4, 1536, 6.0f, 4.0f, 28);
    public static EnumToolMaterial ADAMANTIUM = EnumHelper.addToolMaterial("ADAMANTIUM", 4, 4096, 7.0f, 6.0f, 32);
    public static EnumArmorMaterial CARBON = EnumHelper.addArmorMaterial("CARBON", 100, new int[] { 25, 25, 25, 25}, 24);
	
	public static Block pcobble;
	public static Block woodboard;
	
	public static Item csword;
	public static Item caxe;	
	public static Item cpick;
	public static Item cspade;
	public static Item choe;
	public static Item ssword;
	public static Item saxe;	
	public static Item spick;
	public static Item sspade;
	public static Item shoe;
	public static Item tsword;
	public static Item taxe;	
	public static Item tpick;
	public static Item tspade;
	public static Item thoe;
	public static Item asword;
	public static Item aaxe;
	public static Item apick;
	public static Item aspade;
	public static Item ahoe;
	public static Item cahelmet;
	public static Item cachest;
	public static Item caleggings;
	public static Item caboots;
		

	public static void setBockHarvestLevel(MinecraftForge mcforge){
		mcforge.setBlockHarvestLevel(pcobble, "pickaxe", 1);
		mcforge.setBlockHarvestLevel(woodboard, "axe", 1);
	}
	
	public static void configureTools(Configuration config) {
		
		//Tool
		csword = new ItemYSword(config.getItem("Tools", "Compressed_Sword", 20000).getInt(), COMP)
		.setUnlocalizedName("csword").setCreativeTab(CreativeTabs.tabCombat);
		caxe = new ItemYAxe(config.getItem("Tools", "Compressed_Axe", 20001).getInt(), COMP)
		.setUnlocalizedName("caxe").setCreativeTab(CreativeTabs.tabTools);
		cpick = new ItemYPickaxe(config.getItem("Tools", "Compressed_Pickaxe", 20002).getInt(), COMP)
		.setUnlocalizedName("cpick").setCreativeTab(CreativeTabs.tabTools);
		cspade = new ItemYSpade(config.getItem("Tools", "Compressed_Spade", 20003).getInt(), COMP)
		.setUnlocalizedName("cspade").setCreativeTab(CreativeTabs.tabTools);
		choe = new ItemYHoe(config.getItem("Tools", "Compressed_Hoe", 20004).getInt(), COMP)
		.setUnlocalizedName("choe").setCreativeTab(CreativeTabs.tabTools);
		ssword = new ItemYSword(config.getItem("Tools", "Steel_Sword", 20005).getInt(), STEEL)
		.setUnlocalizedName("ssword").setCreativeTab(CreativeTabs.tabCombat);
		saxe = new ItemYAxe(config.getItem("Tools", "Steel_Axe", 20006).getInt(), STEEL)
		.setUnlocalizedName("saxe").setCreativeTab(CreativeTabs.tabTools);
		spick = new ItemYPickaxe(config.getItem("Tools", "Steel_Pickaxe", 20007).getInt(), STEEL)
		.setUnlocalizedName("spick").setCreativeTab(CreativeTabs.tabTools);
		sspade = new ItemYSpade(config.getItem("Tools", "Steel_Spade", 20008).getInt(), STEEL)
		.setUnlocalizedName("sspade").setCreativeTab(CreativeTabs.tabTools);
		shoe = new ItemYHoe(config.getItem("Tools", "Steel_Hoe", 20009).getInt(), STEEL)
		.setUnlocalizedName("shoe").setCreativeTab(CreativeTabs.tabTools);
		tsword = new ItemYSword(config.getItem("Tools", "Titanium_Sword", 20010).getInt(), TITAN)
		.setUnlocalizedName("tsword").setCreativeTab(CreativeTabs.tabCombat);
		taxe = new ItemYAxe(config.getItem("Tools", "Titanium_Axe", 20011).getInt(), TITAN)
		.setUnlocalizedName("taxe").setCreativeTab(CreativeTabs.tabTools);
		tpick = new ItemYPickaxe(config.getItem("Tools", "Titanium_Pickaxe", 20012).getInt(), TITAN)
		.setUnlocalizedName("tpick").setCreativeTab(CreativeTabs.tabTools);
		tspade = new ItemYSpade(config.getItem("Tools", "Titanium_Spade", 20013).getInt(), TITAN)
		.setUnlocalizedName("tspade").setCreativeTab(CreativeTabs.tabTools);
		thoe = new ItemYHoe(config.getItem("Tools", "Titanium_Hoe", 20014).getInt(), TITAN)
		.setUnlocalizedName("thoe").setCreativeTab(CreativeTabs.tabTools);
		asword = new ItemASword(config.getItem("Tools", "Adamantium_Sword", 20015).getInt(), ADAMANTIUM)
		.setUnlocalizedName("asword").setCreativeTab(CreativeTabs.tabCombat);
		aaxe = new ItemAAxe(config.getItem("Tools", "Adamantium_Axe", 20016).getInt(), ADAMANTIUM)
		.setUnlocalizedName("aaxe").setCreativeTab(CreativeTabs.tabTools);
		apick = new ItemAPickaxe(config.getItem("Tools", "Adamantium_Pickaxe", 20017).getInt(), ADAMANTIUM)
		.setUnlocalizedName("apick").setCreativeTab(CreativeTabs.tabTools);
		aspade = new ItemASpade(config.getItem("Tools", "Adamantium_Spade", 20018).getInt(), ADAMANTIUM)
		.setUnlocalizedName("aspade").setCreativeTab(CreativeTabs.tabTools);
		ahoe = new ItemAHoe(config.getItem("Tools", "Adamantium_Hoe", 20019).getInt(), ADAMANTIUM)
		.setUnlocalizedName("ahoe").setCreativeTab(CreativeTabs.tabTools);
		
		//Armour
		cahelmet = new CAArmor(config.getItem("Armour", "Carbonadium_Helmet", 20020).getInt(), CARBON, 0, 0, "ca")
		.setCreativeTab(CreativeTabs.tabCombat);
		cachest = new CAArmor(config.getItem("Armour", "Carbonadium_ChestPlate", 20021).getInt(), CARBON, 0, 1, "ca")
		.setCreativeTab(CreativeTabs.tabCombat);
		caleggings = new CAArmor(config.getItem("Armour", "Carbonadium_Leggings", 20022).getInt(), CARBON, 0, 2, "ca").setCreativeTab(CreativeTabs.tabCombat);
		caboots = new CAArmor(config.getItem("Armour", "Carbonadium_Boots", 20023).getInt(), CARBON, 0, 3, "ca").setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public static void registerItems(GameRegistry registry) {
		registry.registerItem(csword, "csword");
		registry.registerItem(caxe, "caxe");
		registry.registerItem(cpick, "cpick");
		registry.registerItem(cspade, "cspade");
		registry.registerItem(choe, "choe");
		registry.registerItem(ssword, "ssword");
		registry.registerItem(saxe, "saxe");
		registry.registerItem(spick, "spick");
		registry.registerItem(sspade, "sspade");
		registry.registerItem(shoe, "shoe");
		registry.registerItem(tsword, "tsword");
		registry.registerItem(taxe, "taxe");
		registry.registerItem(tpick, "tpick");
		registry.registerItem(tspade, null, Reference.MOD_ID);
		registry.registerItem(thoe, "thoe");
		registry.registerItem(asword, "asword");
		registry.registerItem(aaxe, "aaxe");
		registry.registerItem(apick, "apick");
		registry.registerItem(aspade, "aspade");
		registry.registerItem(ahoe, "ahoe");
				
	}
	
	public static void setNames(LanguageRegistry registry) {
		registry.addName(csword, "Compressed Sword");
		registry.addName(caxe, "Compressed Axe");
		registry.addName(cpick, "Compressed Pickaxe");
		registry.addName(cspade, "Compressed Shovel");
		registry.addName(choe, "Compressed Hoe");
		registry.addName(ssword, "Steel Sword");
		registry.addName(saxe, "Steel Axe");
		registry.addName(spick, "Steel Pickaxe");
		registry.addName(sspade, "Steel Shovel");
		registry.addName(shoe, "Steel Hoe");
		registry.addName(tsword, "Titanium Sword");
		registry.addName(taxe, "Titanium Axe");
		registry.addName(tpick, "Titanium Pickaxe");
		registry.addName(tspade, "Titanium Shovel");
		registry.addName(thoe, "Titanium Hoe");
		registry.addName(asword, "Adamantium Sword");
		registry.addName(aaxe, "Adamantium Axe");
		registry.addName(apick, "Adamantium Pickaxe");
		registry.addName(aspade, "Adamantium Shovel");
		registry.addName(ahoe, "Adamantium Hoe");
		
		
	}
}
