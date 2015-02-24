package com.yiwp.batmanplusplus.block.itemblock;

import java.util.List;

import com.yiwp.batmanplusplus.lib.reference.Names;

import mantle.blocks.abstracts.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class LuxItemBlock extends MultiItemBlock{

	private final static String[] textureNames = new String[] {Names.Glass.lux + "Lamp", Names.Glass.lux + "X-Ray"};
	
	public LuxItemBlock(Block b) {
		super(b, "glass", textureNames);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	@Override
    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        if (stack.hasTagCompound() && stack.getItemDamage() == 0)
        {
            NBTTagCompound contentTags = stack.getTagCompound().getCompoundTag("Contents");
            if (contentTags != null)
            {
                ItemStack contents = ItemStack.loadItemStackFromNBT(contentTags);
                if (contents != null)
                {
                    list.add("Inventory: " + contents.getDisplayName());
                    list.add("Amount: " + contents.stackSize);
                }
            }
            NBTTagCompound camoTag = stack.getTagCompound().getCompoundTag("Camoflauge");
            if (camoTag != null)
            {
                ItemStack camo = ItemStack.loadItemStackFromNBT(camoTag);
                if (camo != null)
                    list.add("Camoflauge: " + camo.getDisplayName());
            }

            if (stack.getTagCompound().hasKey("Placement"))
            {
                String string = getDirectionString(stack.getTagCompound().getByte("Placement"));
                list.add("Placement Direction: " + string);
            }
        }
    }

    String getDirectionString (byte key)
    {
        if (key == 0)
            return ("Up");
        if (key == 1)
            return ("Right");
        if (key == 2)
            return ("Down");

        return "Left";
    }
}