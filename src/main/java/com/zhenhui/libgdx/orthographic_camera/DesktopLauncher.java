package com.zhenhui.libgdx.orthographic_camera;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {

    public static void main(String[] args) {

        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Orthographic Camera");
        config.setWindowedMode(800, 480);

        new Lwjgl3Application(new Application(), config);
    }

}
