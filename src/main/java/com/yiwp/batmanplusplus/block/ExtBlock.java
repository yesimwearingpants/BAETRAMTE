package com.yiwp.batmanplusplus.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

import com.yiwp.batmanplusplus.creativetab.BPPCreativeTab;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class ExtBlock extends Block {
	
	//Metadata
	public ExtBlock(Material material) {
		super(material);
		this.setBlockName(Reference.MODID + ":");
		this.setCreativeTab(BPPCreativeTab.INSTANCE);
	}

	//Non-Metadata
	public ExtBlock(Material material, String tex) {
		super(material);
		this.setCreativeTab(BPPCreativeTab.INSTANCE);
		this.setBlockName(Reference.MODID + ":" + Names.Textures.block(tex));
		this.setBlockTextureName(Names.Textures.block(tex));
	}

	@SideOnly(Side.CLIENT)
    public int getSideTextureIndex (int side) {
        if (side == 0)
            return 2;
        if (side == 1)
            return 0;

        return 1;
    }
	
	public static class ExtBreakable extends ExtBlock {
		
		private static String[] textureNames;
		private boolean alpha;
	    
		protected ExtBreakable(Material material, boolean bool) {
			super(material);
			this.setCreativeTab(BPPCreativeTab.INSTANCE);
	        this.alpha = bool;
		}
		
		protected ExtBreakable(Material material, boolean bool, String[] tex) {
			super(material);
			this.setCreativeTab(BPPCreativeTab.INSTANCE);
			this.setBlockName(Reference.MODID + ":");
			this.textureNames = tex;
			this.alpha = bool;
		}
		
		

	    /**
	     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	     */
	    public boolean isOpaqueCube()
	    {
	        return false;
	    }

	    /**
	     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
	     * coordinates.  Args: blockAccess, x, y, z, side
	     */
	    @SideOnly(Side.CLIENT)
	    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
	    {
	        Block block = world.getBlock(x, y, z);

	        if (this == Blocks.glass)
	        {
	            if (world.getBlockMetadata(x, y, z) != world.getBlockMetadata(x - Facing.offsetsXForSide[side], y - Facing.offsetsYForSide[side], z - Facing.offsetsZForSide[side]))
	            {
	                return true;
	            }

	            if (block == this)
	            {
	                return false;
	            }
	        }

	        return !this.alpha && block == this ? false : super.shouldSideBeRendered(world, x, y, z, side);
	    }
	}
    
}
