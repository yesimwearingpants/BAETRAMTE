package com.yiwp.batmanplusplus.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;
import com.yiwp.batmanplusplus.proxy.BPPProxyClient;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LightBlock extends ExtBlock{

	public LightBlock() {
        super(Material.cloth, "LuxLamp");
    }
	
	public boolean isOpaqueCube(){
		return false;
	}
		
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
    public int getRenderType()
	{
	    return BPPProxyClient.lightRender;
	}
	
	@Override
    public boolean canRenderInPass(int pass)
	{
		//Set the static var in the client proxy
		BPPProxyClient.renderPass = pass;
		//the block can render in both passes, so return true always
		return true;
	}
	
		@Override
    public int getRenderBlockPass()
	{
		return 1;
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + Names.Textures.block("LuxLamp"));
    }

}
