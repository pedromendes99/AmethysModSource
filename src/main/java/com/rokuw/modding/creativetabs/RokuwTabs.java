package com.rokuw.modding.creativetabs;

import com.rokuw.modding.MainClass;
import com.rokuw.modding.blocks.RokuwBlocks;
import com.rokuw.modding.items.RokuwItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RokuwTabs {

	public static CreativeTabs tabAmethyst = new AmethystCreativeTab("tabAmethyst");

}

// Internal Class For Creative Tabs
class AmethystCreativeTab extends CreativeTabs {
	public AmethystCreativeTab(String tabLabel) {
		super(tabLabel);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return RokuwItems.amethystGem;
	}
}
