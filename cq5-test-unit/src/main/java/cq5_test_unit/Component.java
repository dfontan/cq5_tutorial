package cq5_test_unit;

import org.apache.jackrabbit.commons.JcrUtils;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public abstract class Component extends CQ5Resource {


    protected Component[] components;

    public Component(String path, Component ... components) {
        super(path);
        this.components = components;
    }

    @Override
    public void create(Node parent) throws RepositoryException {
        super.create(parent);
        Node node = JcrUtils.getOrAddNode(parent, path);
        for(Component c : components){
            c.create(node);
        }
    }
}
