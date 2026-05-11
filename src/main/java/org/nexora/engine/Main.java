package org.nexora.engine;

import org.nexora.engine.core.Engine;
import org.nexora.engine.core.Window;
import org.nexora.engine.game.AppLogic;
import org.nexora.engine.renderer.Render;
import org.nexora.engine.scene.Mesh;
import org.nexora.engine.scene.Scene;

public class Main implements AppLogic {

    @Override
    public void init(Window window, Scene scene, Render render) {
        float[] positions = new float[] {
                0.0f, 0.5f, 0.0f,
                -0.5f, -0.5f, 0.0f,
                0.5f, -0.5f, 0.0f
        };
        Mesh mesh = new Mesh(positions, 3);
        scene.addMesh("triangle", mesh);
    }

    @Override
    public void input(Window window, Scene scene, long diffTimeMillis) {
        // Nothing to be done yet
    }

    @Override
    public void update(Window window, Scene scene, long diffTimeMillis) {
        // Nothing to be done yet
    }

    @Override
    public void cleanup() {
        // Nothing to be done yet
    }

    public static void main(String[] args) {
        Main main = new Main();
        Engine gameEng = new Engine("Nexora 1.0-SNAPSHOT", new Window.WindowOptions(), main);
        gameEng.start();
    }
}