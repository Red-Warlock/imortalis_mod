package com.red_warlock_.immortalis.events;

import com.red_warlock_.immortalis.ImmortalisMod;
import com.red_warlock_.immortalis.init.ModBlocks;
import com.red_warlock_.immortalis.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ImmortalisMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent // LivingEntity#func_233580_cy_() ---> LivingEntityPosition()
    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();
        if (player.getHeldItemMainhand().getItem() == Items.STICK) {
            ImmortalisMod.LOGGER.info("Jumped With Stick");
            World world = player.getEntityWorld();
            world.setBlockState(player.func_233580_cy_().add(0,-1,0), ModBlocks.TEST_BLOCK.get().getDefaultState());
        }
    }

    @SubscribeEvent
    public static void onDamageSheep(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == ModItems.POISON_APPLE.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof SheepEntity) {
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
                    target.setGlowing(true);

                    PlayerEntity player = event.getPlayer();

                    if (!event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.DARK_PURPLE + "That sheep doesn't feel so good...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

}
