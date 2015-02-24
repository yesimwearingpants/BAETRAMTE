package com.yiwp.batmanplusplus.lib.reference;

public class Reference {

    public static final String NAME = "Batman++";
    public static final String MODID = "batmanplusplus";
    public static final String VERSION = "1.7.10-" + "@VERSION@";
    public static final String BUILD = "0";
    public static final String INSTANCE = MODID;
    public static final String CLIENT = "com.yiwp.batmanplusplus.proxy.BPPProxyClient";
    public static final String SERVER = "com.yiwp.batmanplusplus.proxy.BPPProxyServer";
    public static final String GUIFACTORY = "com.yiwp.batmanplusplus.client.gui.GuiFactory";
    public static final String DEPENDENCIES = "required-after:TConstruct;required-after:Forge@[10.13,);"
    		+ "required-after:Mantle;after:ThermalFoundation,ThermalExpansion,NotEnoughItems;"
    		+ "after:MineFactoryReloaded;after:Thaumcraft;after:Railcraft;after:appliedenergistics2;after:BuildCraft|Core";
    
    public static final String CREATIVETAB = "PNG.png";
    
}
