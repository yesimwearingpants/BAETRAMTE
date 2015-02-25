package com.yiwp.batmanplusplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.yiwp.batmanplusplus.lib.config.ConfigurationHandler;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class LuxBlock extends ExtBlock implements IBlock{
	
	private static final String[] textureNames = new String[] {Names.Glass.lux, Names.Glass.woodGlass, Names.Glass.copper,
		Names.Glass.bronze, Names.Glass.lux};
	protected IIcon[][] icons = new IIcon[textureNames.length][16];
    private boolean shouldRenderSelectionBox = true;
    protected String folder;
    private int renderPass;

    public LuxBlock(String location, boolean hasAlpha) {
        super(Material.glass);
        this.stepSound = soundTypeGlass;
        folder = location;
        renderPass = hasAlpha ? 1 : 0;
        setHardness(0.3F);
        this.setLightLevel(1.0f);
    }

    // For FMP support
    public IIcon[] getIcons (int side, int meta) {
        return icons[meta];
    }

    @Override
    public boolean isOpaqueCube () {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock () {
        return false;
    }

    @Override
    public int getRenderBlockPass () {
        return renderPass;
    }

    /**
     * This is checked to see if the texture should connect to this block
     * @param par2 x
     * @param par3 y
     * @param par4 z
     * @param par5 ID this block is asking to connect to (may be 0 if there is no block)
     * @param par6 Metadata of the block this block is trying to connect to
     * @return true if should connect
     */
    public boolean shouldConnectToBlock (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, Block par5, int par6)
    {
        return par5 == (Block) this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
    	for(int i = 0; i < textureNames.length; i++) {
        	return par1IBlockAccess.getBlockMetadata(par2, par3, par4) == 15 ? icons[i][0] : 
        		getConnectedBlockTexture(par1IBlockAccess, par2, par3, par4, par5, icons);
    	}
		return blockIcon;
    }

    public IIcon getConnectedBlockTexture (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5, IIcon[][] icons) {
    	for(int i = 0; i < textureNames.length; i++) {
	        if (ConfigurationHandler.connectedTexturesMode == false) {
	            return icons[i][0];
	        }
	
	        boolean isOpenUp = false, isOpenDown = false, isOpenLeft = false, isOpenRight = false;
	
	        switch (par5) {
	        case 0:
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) {
	                isOpenDown = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) {
	                isOpenUp = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) {
	                isOpenLeft = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) {
	                isOpenRight = true;
	            }
	            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][15];
	            }
	            else if (isOpenUp && isOpenDown && isOpenLeft) {
	                return icons[i][11];
	            }
	            else if (isOpenUp && isOpenDown && isOpenRight) {
	                return icons[i][12];
	            }
	            else if (isOpenUp && isOpenLeft && isOpenRight) {
	                return icons[i][13];
	            }
	            else if (isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][14];
	            }
	            else if (isOpenDown && isOpenUp) {
	                return icons[i][5];
	            }
	            else if (isOpenLeft && isOpenRight) {
	                return icons[i][6];
	            }
	            else if (isOpenDown && isOpenLeft) {
	                return icons[i][8];
	            }
	            else if (isOpenDown && isOpenRight) {
	                return icons[i][10];
	            }
	            else if (isOpenUp && isOpenLeft) {
	                return icons[i][7];
	            }
	            else if (isOpenUp && isOpenRight) {
	                return icons[i][9];
	            }
	            else if (isOpenDown) {
	                return icons[i][3];
	            }
	            else if (isOpenUp) {
	                return icons[i][4];
	            }
	            else if (isOpenLeft) {
	                return icons[i][2];
	            }
	            else if (isOpenRight) {
	                return icons[i][1];
	            }
	            break;
	        case 1:
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) {
	                isOpenDown = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) {
	                isOpenUp = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) {
	                isOpenLeft = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) {
	                isOpenRight = true;
	            }
	            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][15];
	            }
	            else if (isOpenUp && isOpenDown && isOpenLeft) {
	                return icons[i][11];
	            }
	            else if (isOpenUp && isOpenDown && isOpenRight) {
	                return icons[i][12];
	            }
	            else if (isOpenUp && isOpenLeft && isOpenRight) {
	                return icons[i][13];
	            }
	            else if (isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][14];
	            }
	            else if (isOpenDown && isOpenUp) {
	                return icons[i][5];
	            }
	            else if (isOpenLeft && isOpenRight) {
	                return icons[i][6];
	            }
	            else if (isOpenDown && isOpenLeft) {
	                return icons[i][8];
	            }
	            else if (isOpenDown && isOpenRight) {
	                return icons[i][10];
	            }
	            else if (isOpenUp && isOpenLeft) {
	                return icons[i][7];
	            }
	            else if (isOpenUp && isOpenRight) {
	                return icons[i][9];
	            }
	            else if (isOpenDown) {
	                return icons[i][3];
	            }
	            else if (isOpenUp) {
	                return icons[i][4];
	            }
	            else if (isOpenLeft) {
	                return icons[i][2];
	            }
	            else if (isOpenRight) {
	                return icons[i][1];
	            }
	            break;
	        case 2:
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4))) {
	                isOpenDown = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4))) {
	                isOpenUp = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) {
	                isOpenLeft = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) {
	                isOpenRight = true;
	            }
	            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][15];
	            }
	            else if (isOpenUp && isOpenDown && isOpenLeft) {
	                return icons[i][13];
	            }
	            else if (isOpenUp && isOpenDown && isOpenRight) {
	                return icons[i][14];
	            }
	            else if (isOpenUp && isOpenLeft && isOpenRight) {
	                return icons[i][11];
	            }
	            else if (isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][12];
	            }
	            else if (isOpenDown && isOpenUp) {
	                return icons[i][6];
	            }
	            else if (isOpenLeft && isOpenRight) {
	                return icons[i][5];
	            }
	            else if (isOpenDown && isOpenLeft) {
	                return icons[i][9];
	            }
	            else if (isOpenDown && isOpenRight) {
	                return icons[i][10];
	            }
	            else if (isOpenUp && isOpenLeft) {
	                return icons[i][7];
	            }
	            else if (isOpenUp && isOpenRight) {
	                return icons[i][8];
	            }
	            else if (isOpenDown) {
	                return icons[i][1];
	            }
	            else if (isOpenUp) {
	                return icons[i][2];
	            }
	            else if (isOpenLeft) {
	                return icons[i][4];
	            }
	            else if (isOpenRight) {
	                return icons[i][3];
	            }
	            break;
	        case 3:
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4))) {
	                isOpenDown = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4))) {
	                isOpenUp = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) {
	                isOpenLeft = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) {
	                isOpenRight = true;
	            }
	            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][15];
	            }
	            else if (isOpenUp && isOpenDown && isOpenLeft) {
	                return icons[i][14];
	            }
	            else if (isOpenUp && isOpenDown && isOpenRight) {
	                return icons[i][13];
	            }
	            else if (isOpenUp && isOpenLeft && isOpenRight) {
	                return icons[i][11];
	            }
	            else if (isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][12];
	            }
	            else if (isOpenDown && isOpenUp) {
	                return icons[i][6];
	            }
	            else if (isOpenLeft && isOpenRight) {
	                return icons[i][5];
	            }
	            else if (isOpenDown && isOpenLeft) {
	                return icons[i][10];
	            }
	            else if (isOpenDown && isOpenRight) {
	                return icons[i][9];
	            }
	            else if (isOpenUp && isOpenLeft) {
	                return icons[i][8];
	            }
	            else if (isOpenUp && isOpenRight) {
	                return icons[i][7];
	            }
	            else if (isOpenDown) {
	                return icons[i][1];
	            }
	            else if (isOpenUp) {
	                return icons[i][2];
	            }
	            else if (isOpenLeft) {
	                return icons[i][3];
	            }
	            else if (isOpenRight) {
	                return icons[i][4];
	            }
	            break;
	        case 4:
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4))) {
	                isOpenDown = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4))) {
	                isOpenUp = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) {
	                isOpenLeft = true;
	            }
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) {
	                isOpenRight = true;
	            }
	            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][15];
	            }
	            else if (isOpenUp && isOpenDown && isOpenLeft) {
	                return icons[i][14];
	            }
	            else if (isOpenUp && isOpenDown && isOpenRight) {
	                return icons[i][13];
	            }
	            else if (isOpenUp && isOpenLeft && isOpenRight) {
	                return icons[i][11];
	            }
	            else if (isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][12];
	            }
	            else if (isOpenDown && isOpenUp) {
	                return icons[i][6];
	            }
	            else if (isOpenLeft && isOpenRight) {
	                return icons[i][5];
	            }
	            else if (isOpenDown && isOpenLeft) {
	                return icons[i][10];
	            }
	            else if (isOpenDown && isOpenRight) {
	                return icons[i][9];
	            }
	            else if (isOpenUp && isOpenLeft) {
	                return icons[i][8];
	            }
	            else if (isOpenUp && isOpenRight) {
	                return icons[i][7];
	            }
	            else if (isOpenDown) {
	                return icons[i][1];
	            }
	            else if (isOpenUp) {
	                return icons[i][2];
	            }
	            else if (isOpenLeft) {
	                return icons[i][3];
	            }
	            else if (isOpenRight) {
	                return icons[i][4];
	            }
	            break;
	        case 5:
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4))) {
	                isOpenDown = true;
	            }
	
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4))) {
	                isOpenUp = true;
	            }
	
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) {
	                isOpenLeft = true;
	            }
	
	            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock
	            		(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) {
	                isOpenRight = true;
	            }
	
	            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][15];
	            }
	            else if (isOpenUp && isOpenDown && isOpenLeft) {
	                return icons[i][13];
	            }
	            else if (isOpenUp && isOpenDown && isOpenRight) {
	                return icons[i][14];
	            }
	            else if (isOpenUp && isOpenLeft && isOpenRight) {
	                return icons[i][11];
	            }
	            else if (isOpenDown && isOpenLeft && isOpenRight) {
	                return icons[i][12];
	            }
	            else if (isOpenDown && isOpenUp) {
	                return icons[i][6];
	            }
	            else if (isOpenLeft && isOpenRight) {
	                return icons[i][5];
	            }
	            else if (isOpenDown && isOpenLeft) {
	                return icons[i][9];
	            }
	            else if (isOpenDown && isOpenRight) {
	                return icons[i][10];
	            }
	            else if (isOpenUp && isOpenLeft) {
	                return icons[i][7];
	            }
	            else if (isOpenUp && isOpenRight) {
	                return icons[i][8];
	            }
	            else if (isOpenDown) {
	                return icons[i][1];
	            }
	            else if (isOpenUp) {
	                return icons[i][2];
	            }
	            else if (isOpenLeft) {
	                return icons[i][4];
	            }
	            else if (isOpenRight) {
	                return icons[i][3];
	            }
	            break;
	        }
	
	        return icons[i][0];
	    }
		return blockIcon;
    }

    @Override
    public boolean shouldSideBeRendered (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        Block b = par1IBlockAccess.getBlock(par2, par3, par4);
        return b == (Block) this ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta) {
        return icons[meta][0];
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool (World par1World, int par2, int par3, int par4) {
        if (shouldRenderSelectionBox) {
            return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
        } else {
            return AxisAlignedBB.getBoundingBox(0D, 0D, 0D, 0D, 0D, 0D);
        }
    }

    @Override
    public void registerBlockIcons (IIconRegister par1IconRegister) {
    	for (int i = 0; i < textureNames.length; ++i) {
	        icons[i][0] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i]);
	        icons[i][1] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_1");
	        icons[i][2] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_2");
	        icons[i][3] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_3");
	        icons[i][4] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_4");
	        icons[i][5] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_5");
	        icons[i][6] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_6");
	        icons[i][7] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_7");
	        icons[i][8] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_8");
	        icons[i][9] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_9");
	        icons[i][10] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_10");
	        icons[i][11] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_11");
	        icons[i][12] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_12");
	        icons[i][13] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_13");
	        icons[i][14] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_14");
	        icons[i][15] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + textureNames[i] + "_15");
    	}
    }

    @Override
    public boolean canPlaceTorchOnTop (World world, int x, int y, int z) {
        return true;
    }
}