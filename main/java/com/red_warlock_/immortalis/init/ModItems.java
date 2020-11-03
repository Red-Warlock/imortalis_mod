package com.red_warlock_.immortalis.init;

import com.red_warlock_.immortalis.ImmortalisMod;
import com.red_warlock_.immortalis.items.BlockItemBase;
import com.red_warlock_.immortalis.items.ItemBase;
import com.red_warlock_.immortalis.items.PoisonApple;
import com.red_warlock_.immortalis.util.enums.ModArmorMaterial;
import com.red_warlock_.immortalis.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImmortalisMod.MOD_ID);

    //ITEMS
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", ItemBase::new);

    //BLOCK ITEMS
    public static final RegistryObject<Item> TEST_BLOCK_ITEM = ITEMS.register("test_block",
            () -> new BlockItemBase(ModBlocks.TEST_BLOCK.get()));

    //FOODS
    public static final RegistryObject<PoisonApple> POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);

}
