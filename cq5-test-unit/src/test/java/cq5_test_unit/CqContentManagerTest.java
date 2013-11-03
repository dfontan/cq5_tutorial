package cq5_test_unit;

import org.apache.jackrabbit.commons.JcrUtils;
import org.junit.After;
import org.junit.Test;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

import static cq5_test_unit.JCRNodeMatcher.hasNode;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CqContentManagerTest {

    public static final String REPOS_URL = "http://localhost:4502/crx/server";
    public static final String PASSWORD = "admin";
    public static final String USERNAME = "admin";
    public static final String NODE_PATH = "moo";

    private CqContentManager contentManager;

    @After
    public void tearDown() throws RepositoryException {
        ApiJcr apiJcr = new ApiJcr(USERNAME, PASSWORD, REPOS_URL);
        apiJcr.performAction(apiJcr.remove("content/test"));
    }

    @Test
    public void basePathWithRequiredFields() throws Exception {
        new CqContentManager("admin", "admin", "content/test", REPOS_URL);
        Node node = JcrUtils.getRepository(REPOS_URL).login().getNode("/content/test/jcr:content");
        assertEquals(node.getProperty("cq:designPath").getString() , "/etc/designs/vaa");
    }

    @Test
    public void givenATemplateCreateNewContent() throws Exception {
        createTemplate();
        assertThat(JcrUtils.getRepository(REPOS_URL).login(), hasNode("/content/test/moo"));
    }

    private void createTemplate() throws Exception {
        contentManager = new CqContentManager(USERNAME, PASSWORD, "content/test", REPOS_URL);
        contentManager.addNode(NODE_PATH);
        contentManager.save();
        contentManager.logout();
    }

    @Test
    public void givenAPathRemoveFromRepository() throws Exception {
        createTemplate();
        removeTemplate();
        assertThat(JcrUtils.getRepository(REPOS_URL).login(), not(hasNode("/content/test/moo")));
    }

    private void removeTemplate() throws RepositoryException {
        contentManager = new CqContentManager(USERNAME, PASSWORD, "content/test", REPOS_URL);
        contentManager.remove(NODE_PATH);
        contentManager.save();
        contentManager.logout();
    }

}










