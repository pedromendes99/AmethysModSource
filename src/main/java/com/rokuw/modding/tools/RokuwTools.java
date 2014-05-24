package com.rokuw.modding.tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import com.rokuw.modding.MainClass;
import com.rokuw.modding.creativetabs.RokuwTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class RokuwTools{
	//Enums
	static ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2, 750, 6.5F, 2.0F, 20);
	static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 2, 500, 7.0F, 2.25F, 17);
	
	//Amethyst Tools\\
	public static Item amethystPickaxe = new Pickaxe(AMETHYST, "amethystPickaxe").setUnlocalizedName("amethystPickaxe");
	public static Item amethystSpade = new Spade(AMETHYST, "amethystSpade").setUnlocalizedName("amethystSpade");
	public static Item amethystAxe = new Axe(AMETHYST, "amethystAxe").setUnlocalizedName("amethystAxe");
	public static Item amethystSword = new Sword(AMETHYST, "amethystSword").setUnlocalizedName("amethystSword");
	public static Item amethystHoe = new Hoe(AMETHYST, "amethystHoe").setUnlocalizedName("amethystHoe");
	//Emerald Tools\\
	public static Item emeraldPickaxe = new Pickaxe(EMERALD, "emeraldPickaxe").setUnlocalizedName("emeraldPickaxe");
	public static Item emeraldSpade = new Spade(EMERALD, "emeraldSpade").setUnlocalizedName("emeraldSpade");
	public static Item emeraldAxe = new Axe(EMERALD, "emeraldAxe").setUnlocalizedName("emeraldAxe");
	public static Item emeraldSword = new Sword(EMERALD, "emeraldSword").setUnlocalizedName("emeraldSword");
	public static Item emeraldHoe = new Hoe(EMERALD, "emeraldHoe").setUnlocalizedName("emeraldHoe");

	public static void RegisterTools(){
	
	RI(amethystPickaxe, "amethystPickaxe");
	RI(amethystSpade, "amethystSpade");
	RI(amethystAxe, "amethystAxe");
	RI(amethystSword, "amethystSword");
    RI(emeraldPickaxe, "emeraldPickaxe");
    RI(emeraldSpade, "emeraldSpade");
    RI(emeraldAxe, "emeraldAxe");
    RI(emeraldSword, "emeraldSword");
    RI(emeraldHoe, "emeraldHoe");
	}
	
	private static void RI(Item item, String name){
		GameRegistry.registerItem(item, name);
	}
}

class Sword extends ItemSword{
	public Sword(ToolMaterial toolMaterial, String TextureName) {
		super(toolMaterial);
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setTextureName("rokuw:"+TextureName);
	}
	public Sword(ToolMaterial toolMaterial, String TextureName, boolean HasEffect) {
		super(toolMaterial);
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setTextureName("rokuw:"+TextureName);
		if (HasEffect)
			Eff = true;
	}
	@Override
	public boolean hasEffect(ItemStack par1ItemStack){
		return Eff;
	}
	private boolean Eff = false;
}

class Pickaxe extends ItemPickaxe{
	public Pickaxe(ToolMaterial toolMaterial, String TextureName) {
		super(toolMaterial);
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setTextureName("rokuw:"+TextureName);
	}
}

class Axe extends ItemAxe{
	public Axe(ToolMaterial toolMaterial, String TextureName) {
		super(toolMaterial);
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setTextureName("rokuw:"+TextureName);
	}
}

class Spade extends ItemSpade{
	public Spade(ToolMaterial toolMaterial, String TextureName) {
		super(toolMaterial);
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setTextureName("rokuw:"+TextureName);
	}
}

class Hoe extends ItemHoe{
	public Hoe(ToolMaterial toolMaterial, String TextureName) {
		super(toolMaterial);
		this.setCreativeTab(RokuwTabs.tabAmethyst);
		this.setTextureName("rokuw:"+TextureName);
	}
}