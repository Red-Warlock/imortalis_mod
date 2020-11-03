package com.red_warlock_.immortalis.items;

import com.red_warlock_.immortalis.ImmortalisMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoisonApple extends Item {
    public PoisonApple() {
        super(new Item.Properties()
            .group(ImmortalisMod.TAB)
            .food(new Food.Builder()
                    .hunger(3)
                    .saturation(2.0f)
                    .setAlwaysEdible()
                    .effect(
                            () -> new EffectInstance(Effects.POISON, 20*20, 1), 1.0f)
                    .build())

        );
    }
}