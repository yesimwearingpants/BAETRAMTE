package yesiwearpants.compressionmod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import yesiwearpants.compressionmod.Reference;
import yesiwearpants.compressionmod.handler.BlockHandler;
import yesiwearpants.compressionmod.handler.ItemHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class YIWPOreBlock extends Block{

	public YIWPOreBlock(Material material) {
        super(material);
    }

	public boolean isOpaqueCube() {
		if (this.block == BlockHandler.lumen) {
			return true;			
		}
		if (this.block == BlockHandler.nlux) {
			return true;
		}else {
		return false;
		}
	}
		
	public boolean renderAsNormalBlock() {
		if (this.block == BlockHandler.lumen) {
			return true;			
		}
		if (this.block == BlockHandler.nlux) {
			return true;
		}else {
		return false;
		}
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return this.blockID == BlockHandler.lumen.blockID ? ItemHandler.luxpowder : (this.blockID == BlockHandler.nlux 
		? ItemHandler.luxpowder :(this == BlockHandler.steelore ? ItemHandler.sore
		: (this.blockID == BlockHandler.titanore ? ItemHandler.tore : (this.block == BlockHandler.vibore 
		? ItemHandler.vore : this.blockRegistry))));
	}
	 public int quantityDropped(Random par1Random)
	{
		 return this.blockID == BlockHandler.lumen.blockID ? 1 + par1Random.nextInt(3) : (this.blockID == BlockHandler.nlux.blockID 
		 ? 1 + par1Random.nextInt(1) : (this.blockID == BlockHandler.steelore.blockID ? 3 + par1Random.nextInt(5) 
		 : (this.blockID == BlockHandler.titanore.blockID ? 1 + par1Random.nextInt(3) : (this.blockID == BlockHandler.vibore.blockID ? 1 : this.blockID))));
	}
	 
	public int getExpDrop(World world, int par2, int par3) {
		if (this.idDropped(par2, world.rand, par3) != this.blockID) {
		int xp = 0;
			 if (this.blockID == BlockHandler.lumen.blockID) {
				 xp = MathHelper.getRandomIntegerInRange(world.rand, 1, 3);
			 }
			 else if (this.blockID == BlockHandler.nlux.blockID) {
				 xp = MathHelper.getRandomIntegerInRange(world.rand, 1, 3);
			 }
			 else if (this.blockID == BlockHandler.steelore.blockID) {
				 xp = MathHelper.getRandomIntegerInRange(world.rand, 2, 4);
			 }
			 else if (this.blockID == BlockHandler.titanore.blockID) {
				 xp = MathHelper.getRandomIntegerInRange(world.rand, 2, 5);
			 }
			 else if (this.blockID == BlockHandler.vibore.blockID) {
				 xp = MathHelper.getRandomIntegerInRange(world.rand, 3, 7);
			 }
			 return xp;
		 }
		 return 0;
	 }
	 
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
    	this.blockIcon = register.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
