package com.littleprogrammer.simpleCosmetics.renderers;

public class interpoRotation {
    public static float interpolateRotation(float f1, float f2, float f3) {
        float rotation = (f1 + (f2 - f1) * f3) % 360F;
        if (rotation < 0.0F) {
            rotation += 360.0F;
        }
        return rotation;
    }
}
