package com.yiwp.batmanplusplus.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class BPPProxyClient extends BPPProxyCommon {
	
	//public static int renderPass;	
	//public static int lightRender;
	
       
	@Override
	public void registerRenderers() {
		
		//lightRender = RenderingRegistry.getNextAvailableRenderId();
		//RenderingRegistry.registerBlockHandler(new LightRender());
	}

}
