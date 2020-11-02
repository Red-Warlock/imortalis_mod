package com.red_warlock_.immortalis.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
    public BlockBase() {
        super(AbstractBlock.Properties.create(Material.EARTH)
                .harvestLevel(0)
        );
    }
}
