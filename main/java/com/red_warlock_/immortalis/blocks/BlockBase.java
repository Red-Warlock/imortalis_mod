package com.red_warlock_.immortalis.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

// This is just to throw together a block with no properties real quick.
// Do not use this permanently

public class BlockBase extends Block {
    public BlockBase() {
        super(AbstractBlock.Properties.create(Material.EARTH)
                .harvestLevel(0)
        );
    }
}
