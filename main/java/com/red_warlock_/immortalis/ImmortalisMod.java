package com.red_warlock_.immortalis;

import com.red_warlock_.immortalis.init.ModArmors;
import com.red_warlock_.immortalis.init.ModBlocks;
import com.red_warlock_.immortalis.init.ModItems;
import com.red_warlock_.immortalis.init.ModTools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("imm")
public class ImmortalisMod
{
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "imm";

    public ImmortalisMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModTools.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModArmors.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());


    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }

    public static final ItemGroup TAB = new ItemGroup("ImmortalisTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TEST_ITEM.get());
        }
    };
}
