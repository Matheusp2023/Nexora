package org.nexora.engine.renderer;

import org.lwjgl.opengl.GL;
import org.nexora.engine.core.Window;
import org.nexora.engine.scene.Scene;

import static org.lwjgl.opengl.GL11C.*;

public class Render {

    private final SceneRender sceneRender;

    public Render() {
        GL.createCapabilities();
        glEnable(GL_DEPTH_TEST);
        sceneRender = new SceneRender();
    }

    public void cleanup() {
        sceneRender.cleanup();
    }

    public void render(Window window, Scene scene) {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glViewport(0, 0, window.getWidth(), window.getHeight());
        sceneRender.render(scene);
    }
}
