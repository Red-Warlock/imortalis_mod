package com.red_warlock_.immortalis.init;

import com.red_warlock_.immortalis.ImmortalisMod;
import com.red_warlock_.immortalis.blocks.TestBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ImmortalisMod.MOD_ID);

    //BLOCKS
    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", TestBlock::new);

}
