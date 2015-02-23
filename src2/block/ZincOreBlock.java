package yesiwearpants.compressionmod.block;

import yesiwearpants.compressionmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ZincOreBlock extends Block{

	public ZincOreBlock(int id, Material material) {
        super(id, material);
    }
	
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
    	this.blockIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
