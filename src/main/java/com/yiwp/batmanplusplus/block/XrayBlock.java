package com.yiwp.batmanplusplus.block;

import java.util.List;

import com.cricketcraft.chisel.Chisel;
import com.cricketcraft.chisel.block.BlockCarvable;
import com.cricketcraft.chisel.block.ExtBlock;
import com.yiwp.batmanplusplus.creativetab.BPPCreativeTab;
import com.yiwp.batmanplusplus.lib.config.ConfigurationHandler;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;
import com.yiwp.batmanplusplus.proxy.BPPProxyClient;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class XrayBlock extends ExtBlock {


	private String textureName;
	@SideOnly(Side.CLIENT)
	private IIcon icon;

	public XrayBlock() {
		super(Material.glass);
		setLightLevel(1.0f);
	}

	public IIcon getGlowTexture() {
		return icon;
	}

	@Override
	public int getRenderType() {
		return BPPProxyClient.lightRender;
	}
	
	@Override
    public boolean recolourBlock(World world, int x, int y, int z, ForgeDirection side, int color) {
        int newColor = 15 - color;
        if (world.getBlockMetadata(x, y, z) != newColor) {
            world.setBlockMetadataWithNotify(x, y, z, newColor, 3);
            return true;
        }
        return false;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister) {
		icon = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + Names.Textures.block(textureName));
    }
    
	@Override
	public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
		CarverHelper.registerSubBlocks(this, tabs, list);
	}
	    
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta) {
        return icons[meta];
    }

	@Override
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		return icons(world, x, y, z, side);
	}

	@Override
	public int damageDropped(int i) {
		return i;
	}

}