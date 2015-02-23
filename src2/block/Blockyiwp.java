package yesiwearpants.compressionmod.block;

import yesiwearpants.compressionmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Blockyiwp extends Block{

	public Blockyiwp(int id, Material material) {
        super(id, material);
    }
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
    	this.blockIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    	
    	icons = new Icon[7];
		for(int i = 0; i < icons.length; i++) {
			icons[1] = register.registerIcon(Reference.MOD_ID + ":" + (getUnlocalizedName().substring(5)) + i);
		}
    }

}
