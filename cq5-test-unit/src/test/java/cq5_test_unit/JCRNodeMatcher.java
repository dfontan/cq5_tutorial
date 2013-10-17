package cq5_test_unit;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.junit.internal.matchers.TypeSafeMatcher;

import javax.jcr.RepositoryException;
import javax.jcr.Session;

public class JCRNodeMatcher extends TypeSafeMatcher<Session> {


    private String path;

    public JCRNodeMatcher(String path) {
        this.path = path;
    }

    @Override
    public boolean matchesSafely(Session session) {
        try {
            return session.getNode(path) != null;
        } catch (RepositoryException e) {
            return false;
        }
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(String.format("%s does not exist", path));
    }

    @Factory
    public static JCRNodeMatcher hasNode(String path){
        return new JCRNodeMatcher(path);
    }
}
