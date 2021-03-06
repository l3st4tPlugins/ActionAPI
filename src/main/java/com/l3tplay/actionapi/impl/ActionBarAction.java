package com.l3tplay.actionapi.impl;

import com.l3tplay.actionapi.ActionManager;
import com.l3tplay.actionapi.IAction;
import lombok.RequiredArgsConstructor;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;

@RequiredArgsConstructor
public abstract class ActionBarAction implements IAction {

    private final String prefix;

    @Override
    public void execute(Player player, String args) {
        getAudience(player).sendActionBar(MiniMessage.get().parse(args));
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    protected abstract Audience getAudience(Player player);
}
