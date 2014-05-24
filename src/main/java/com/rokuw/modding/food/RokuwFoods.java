package com.rokuw.modding.food;

import net.minecraft.item.Item;

import com.rokuw.modding.help.Reference;
import com.rokuw.modding.help.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;

public class RokuwFoods {

	public static Item amethystCookie = new amethystCookie(1005, true).setUnlocalizedName("amethystCookie").setTextureName(Reference.MODID + ":" + "amethystCookie");
	
	//Register Food\\
	public void RegisterFood() {
		
    RF(amethystCookie, "amethystCookie");
    
	}
	
	
	
	private void RF(Item par1Item, String par2Name) {
			GameRegistry.registerItem(par1Item, par1Item.toString());
	}
}