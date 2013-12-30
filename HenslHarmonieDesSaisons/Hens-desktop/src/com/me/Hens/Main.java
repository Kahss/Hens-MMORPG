package com.me.Hens;

import java.net.URL;

import screens.UIs.UIMenu;
import game.*;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Hens";
		cfg.useGL20 = false;
		cfg.width = 1024;
		cfg.height = 768;
		
		 // fullscreen
     //   cfg.fullscreen = true;
        // vSync
        cfg.vSyncEnabled = true;
	
		new LwjglApplication(new Hens(), cfg);
	}
}
