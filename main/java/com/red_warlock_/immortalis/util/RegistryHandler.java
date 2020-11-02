package com.red_warlock_.immortalis.util;

import com.red_warlock_.immortalis.ImmortalisMod;
import com.red_warlock_.immortalis.blocks.BlockBase;
import com.red_warlock_.immortalis.blocks.TestBlock;
import com.red_warlock_.immortalis.items.BlockItemBase;
import com.red_warlock_.immortalis.items.ItemBase;
import com.red_warlock_.immortalis.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImmortalisMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ImmortalisMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //ITEMS
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", ItemBase::new);

    //BLOCKS
    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", TestBlock::new);

    //BLOCK ITEMS
    public static final RegistryObject<Item> TEST_BLOCK_ITEM = ITEMS.register("test_block", () -> new BlockItemBase(TEST_BLOCK.get()));

    //TOOLS
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 5, -2.4f, new Item.Properties().group(ImmortalisMod.TAB)));


}
