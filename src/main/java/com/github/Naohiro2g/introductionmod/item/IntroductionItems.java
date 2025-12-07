package com.github.Naohiro2g.introductionmod.item;

import com.github.Naohiro2g.introductionmod.IntroductionMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.github.Naohiro2g.introductionmod.IntroductionMod.ITEMS;

public class IntroductionItems {
    //　レジストリを作成
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IntroductionMod.MOD_ID);

    //レジストリにアイテムを追加
    public static final RegistryObject<Item> RAW_ORIHALCON = ITEMS.register("raw_orihalcon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORIHALCON_INGOT = ITEMS.register("orihalcon_ingot", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        //レジストリにイベントバスを追加
        ITEMS.register(eventBus);
    }

}

