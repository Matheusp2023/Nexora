package org.nexora.engine.game;

import org.nexora.engine.core.Window;
import org.nexora.engine.renderer.Render;
import org.nexora.engine.scene.Scene;

public interface AppLogic {

    void init(Window window, Scene scene, Render render);

    void input(Window window, Scene scene, long diffTimeMillis);

    void update(Window window, Scene scene, long diffTimeMillis);

    void cleanup();
}
