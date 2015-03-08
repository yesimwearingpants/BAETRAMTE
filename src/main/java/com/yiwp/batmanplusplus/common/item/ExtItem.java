package com.yiwp.batmanplusplus.common.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//import tconstruct.library.TConstructRegistry;
import net.minecraft.util.MathHelper;

import com.yiwp.batmanplusplus.common.creativetab.BPPCreativeTab;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class ExtItem extends Item {
	
	private static String pre = "item";
	private static String[] textureNames;
	
	public ExtItem(String prefix) {
		super();
		this.maxStackSize = 64;
		this.setCreativeTab(BPPCreativeTab.INSTANCE);
		pre = prefix;
	}
	
	public ExtItem(String prefix, String[] unlocal) {
		super();
		this.maxStackSize = 64;
		this.setCreativeTab(BPPCreativeTab.INSTANCE);
		pre = prefix;
		textureNames = unlocal;
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format(pre + ".%s", Reference.MODID + ":");
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int i = MathHelper.clamp_int(itemStack.getItemDamage(), 0, textureNames.length);
		return String.format(getUnlocalizedName() + "%s", textureNames[i]);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	public static class BPPItem extends ExtItem{
		
		public BPPItem(String prefix, String unlocal) {
			super(prefix);
		}		
	}
	
}