package com.yiwp.batmanplusplus.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//import tconstruct.library.TConstructRegistry;


import com.yiwp.batmanplusplus.creativetab.BPPCreativeTab;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class BPPItem extends Item
{
public BPPItem()
{
	super();
	this.maxStackSize = 64;
	this.setCreativeTab(BPPCreativeTab.INSTANCE);

}
@Override
public String getUnlocalizedName()
{
return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
}
@Override
public String getUnlocalizedName(ItemStack itemStack)
{
return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
}
protected String getUnwrappedUnlocalizedName(String unlocalizedName)
{
return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
}
}