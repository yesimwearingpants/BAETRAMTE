package com.yiwp.batmanplusplus.block;

import net.minecraft.block.material.Material;

import com.yiwp.batmanplusplus.lib.reference.Names;

public class LuxOreBlock extends ExtBlock {
	
	public static final String[] textureNames = new String[] {Names.Glass.lux, "Nether"+ Names.Glass.lux};

	public LuxOreBlock() {
		super(Material.rock);
	}
	
	@Override
    public boolean isOpaqueCube ()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock ()
    {
        return false;
    }

    @Override
    public int getRenderBlockPass ()
    {
        return 1;
    }
	
}
