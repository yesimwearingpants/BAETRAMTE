package com.yiwp.batmanplusplus.common.block;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public interface IBlock {
	
	public float getBlockHardness(World world, int x, int y, int z);

	public float getExplosionResistance(Entity entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ);

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister);
    
	public void getSubBlocks (Item block, CreativeTabs tab, List list);

    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta);

    public int damageDropped (int meta);
    
	void initArrays();

}
