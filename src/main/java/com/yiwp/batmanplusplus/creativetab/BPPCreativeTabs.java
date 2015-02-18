/*
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
 */

package com.yiwp.batmanplusplus.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BPPCreativeTabs {

    public static CreativeTabs INSTANCE;

    static {

        INSTANCE = new BPPCreativeTab("tabbatman", true) {

            @Override
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return null;
            }

            @Override
            @SideOnly(Side.CLIENT)
            public ItemStack getIconItemStack() {
            	return new ItemStack(Blocks.stone);
            }
        };
    }

    private static abstract class BPPCreativeTab extends CreativeTabs {

        private boolean searchbar = false;

        public BPPCreativeTab(String label) {

            super(label);
        }

        public BPPCreativeTab(String label, boolean searchbar) {

            this(label);
            this.searchbar = searchbar;
        }

        @Override
        public boolean hasSearchBar() {

            return searchbar;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getBackgroundImageName() {

            return searchbar ? "item_search.png" : super.getBackgroundImageName();
        }

        @Override
        public int getSearchbarWidth() {

            return 62;
        }

    }
}
