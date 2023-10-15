package com.littleprogrammer.simpleCosmetics.renderers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class headRenderer extends renderer {

    public void render(EntityPlayer player, RenderPlayerEvent event) {
        double scale = 1.0D;
        double rotationPitch = interpoRotation.interpolateRotation(player.prevRotationPitch, player.rotationPitch, event.partialRenderTick);
        double rotationYaw = interpoRotation.interpolateRotation(player.prevRotationYaw, player.rotationYaw, event.partialRenderTick);


    }
}
