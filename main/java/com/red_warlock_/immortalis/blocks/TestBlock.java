package com.red_warlock_.immortalis.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TestBlock extends Block {
    public TestBlock() {
        super(AbstractBlock.Properties.create(Material.CARPET)
            .hardnessAndResistance(0.0f, 0.0f)
            .harvestLevel(0)
            .harvestTool(ToolType.AXE)
            .sound(SoundType.CLOTH)

        );
    }
}
