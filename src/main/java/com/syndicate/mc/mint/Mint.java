package com.syndicate.mc.mint;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Mint.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Mint {
    public static final String MODID = "mint";
    public static final Logger LOGGER = LogManager.getLogger("Mint");

    public Mint() {}
}