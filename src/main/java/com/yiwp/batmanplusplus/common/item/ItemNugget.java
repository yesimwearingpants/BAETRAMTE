package com.yiwp.batmanplusplus.common.item;

import java.util.List;

import com.yiwp.batmanplusplus.common.creativetab.BPPCreativeTab;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockLog;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.entity.player.BonemealEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNugget  extends ExtItem
{
    public static final String[] textureNames = new String[] {Names.Metal.molybdochalkos,
    	Names.Metal.orichalcum, Names.Metal.cactusSteel, Names.Metal.meteoricIron,
    	Names.Metal.tetsu, Names.Metal.titanium,Names.Metal.vibranium,
    	Names.Metal.adamantium, Names.Metal.titaniumAlumide};
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemNugget() {
    	super("nugget", textureNames);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(BPPCreativeTab.INSTANCE);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        int j = MathHelper.clamp_int(meta, 0, 8);
        return this.icons[j];
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < textureNames.length; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        this.icons = new IIcon[textureNames.length];

        for (int i = 0; i < textureNames.length; ++i)
        {
            this.icons[i] = icon.registerIcon(Reference.MODID + ":" + Names.Textures.nugget(textureNames[i]));
        }
    }
}