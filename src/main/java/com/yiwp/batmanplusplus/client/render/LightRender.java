package com.yiwp.batmanplusplus.client.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

import com.yiwp.batmanplusplus.init.BlockInit;
import com.yiwp.batmanplusplus.proxy.BPPProxyClient;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class LightRender implements ISimpleBlockRenderingHandler {

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {

	}

	@Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
                    Block block, int modelId, RenderBlocks renderer) {
           
            //which render pass are we doing?
            if(BPPProxyClient.renderPass == 0) {
                                                             
            }else { //we are on the alpha render pass
            	renderer.renderStandardBlock(BlockInit.BlockLight, x, y, z);
            }
           
            return true;
    }

	@Override
	public int getRenderId() {
		return BPPProxyClient.lightRender;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		// TODO Auto-generated method stub
		return false;
	}

}
