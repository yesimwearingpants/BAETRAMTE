package yesiwearpants.compressionmod.block;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class YIWPItemBlock extends ItemBlock {

	public YIWPItemBlock(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public int getMetadata(int par1) {
		return par1;
	}
}
