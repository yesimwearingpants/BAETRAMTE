package com.yiwp.creativetab;

/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 14, 2014, 5:20:53 PM (GMT)]
 * 
 * And Modified by <SomeNoNameModder>
 * 
 */

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.yiwp.block.MetalBlock;
import com.yiwp.item.BPPItem;
import com.yiwp.lib.reference.Reference;

public final class BPPCreativeTab extends CreativeTabs {

	public static BPPCreativeTab INSTANCE = new BPPCreativeTab();
	List list;

	public BPPCreativeTab() {
		super(Reference.MODID);
		setNoTitle();
		setBackgroundImageName(Reference.CREATIVETAB);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(MetalBlock.BlockTetsu);
	}

	@Override
	public Item getTabIconItem() {
		return getIconItemStack().getItem();
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public void displayAllReleventItems(List list) {
		this.list = list;

		Iterator iterator = BPPItem.itemRegistry.iterator();

        while (iterator.hasNext())   {
            BPPItem item = (BPPItem)iterator.next();

            if (item == null)    {
                continue;
                
            }
            if (BPPCreativeTab.INSTANCE == this)
            {
                item.getSubItems(item, this, list);
            }
        }
    }
		

	private void addItem(Item item) {
		item.getSubItems(item, this, list);
	}

	private void addBlock(Block block) {
		ItemStack stack = new ItemStack(block);
		block.getSubBlocks(stack.getItem(), this, list);
	}

}

