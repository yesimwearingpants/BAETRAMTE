package com.yiwp.batmanplusplus.common.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;
import com.yiwp.batmanplusplus.lib.utils.TextureHelper;
import com.yiwp.batmanplusplus.proxy.BPPProxyClient;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class XrayBlock extends ExtBlock {

	public TextureHelper textureHelper;
	private String textureName;
	@SideOnly(Side.CLIENT)
	private IIcon icons;

	public XrayBlock() {
		super(Material.glass);
		setLightLevel(1.0f);
		textureHelper = new TextureHelper();
	}

	public IIcon getGlowTexture() {
		return icons;
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
    public void registerBlockIcons (IIconRegister register) {
		textureHelper.registerBlockIcons(Reference.MODID, this, register);
    }
    
	@Override
	public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
		textureHelper.registerSubBlocks(this, tabs, list);
	}
	    
	@Override
	public IIcon getIcon(int side, int metadata) {
		return textureHelper.getIcon(side, metadata);
	}

	@Override
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		return textureHelper.getIcon(world, x, y, z, side);
	}

	@Override
	public int damageDropped(int i) {
		return i;
	}

}