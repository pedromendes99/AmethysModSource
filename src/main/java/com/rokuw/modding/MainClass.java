package com.rokuw.modding;

import net.minecraft.block.Block;

import com.rokuw.modding.blocks.RokuwBlocks;
import com.rokuw.modding.blocks.worldgeneration.WorldGen;
import com.rokuw.modding.commands.RokuwCommands;
import com.rokuw.modding.crafting.Crafting;
import com.rokuw.modding.creativetabs.RokuwTabs;
import com.rokuw.modding.items.RokuwItems;
import com.rokuw.modding.items.armor.RokuwArmors;
import com.rokuw.modding.tools.RokuwTools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = "rokuw", name = "Amethyst Mod", version = "2.0 Beta")
public class MainClass {
	private static int StartEntityId = 300;
	
	// Amethyst Furnace Declaration
	public static Block AmethystOven;
	public static Block AmethystOvenActive;
    
	@Instance("rokuw")
	public static MainClass instance;
	
	@SidedProxy(clientSide = "com.rokuw.modding.ClientProxy", serverSide = "com.rokuw.modding.CommonProxy")
	public static CommonProxy proxy;

	//Forge Pre Initialization\\
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.registerInformation();
		RokuwBlocks RBlocks = new RokuwBlocks();
		RokuwItems RItems = new RokuwItems();
		RokuwTools RTools = new RokuwTools();
		RokuwArmors RArmors = new RokuwArmors();
		RBlocks.RegisterBlock();
		RItems.RegisterItem();
		RTools.RegisterTools();
		RArmors.RegisterArmor();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
	}
	
	//Forge Initilization\\
	@EventHandler
	public void init(FMLInitializationEvent event) {
		RokuwTabs Tabs = new RokuwTabs();
		Crafting Craft = new Crafting();
		WorldGen.Register();
	}
	
	public MainClass() {}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		event.registerServerCommand( new RokuwCommands());

}
	
}