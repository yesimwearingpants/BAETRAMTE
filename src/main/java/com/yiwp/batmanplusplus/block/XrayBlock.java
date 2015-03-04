package com.yiwp.batmanplusplus.block;

import com.yiwp.batmanplusplus.creativetab.BPPCreativeTab;
import com.yiwp.batmanplusplus.lib.config.ConfigurationHandler;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class XrayBlock extends ExtBlock{
	
    protected IIcon[] icons = new IIcon[16];
    private boolean shouldRenderSelectionBox = true;
    protected String folder;

    public XrayBlock(String location)
    {
        super(Material.glass, location);
        this.stepSound = soundTypeGlass;
        folder = location;
        setHardness(0.3F);
        this.setCreativeTab(BPPCreativeTab.INSTANCE);
    }

    // For FMP support
    public IIcon[] getIcons ()
    {
        return icons;
    }

    @Override
    public boolean isOpaqueCube ()
    {
        return false;
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
    public IIcon getIcon (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return par1IBlockAccess.getBlockMetadata(par2, par3, par4) == 15 ? icons[0] : getConnectedBlockTexture(par1IBlockAccess, par2, par3, par4, par5, icons);
    }

    public IIcon getConnectedBlockTexture (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5, IIcon[] icons)
    {
        if (ConfigurationHandler.connectedTexturesMode == false)
        {
            return icons[0];
        }

        boolean isOpenUp = false, isOpenDown = false, isOpenLeft = false, isOpenRight = false;

        switch (par5)
        {
        case 0:
            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4)))
            {
                isOpenDown = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4)))
            {
                isOpenUp = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1)))
            {
                isOpenLeft = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1)))
            {
                isOpenRight = true;
            }

            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[15];
            }
            else if (isOpenUp && isOpenDown && isOpenLeft)
            {
                return icons[11];
            }
            else if (isOpenUp && isOpenDown && isOpenRight)
            {
                return icons[12];
            }
            else if (isOpenUp && isOpenLeft && isOpenRight)
            {
                return icons[13];
            }
            else if (isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[14];
            }
            else if (isOpenDown && isOpenUp)
            {
                return icons[5];
            }
            else if (isOpenLeft && isOpenRight)
            {
                return icons[6];
            }
            else if (isOpenDown && isOpenLeft)
            {
                return icons[8];
            }
            else if (isOpenDown && isOpenRight)
            {
                return icons[10];
            }
            else if (isOpenUp && isOpenLeft)
            {
                return icons[7];
            }
            else if (isOpenUp && isOpenRight)
            {
                return icons[9];
            }
            else if (isOpenDown)
            {
                return icons[3];
            }
            else if (isOpenUp)
            {
                return icons[4];
            }
            else if (isOpenLeft)
            {
                return icons[2];
            }
            else if (isOpenRight)
            {
                return icons[1];
            }
            break;
        case 1:
            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4)))
            {
                isOpenDown = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4)))
            {
                isOpenUp = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1)))
            {
                isOpenLeft = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1)))
            {
                isOpenRight = true;
            }

            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[15];
            }
            else if (isOpenUp && isOpenDown && isOpenLeft)
            {
                return icons[11];
            }
            else if (isOpenUp && isOpenDown && isOpenRight)
            {
                return icons[12];
            }
            else if (isOpenUp && isOpenLeft && isOpenRight)
            {
                return icons[13];
            }
            else if (isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[14];
            }
            else if (isOpenDown && isOpenUp)
            {
                return icons[5];
            }
            else if (isOpenLeft && isOpenRight)
            {
                return icons[6];
            }
            else if (isOpenDown && isOpenLeft)
            {
                return icons[8];
            }
            else if (isOpenDown && isOpenRight)
            {
                return icons[10];
            }
            else if (isOpenUp && isOpenLeft)
            {
                return icons[7];
            }
            else if (isOpenUp && isOpenRight)
            {
                return icons[9];
            }
            else if (isOpenDown)
            {
                return icons[3];
            }
            else if (isOpenUp)
            {
                return icons[4];
            }
            else if (isOpenLeft)
            {
                return icons[2];
            }
            else if (isOpenRight)
            {
                return icons[1];
            }
            break;
        case 2:
            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4)))
            {
                isOpenDown = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4)))
            {
                isOpenUp = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4)))
            {
                isOpenLeft = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4)))
            {
                isOpenRight = true;
            }

            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[15];
            }
            else if (isOpenUp && isOpenDown && isOpenLeft)
            {
                return icons[13];
            }
            else if (isOpenUp && isOpenDown && isOpenRight)
            {
                return icons[14];
            }
            else if (isOpenUp && isOpenLeft && isOpenRight)
            {
                return icons[11];
            }
            else if (isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[12];
            }
            else if (isOpenDown && isOpenUp)
            {
                return icons[6];
            }
            else if (isOpenLeft && isOpenRight)
            {
                return icons[5];
            }
            else if (isOpenDown && isOpenLeft)
            {
                return icons[9];
            }
            else if (isOpenDown && isOpenRight)
            {
                return icons[10];
            }
            else if (isOpenUp && isOpenLeft)
            {
                return icons[7];
            }
            else if (isOpenUp && isOpenRight)
            {
                return icons[8];
            }
            else if (isOpenDown)
            {
                return icons[1];
            }
            else if (isOpenUp)
            {
                return icons[2];
            }
            else if (isOpenLeft)
            {
                return icons[4];
            }
            else if (isOpenRight)
            {
                return icons[3];
            }
            break;
        case 3:
            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4)))
            {
                isOpenDown = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4)))
            {
                isOpenUp = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 - 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4)))
            {
                isOpenLeft = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2 + 1, par3, par4), par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4)))
            {
                isOpenRight = true;
            }

            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[15];
            }
            else if (isOpenUp && isOpenDown && isOpenLeft)
            {
                return icons[14];
            }
            else if (isOpenUp && isOpenDown && isOpenRight)
            {
                return icons[13];
            }
            else if (isOpenUp && isOpenLeft && isOpenRight)
            {
                return icons[11];
            }
            else if (isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[12];
            }
            else if (isOpenDown && isOpenUp)
            {
                return icons[6];
            }
            else if (isOpenLeft && isOpenRight)
            {
                return icons[5];
            }
            else if (isOpenDown && isOpenLeft)
            {
                return icons[10];
            }
            else if (isOpenDown && isOpenRight)
            {
                return icons[9];
            }
            else if (isOpenUp && isOpenLeft)
            {
                return icons[8];
            }
            else if (isOpenUp && isOpenRight)
            {
                return icons[7];
            }
            else if (isOpenDown)
            {
                return icons[1];
            }
            else if (isOpenUp)
            {
                return icons[2];
            }
            else if (isOpenLeft)
            {
                return icons[3];
            }
            else if (isOpenRight)
            {
                return icons[4];
            }
            break;
        case 4:
            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4)))
            {
                isOpenDown = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4)))
            {
                isOpenUp = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1)))
            {
                isOpenLeft = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1)))
            {
                isOpenRight = true;
            }

            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[15];
            }
            else if (isOpenUp && isOpenDown && isOpenLeft)
            {
                return icons[14];
            }
            else if (isOpenUp && isOpenDown && isOpenRight)
            {
                return icons[13];
            }
            else if (isOpenUp && isOpenLeft && isOpenRight)
            {
                return icons[11];
            }
            else if (isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[12];
            }
            else if (isOpenDown && isOpenUp)
            {
                return icons[6];
            }
            else if (isOpenLeft && isOpenRight)
            {
                return icons[5];
            }
            else if (isOpenDown && isOpenLeft)
            {
                return icons[10];
            }
            else if (isOpenDown && isOpenRight)
            {
                return icons[9];
            }
            else if (isOpenUp && isOpenLeft)
            {
                return icons[8];
            }
            else if (isOpenUp && isOpenRight)
            {
                return icons[7];
            }
            else if (isOpenDown)
            {
                return icons[1];
            }
            else if (isOpenUp)
            {
                return icons[2];
            }
            else if (isOpenLeft)
            {
                return icons[3];
            }
            else if (isOpenRight)
            {
                return icons[4];
            }
            break;
        case 5:
            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 - 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 - 1, par4)))
            {
                isOpenDown = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3 + 1, par4), par1IBlockAccess.getBlockMetadata(par2, par3 + 1, par4)))
            {
                isOpenUp = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 - 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1)))
            {
                isOpenLeft = true;
            }

            if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4, par1IBlockAccess.getBlock(par2, par3, par4 + 1), par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1)))
            {
                isOpenRight = true;
            }

            if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[15];
            }
            else if (isOpenUp && isOpenDown && isOpenLeft)
            {
                return icons[13];
            }
            else if (isOpenUp && isOpenDown && isOpenRight)
            {
                return icons[14];
            }
            else if (isOpenUp && isOpenLeft && isOpenRight)
            {
                return icons[11];
            }
            else if (isOpenDown && isOpenLeft && isOpenRight)
            {
                return icons[12];
            }
            else if (isOpenDown && isOpenUp)
            {
                return icons[6];
            }
            else if (isOpenLeft && isOpenRight)
            {
                return icons[5];
            }
            else if (isOpenDown && isOpenLeft)
            {
                return icons[9];
            }
            else if (isOpenDown && isOpenRight)
            {
                return icons[10];
            }
            else if (isOpenUp && isOpenLeft)
            {
                return icons[7];
            }
            else if (isOpenUp && isOpenRight)
            {
                return icons[8];
            }
            else if (isOpenDown)
            {
                return icons[1];
            }
            else if (isOpenUp)
            {
                return icons[2];
            }
            else if (isOpenLeft)
            {
                return icons[4];
            }
            else if (isOpenRight)
            {
                return icons[3];
            }
            break;
        }

        return icons[0];
    }

    @Override
    public boolean shouldSideBeRendered (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        Block b = par1IBlockAccess.getBlock(par2, par3, par4);
        return b == (Block) this ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int par1, int par2)
    {
        return icons[0];
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool (World par1World, int par2, int par3, int par4)
    {
        if (shouldRenderSelectionBox)
        {
            return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
        }
        else
        {
            return AxisAlignedBB.getBoundingBox(0D, 0D, 0D, 0D, 0D, 0D);
        }
    }

    @Override
    public void registerBlockIcons (IIconRegister par1IconRegister)
    {
        icons[0] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder);
        icons[1] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_1");
        icons[2] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_2");
        icons[3] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_3");
        icons[4] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_4");
        icons[5] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_5");
        icons[6] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_6");
        icons[7] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_7");
        icons[8] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_8");
        icons[9] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_9");
        icons[10] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_10");
        icons[11] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_11");
        icons[12] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_12");
        icons[13] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_13");
        icons[14] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_14");
        icons[15] = par1IconRegister.registerIcon(Reference.MODID + ":glass/" + folder + "/" + folder + "_15");
    }

    @Override
    public boolean canPlaceTorchOnTop (World world, int x, int y, int z)
    {
        return true;
    }
}