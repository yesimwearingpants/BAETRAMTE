package com.yiwp.batmanplusplus.init;

import com.yiwp.batmanplusplus.item.ExtItem;
import com.yiwp.batmanplusplus.item.ItemIngot;
import com.yiwp.batmanplusplus.item.ItemNugget;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ItemInit {
	
	public static final ExtItem ingot = new ItemIngot();
	public static final ExtItem nugget = new ItemNugget();

	public static void preInit() {
		
		GameRegistry.registerItem(ingot, "Ingot");
		GameRegistry.registerItem(nugget, "Nugget");
		
	}

}
