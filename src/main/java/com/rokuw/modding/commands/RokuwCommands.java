package com.rokuw.modding.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;

public class RokuwCommands extends CommandBase{

	@Override
	public String getCommandName() {
		return "/Test";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/Test";
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		ChatComponentTranslation chatcomponent = new ChatComponentTranslation("Command Worked!", new Object[]{});
		chatcomponent.getChatStyle().setColor(EnumChatFormatting.BLUE);
		var1.addChatMessage(chatcomponent);
		
}
	
}