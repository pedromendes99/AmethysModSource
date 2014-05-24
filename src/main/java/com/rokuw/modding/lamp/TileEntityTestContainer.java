package com.rokuw.modding.lamp;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * TileEntityTestContainer
 * Created by: Martijn Woudstra
 * Date: 31-mrt-2014
 */

public class TileEntityTestContainer extends TileEntity implements IInventory
{
    /**
     * Loads of methods. All required since we implement IInventory
     */
    private ItemStack[] inventory;
    private int INVENTORY_SIZE = 7;

    //Initializes our inventory.
    public TileEntityTestContainer()
    {
        inventory = new ItemStack[INVENTORY_SIZE];
    }

    //Returns the size of the inventory (aka number of slots)
    @Override
    public int getSizeInventory()
    {
        return inventory.length;
    }

    //Returns the ItemStack in a slot
    @Override
    public ItemStack getStackInSlot(int slotIndex)
    {
        return inventory[slotIndex];
    }

    /*
    Decreases the stacksize.
    If the stack is not null, and the amount to decrease is more than the slot has, set to null
    else if the stack is not null, split the stack. If that makes the inv 0, make it null.
     */
    @Override
    public ItemStack decrStackSize(int slotIndex, int decrementAmount)
    {
        ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null)
        {
            if (itemStack.stackSize <= decrementAmount)
            {
                setInventorySlotContents(slotIndex, null);
            }
            else
            {
                itemStack = itemStack.splitStack(decrementAmount);
                if (itemStack.stackSize == 0)
                {
                    setInventorySlotContents(slotIndex, null);
                }
            }
        }
        return itemStack;
    }

    /*
    Sets the stack on closing.
    If the stack is not null, set it to null
     */
    @Override
    public ItemStack getStackInSlotOnClosing(int slotIndex)
    {
        ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null)
        {
            setInventorySlotContents(slotIndex, null);
        }
        return itemStack;
    }

    /*
    Sets the Inventory content.
    If the stack you place exeeds the maxStackSize, set the size to maxStacksize.
     */
    @Override
    public void setInventorySlotContents(int slotIndex, ItemStack itemStack)
    {
        inventory[slotIndex] = itemStack;
        if (itemStack != null && itemStack.stackSize > getInventoryStackLimit())
        {
            itemStack.stackSize = getInventoryStackLimit();
        }
    }
    /*
    Returns the Inv name, not req.
     */
    @Override
    public String getInventoryName()
    {
        return "aString";
    }

    /*
    IF you want, return true. Not req.
     */
    @Override
    public boolean hasCustomInventoryName()
    {
        return true;
    }

    /*
    Max stacksize in slot.
     */
    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    /*
    return true, or you wont be able to use it.
     */
    @Override
    public boolean isUseableByPlayer(EntityPlayer var1)
    {
        return true;
    }

    /*
    Do very little
     */
    @Override
    public void openInventory()
    {

    }

    /*
    Do as little as.
     */
    @Override
    public void closeInventory()
    {

    }

    /*
    You can put your custom items here, if you want
     */
    @Override
    public boolean isItemValidForSlot(int var1, ItemStack var2)
    {
        return true;
    }

    @Override
    public void writeToNBT(NBTTagCompound var1)
    {
        NBTTagCompound[] tag = new NBTTagCompound[INVENTORY_SIZE];
        for (int x = 0; x < INVENTORY_SIZE; x++)
        {
            tag[x] = new NBTTagCompound();
            if (inventory[x] != null)
            {
                tag[x] = inventory[x].writeToNBT(tag[x]);
            }
            var1.setTag("inventory" + x, tag[x]);
        }
        super.writeToNBT(var1);
    }

    @Override
    public void readFromNBT(NBTTagCompound var1)
    {
        NBTTagCompound[] tag = new NBTTagCompound[INVENTORY_SIZE];
        for (int x = 0; x < INVENTORY_SIZE; x++)
        {
            tag[x] = var1.getCompoundTag("inventory" + x);
            inventory[x] = ItemStack.loadItemStackFromNBT(tag[x]);
        }
        super.readFromNBT(var1);
    }
}