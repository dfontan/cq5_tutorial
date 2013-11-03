package cq5_test_unit;

import org.apache.jackrabbit.commons.JcrUtils;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public abstract class CQ5Resource {

    protected final String path;

    protected abstract void setupProperties(Node node);

    public CQ5Resource(String path) {
        this.path = path;
    }

    protected String getPrimaryType(){
        return "nt:unstructured";
    }

    public void create(Node parent) throws RepositoryException {
        Node node = JcrUtils.getOrAddNode(parent, path, getPrimaryType());
        setupProperties(node);
    }
}
