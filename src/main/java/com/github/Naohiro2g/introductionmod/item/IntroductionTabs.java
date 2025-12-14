package com.github.Naohiro2g.introductionmod.item;

import com.github.Naohiro2g.introductionmod.IntroductionMod;
import com.github.Naohiro2g.introductionmod.block.IntroductionBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class IntroductionTabs {
    //　レジストリを作成
    public static final DeferredRegister<CreativeModeTab>TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IntroductionMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> INTRODUCTION_TAB = TABS.register("introduction_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetabs.introduction_tab"))
                    .icon(IntroductionItems.RAW_ORIHALCON.get()::getDefaultInstance)
                    .displayItems(((pParameters,pOutput) -> {
                        pOutput.accept((IntroductionItems.RAW_ORIHALCON.get()));
                        pOutput.accept((IntroductionItems.ORIHALCON_INGOT.get()));
                        pOutput.accept((IntroductionBlocks.ORIHALCON_BLOCK.get()));
                    }))
                    .build());
    public static void register(IEventBus eventbus) {
        TABS.register(eventbus);
    }}
