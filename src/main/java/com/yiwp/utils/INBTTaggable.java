package com.yiwp.utils;

import net.minecraft.nbt.NBTTagCompound;
public interface INBTTaggable
{
void readFromNBT(NBTTagCompound nbtTagCompound);
void writeToNBT(NBTTagCompound nbtTagCompound);
String getTagLabel();
}