package cq5_test_unit;

import cq5_test_unit.vaa.templates.Page;
import org.apache.jackrabbit.commons.JcrUtils;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

public class CqContentManager {

    private Session session;
    private String basePath;

    public CqContentManager(String username, String password, String basePath, String repositoryUrl) throws RepositoryException {
        this.basePath = basePath;
        session = JcrUtils.getRepository(repositoryUrl).login(new SimpleCredentials(username, password.toCharArray()));
        Node node = JcrUtils.getOrAddNode(session.getRootNode(), basePath, "cq:Page");
        Node jcrContent = JcrUtils.getOrAddNode(node, "jcr:content", "cq:PageContent");
        jcrContent.setProperty("cq:designPath" , "/etc/designs/ssmithstone");
        session.save();
    }

    Node getRootNode() throws RepositoryException {
        return getSession().getRootNode().getNode(basePath);
    }
    protected Session getSession(){
        return session;
    }

    void save() throws RepositoryException {
        session.save();
    }

    void logout(){
        session.logout();
    }

    public void addNode(Page template) throws Exception {
        template.create(session.getRootNode().getNode(basePath));
        session.save();
    }

    public void addNode(String path) throws RepositoryException {
        if(!getRootNode().hasNode(path))
            getRootNode().addNode(path, "cq:Page");
    }

    public void remove(String path) throws RepositoryException {
        if(getRootNode().hasNode(path))
            getRootNode().getNode(path).remove();
    }
}
