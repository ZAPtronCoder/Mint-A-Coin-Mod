package com.syndicate.mc.mint.datagen;

import com.syndicate.mc.mint.Mint;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mint.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenEntrypoint {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // Example of adding a datagen provider for blockstates
        // generator.addProvider(event.includeClient(), new MyBlockStateProvider(generator.getPackOutput()));
    }
}