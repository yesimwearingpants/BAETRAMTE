package com.yiwp.batmanplusplus.lib.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import scala.collection.generic.BitOperations.Int;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import com.yiwp.batmanplusplus.lib.config.ConfigurationHandler;

public class BlockHelper {

	private static List<String> list0 = ConfigurationHandler.blocks;
	private static List<String> list1Copy;
	
	public static boolean disjoint(String[] array) {
		try {
			List<String> list1 = new ArrayList<String>();
			for(String x: array)
				list1.add(x);
			return Collections.disjoint(list0, list1);
		} catch(Exception e) {
			LogHelper.fatal(e);
			return true;
		}
	}
	
	public static void newArray(String[] array, String[] retrn) {
		List<String> list1 = new ArrayList<String>();
		Collections.copy(list1Copy, list1);
		for(String x: array)
			list1.add(x);
		editNameList(list1, list0);
		retrn = list1.toArray(new String[list1.size()]);
	}
	
	public static void newArray(float[] array, float[] retrn) {
		List<Float> list2 = new ArrayList<Float>();
		for(float y: array)
			list2.add(y);
		editPropertyList(list1Copy, list0, list2);
		retrn = new float[list2.size()];
		int i = 0;
		for(Float f : list2) {
			retrn[i++] = (f != null ? f : Float.NaN);
		}
		list1Copy = null;
	}
	
	public static void newArray(int[] array, int[] retrn) {
		List<Integer> list3 = new ArrayList<Integer>();
		for(int z: array)
			list3.add(z);
		editProperty2List(list1Copy, list0, list3);
		retrn = new int[list3.size()];
		int i = 0;
		for(Integer j : list3) {
			retrn[i++] = (j != null ? j : Integer.MIN_VALUE);
		}
		list1Copy = null;
	}
	
	private static void editNameList(Collection<String> l1, Collection<String> l2) {
		Iterator<String> iter = l1.iterator();
		while(iter.hasNext()) {
			if(l2.contains(iter.next())) {
				iter.remove();
			}
		}
	}
	
	private static void editPropertyList(List<String> l1, List<String> l2, List<Float> l3) {
		ListIterator<String> iter0 = l1.listIterator();
		ListIterator<Float> iter1 = l3.listIterator();
		while(iter0.hasNext()) {
			if(l2.contains(iter0.next())) {
				iter1.remove();
			}
		}
	}
	
	private static void editProperty2List(List<String> l1, List<String> l2, List<Integer> l3) {
		ListIterator<String> iter0 = l1.listIterator();
		ListIterator<Integer> iter1 = l3.listIterator();
		while(iter0.hasNext()) {
			if(l2.contains(iter0.next())) {
				iter1.remove();
			}
		}
	}

	public void registerBlockIcons(String modid, Block block, IIconRegister register) {
		// TODO Auto-generated method stub
		
	}

	public void registerSubBlocks(Block block, CreativeTabs tabs, List<ItemStack> list) {
		// TODO Auto-generated method stub
		
	}

	public IIcon getIcon(int side, int metadata) {
		// TODO Auto-generated method stub
		return null;
	}

	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//A commit A Day, Keeps The Mobs At Bay

}
