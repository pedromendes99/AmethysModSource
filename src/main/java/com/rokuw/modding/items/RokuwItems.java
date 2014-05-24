package com.rokuw.modding.items;

import com.rokuw.modding.MainClass;
import com.rokuw.modding.creativetabs.RokuwTabs;
import com.rokuw.modding.help.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RokuwItems {
	// Items
	public static Item amethystGem = new RokuwItem("amethystGem").setUnlocalizedName("amethystGem");
	
	// Register Items In Game
	public void RegisterItem(){
		RI(amethystGem, "amethystGem");
	}
	
	private void RI(Item item, String name){
		GameRegistry.registerItem(item, name);
	}
}

// Internal Class For Items
class RokuwItem extends Item {
	public RokuwItem(String TextureName) {
		super();
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setMaxStackSize(64);
		this.setTextureName("rokuw:"+TextureName);
	}
	public RokuwItem(String TextureName, int Stack) {
		super();
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setMaxStackSize(Stack);
		this.setTextureName("rokuw:"+TextureName);
	}
	public RokuwItem(String TextureName, int Stack, Boolean HasEffect) {
		super();
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setMaxStackSize(Stack);
		this.setTextureName("rokuw:"+TextureName);
		if(HasEffect)
			Eff = true;
	}
	@Override
	public boolean hasEffect(ItemStack par1ItemStack){
		return Eff;
	}
	private boolean Eff = false;
}

class EPeXInfoItem extends Item{
	public EPeXInfoItem(){
		super();
		setCreativeTab(RokuwTabs.tabAmethyst);
		setMaxStackSize(1);
		setTextureName("rokuw:info");
	}

	}