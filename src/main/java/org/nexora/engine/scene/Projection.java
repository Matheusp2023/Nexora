package org.nexora.engine.scene;

import org.joml.Matrix4f;

public class Projection {

    private static final float FOV = (float) Math.toRadians(60.0f);
    private static final float Z_FAR = 1000.0f;
    private static final float Z_NEAR = 0.01f;

    private final Matrix4f projMatrix;

    public Projection(int width, int height) {
        projMatrix = new Matrix4f();
        updateProjMatrix(width, height);
    }

    public void updateProjMatrix(int width, int height) {
        projMatrix.setPerspective(FOV, (float) width / height, Z_NEAR, Z_FAR);
    }

    public Matrix4f getProjMatrix() {
        return projMatrix;
    }
}
