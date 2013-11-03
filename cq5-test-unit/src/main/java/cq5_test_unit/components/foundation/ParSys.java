package cq5_test_unit.components.foundation;

import cq5_test_unit.Component;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public class ParSys extends Component {

    public ParSys(String path , Component ... components) {
        super(path , components);
    }

    @Override
    protected void setupProperties(Node node) {
        try {
            node.setProperty("sling:resourceType" , "foundation/components/parsys");
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
    }
}
