package org.nexora.engine.scene;

import java.util.HashMap;
import java.util.Map;

public class Scene {

    private final Map<String, Mesh> meshMap;
    private final Projection projection;

    public Scene(int width, int height) {
        meshMap = new HashMap<>();
        projection = new Projection(width, height);
    }

    public void addMesh(String meshId, Mesh mesh) {
        meshMap.put(meshId, mesh);
    }

    public void resize(int width, int height) {
        projection.updateProjMatrix(width, height);
    }

    public void cleanup() {
        meshMap.values().forEach(Mesh::cleanup);
    }

    public Map<String, Mesh> getMeshMap() {
        return meshMap;
    }

    public Projection getProjection() {
        return projection;
    }
}
