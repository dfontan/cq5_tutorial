package cq5_test_unit.components.foundation;

import cq5_test_unit.Component;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public class Image extends Component {

    private String file;
    private String imageRotate;

    public Image(String path, String file, String imageRotate, Component... components) {
        super(path, components);
        this.file = file;
        this.imageRotate = imageRotate;
    }

    @Override
    protected void setupProperties(Node node) {
        try {
            node.setProperty("sling:resourceType" , "foundation/components/image");
            node.setProperty("imageRotate" , imageRotate);
            node.setProperty("fileReference" , file);
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
    }
}
