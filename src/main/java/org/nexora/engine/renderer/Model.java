package org.nexora.engine.renderer;

import org.nexora.engine.scene.Entity;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private final String id;
    private final List<Entity> entitiesList;
    private final List<Material> materialList;

    public Model(String id, List<Material> materialList) {
        this.id = id;
        this.materialList = materialList;
        entitiesList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Entity> getEntitiesList() {
        return entitiesList;
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void cleanup() {
        materialList.forEach(Material::cleanup);
    }
}
