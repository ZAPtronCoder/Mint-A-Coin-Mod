package com.zaptron.mint.init;

import com.google.common.base.Supplier;
import com.zaptron.mint.Mint;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mint.MOD_ID);
	
	// Tools
	public static final RegistryObject<Item> BALLPEEN_HAMMER = register("ballpeen_hammer", () -> new Item(new Item.Properties().tab(Mint.MINT_TOOLS_TAB).durability(64)));
	public static final RegistryObject<Item> BLAST_POWDER = register("blast_powder", () -> new Item(new Item.Properties().tab(Mint.MINT_TOOLS_TAB)));
	// Vanilla Coins
	public static final RegistryObject<Item> COPPER_COIN = register("copper_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> IRON_COIN = register("iron_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> GOLD_COIN = register("gold_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> NETHERITE_COIN = register("netherite_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	// Create Coins
	public static final RegistryObject<Item> ZINC_COIN = register("zinc_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> BRASS_COIN = register("brass_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	// Create: Alloyed Coins
	public static final RegistryObject<Item> STEEL_COIN = register("steel_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> BRONZE_COIN = register("bronze_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	// Galosphere Coins
	public static final RegistryObject<Item> SILVER_COIN = register("silver_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
