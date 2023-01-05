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
	//Undergarden Coins
	public static final RegistryObject<Item> CLOGGRUM_COIN = register("cloggrum_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> FORGOTTEN_COIN = register("forgotten_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> FROSTSTEEL_COIN = register("froststeel_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	//Aquaculture Coins
	public static final RegistryObject<Item> NEPTUNIUM_COIN = register("neptunium_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	//Twilight Forest coins
	public static final RegistryObject<Item> FIERY_COIN = register("fiery_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> IRONWOOD_COIN = register("ironwood_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> STEELEAF_COIN = register("steeleaf_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	//TiC coins (dear lord this is a lot)
	public static final RegistryObject<Item> COBALT_COIN = register("cobalt_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> MANYULLYN_COIN = register("manyullyn_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> PIG_IRON_COIN = register("pig_iron_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> QUEENS_SLIME_COIN = register("queens_slime_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> ROSE_GOLD_COIN = register("rose_gold_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> SLIMESTEEL_COIN = register("slimesteel_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> AMETHYST_BRONZE_COIN = register("amethyst_bronze_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> HEPATIZON_COIN = register("hepatizon_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	//Misc
	public static final RegistryObject<Item> YIPEE = register("zap_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	public static final RegistryObject<Item> STROIN = register("strider_coin", () -> new Item(new Item.Properties().tab(Mint.MINT_COINS_TAB)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
