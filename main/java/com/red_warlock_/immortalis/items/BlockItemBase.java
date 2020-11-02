package com.red_warlock_.immortalis.items;

import com.red_warlock_.immortalis.ImmortalisMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ImmortalisMod.TAB));
    }
}
