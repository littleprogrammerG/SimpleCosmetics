package com.littleprogrammer.simpleCosmetics.renderers;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class renderer {

    @SubscribeEvent
    public void onPlayerRender(RenderPlayerEvent.Pre event) {
        EntityPlayer player = event.entityPlayer;

        GlStateManager.pushMatrix(); // Saves the transform so I can modify.
        GlStateManager.translate(event.x, event.y, event.z); // Translates the object to the coordinates of which the player is being rendered.

        this.render(player, event);

        GlStateManager.popMatrix(); // Restores original transformation.
    }

    public abstract void render(EntityPlayer player, RenderPlayerEvent event);
}
