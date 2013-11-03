package cq5_test_unit;

import org.apache.jackrabbit.commons.JcrUtils;

import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

public class ApiJcr {

    private final String username;
    private final String password;
    private final String url;
    private Session session;

    public ApiJcr(String username , String password , String url){

        this.username = username;
        this.password = password;
        this.url = url;
    }

    public void performAction(JCRAction action) throws RepositoryException {
        session = JcrUtils.getRepository(url).login(new SimpleCredentials(username, password.toCharArray()));
        action.execute();
        session.save();
        session.logout();
    }


    public JCRAction create(String path){
        return new CreateAction(path);
    }

    public JCRAction remove(String path){
        return new RemoveAction(path);
    }

    public abstract class JCRAction {
        public abstract void execute() throws RepositoryException;
    }


    class CreateAction extends JCRAction {

        private String path;

        CreateAction(String path) {
            this.path = path;
        }

        @Override
        public void execute() throws RepositoryException {
            session.getRootNode().addNode(path, "cq:Page");
        }
    }

    public class RemoveAction extends JCRAction {

        private String path;

        public RemoveAction(String path) {
            this.path = path;
        }

        @Override
        public void execute() throws RepositoryException {
            session.getRootNode().getNode(path).remove();
        }
    }

}
