package com.rokuw.modding.crafting;

import com.rokuw.modding.blocks.RokuwBlocks;
import com.rokuw.modding.items.RokuwItems;
import com.rokuw.modding.items.armor.RokuwArmors;
import com.rokuw.modding.tools.RokuwTools;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting {
	
	GameRegistry gr = new GameRegistry();
	RokuwBlocks B = new RokuwBlocks();
	RokuwItems I = new RokuwItems();
	RokuwTools T = new RokuwTools();
	RokuwArmors A = new RokuwArmors();
	private Object[][] BlockSet;
	
	public Crafting(){
		CraftBlocks();
		CraftTools();
		CraftWeapons();
		CraftItems();
		CraftArmor();
		SmeltBlock(B.amethystOre, new ItemStack(I.amethystGem), 15);
		Shapeless(new ItemStack(I.amethystGem, 9), Blocks.dirt, B.amethystBlock);
	}
	
	private void CraftArmor(){
		String[][] recipePatterns = new String[][] {{"XXX", "X X",}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
	    Object[][] recipeItems = new Object[][] {
	    	{I.amethystGem, Items.emerald}, 
	    	{A.amethystHelmet, A.emeraldHelmet}, 
	    	{A.amethystChestplate, A.emeraldChestplate}, 
	    	{A.amethystLeggings, A.emeraldLeggings}, 
	    	{A.amethystBoots, A.emeraldBoots}
	    };
	    
	    for (int var2 = 0; var2 < recipeItems[0].length; ++var2)
        {
            Object var3 = recipeItems[0][var2];

            for (int var4 = 0; var4 < recipeItems.length - 1; ++var4)
            {
                Item var5 = (Item)recipeItems[var4 + 1][var2];
                gr.addRecipe(new ItemStack(var5), new Object[] {recipePatterns[var4], 'X', var3});
            }
        }
	}
	
	private void CraftBlocks(){
		BlockSet = new Object[][] {
				{B.amethystBlock, new ItemStack(I.amethystGem, 9)},
		};
		
		for (int var2 = 0; var2 < BlockSet.length; ++var2)
        {
            Block var3 = (Block)BlockSet[var2][0];
            ItemStack var4 = (ItemStack)BlockSet[var2][1];
            gr.addRecipe(new ItemStack(var3), new Object[] {"###", "###", "###", '#', var4});
            gr.addRecipe(var4, new Object[] {"#", '#', var3});
        }
	}
	
	private void CraftItems() {
		
	}
	
	private void CraftTools(){
		String[][] recipePatterns = new String[][] {{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
	    Object[][] recipeItems = new Object[][] {
	    	{I.amethystGem, Items.emerald}, 
	    	{T.amethystPickaxe, T.emeraldPickaxe}, 
	    	{T.amethystSpade, T.emeraldSpade}, 
	    	{T.amethystAxe, T.emeraldAxe}, 
	    	{T.amethystHoe, T.emeraldHoe}
	    };
	    
	    for (int var2 = 0; var2 < recipeItems[0].length; ++var2)
        {
            Object var3 = recipeItems[0][var2];

            for (int var4 = 0; var4 < recipeItems.length - 1; ++var4)
            {
                Item var5 = (Item)recipeItems[var4 + 1][var2];
                gr.addRecipe(new ItemStack(var5), new Object[] {recipePatterns[var4], '#', Items.stick, 'X', var3});
            }
        }
	}
	
	private void CraftWeapons(){
		String[][] recipePatterns = new String[][] {{"X", "X", "#"}};
		Object[][] recipeItems = new Object[][] {
			{I.amethystGem, Items.emerald},
			{T.amethystSword, T.emeraldSword}
		};
		
		for (int var2 = 0; var2 < recipeItems[0].length; ++var2)
        {
            Object var3 = recipeItems[0][var2];

            for (int var4 = 0; var4 < recipeItems.length - 1; ++var4)
            {
                Item var5 = (Item)recipeItems[var4 + 1][var2];
                gr.addRecipe(new ItemStack(var5), new Object[] {recipePatterns[var4], '#', Items.stick, 'X', var3});
            }
        }
	}

	//Functions!
	private void Shaped(ItemStack output, Object... params){
		GameRegistry.addShapedRecipe(output, params);
	}	
	private void Shapeless(ItemStack output, Object... params){
		GameRegistry.addShapelessRecipe(output, params);
	}	
	private void SmeltBlock(Block Input, ItemStack Output, float OutEXP){
		GameRegistry.addSmelting(Input, Output, OutEXP);
	}
	private void SmeltItems(Item Input, ItemStack Output, float OutEXP) {
		GameRegistry.addSmelting(Input, Output, OutEXP);
	}
}