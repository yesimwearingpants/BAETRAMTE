/**
 * This file is part of Blue Power.
 *
 *     Blue Power is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Blue Power is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Blue Power.  If not, see <http://www.gnu.org/licenses/>
 *     
 *     Modified By <SomeNoNameModder> 
 */

package com.yiwp.batmanplusplus.creativetab;

import com.yiwp.batmanplusplus.lib.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BPPCreativeTab extends CreativeTabs{

	public static final BPPCreativeTab INSTANCE = new BPPCreativeTab(Reference.NAME, true);
	private boolean search;

	public BPPCreativeTab(String label, boolean searchbar)
	{
		super(label);
        this.search = searchbar;
	}
	
	@Override
    public boolean hasSearchBar() {

        return search;
    }

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(Blocks.acacia_stairs, 1, 16);
	}

	@Override
	public String getTranslatedTabLabel()
	{
		return this.getTabLabel();
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public String getBackgroundImageName() {

        return search ? "item_search.png" : super.getBackgroundImageName();
    }

    @Override
    public int getSearchbarWidth() {

        return 62;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return null;
	}
}
