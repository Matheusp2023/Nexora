package org.nexora.engine.renderer;

import org.nexora.engine.scene.Entity;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private final String id;
    private final List<Entity> entitiesList;
    private final List<Mesh> meshList;

    public Model(String id, List<Mesh> meshList) {
        this.id = id;
        this.meshList = meshList;
        entitiesList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Entity> getEntitiesList() {
        return entitiesList;
    }

    public List<Mesh> getMeshList() {
        return meshList;
    }

    public void cleanup() {
        meshList.forEach(Mesh::cleanup);
    }
}
