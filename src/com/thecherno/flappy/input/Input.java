package com.thecherno.flappy.input;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWKeyCallback;

import static org.lwjgl.glfw.GLFW.*;

public class Input extends GLFWKeyCallback {
	
	public static boolean[] keys = new boolean[GLFW_KEY_LAST];

	public void invoke(long window, int key, int scancode, int action, int mods) {
		keys[key] = action != GLFW.GLFW_RELEASE; 
	}
	
	public static boolean isKeyDown(int keycode) {
		return keys[keycode];
	}
	
}
