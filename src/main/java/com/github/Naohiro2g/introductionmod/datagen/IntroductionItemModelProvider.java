package com.github.Naohiro2g.introductionmod.datagen;

import com.github.Naohiro2g.introductionmod.IntroductionMod;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class IntroductionItemModelProvider extends ItemModelProvider {
    public IntroductionItemModelProvider(PackOutput output,ExistingFileHelper existingFileHelper) {
        super(output, IntroductionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
