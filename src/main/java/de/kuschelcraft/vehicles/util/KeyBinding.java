package de.kuschelcraft.vehicles.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_VEHICLES = "key.category.vehicles.vehicles";
    public static final String KEY_START_ENGINE = "key.vehicles.start_engine";

    public static final KeyMapping START_ENGINE_KEY =
            new KeyMapping(KEY_START_ENGINE, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_VEHICLES);
}
