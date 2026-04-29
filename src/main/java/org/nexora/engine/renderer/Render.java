package org.nexora.engine.renderer;

import org.lwjgl.opengl.GL;
import org.nexora.engine.core.Window;
import org.nexora.engine.scene.Scene;

import static org.lwjgl.opengl.GL11C.*;

public class Render {

    public Render() {
        GL.createCapabilities();
    }

    public void cleanup() {
        // Nothing to be done here yet
    }

    public void render(Window window, Scene scene) {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    }
}
