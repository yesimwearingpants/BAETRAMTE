package com.yiwp.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.yiwp.lib.config.ConfigurationHandler;
import com.yiwp.lib.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;

public class GuiConfiguration extends GuiConfig {

	public GuiConfiguration(GuiScreen parentScreen) {
		super(parentScreen, new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MODID, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
	}

}
