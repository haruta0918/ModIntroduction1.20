package com.github.Naohiro2g.introductionmod.block;

import com.github.Naohiro2g.introductionmod.IntroductionMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IntroductionBlocks {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, IntroductionMod.MOD_ID);
    public static  final RegistryObject<Block> ORIHALCON_BLOCK = BLOCKS.register("orihalcon_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.ANVIL)));
    public static void register(IEventBus eventBus ){
        BLOCKS.register(eventBus);
    }
}
