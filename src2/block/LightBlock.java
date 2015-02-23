package yesiwearpants.compressionmod.block;

import yesiwearpants.compressionmod.Reference;
import yesiwearpants.compressionmod.common.ClientProxy;
import yesiwearpants.compressionmod.handler.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LightBlock extends Block{

	public LightBlock(int id, Material material) {
        super(id, material);
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
	    return ClientProxy.lightRender;
	}
	
	@Override
    public boolean canRenderInPass(int pass)
	{
		//Set the static var in the client proxy
		ClientProxy.renderPass = pass;
		//the block can render in both passes, so return true always
		return true;
	}
	
		@Override
    public int getRenderBlockPass()
	{
		return 1;
	}

	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
    	this.blockIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
