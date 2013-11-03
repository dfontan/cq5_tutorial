package cq5_test_unit.components.foundation;

import cq5_test_unit.Component;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public class Text extends Component {

    private TextType type;

    public enum TextType {

        PLAIN("false") , RICH("true");
        private String type;

        TextType(String type) {
            this.type = type;
        }
    }


    private String text;

    public Text(String path, String text, TextType textType, Component... components) {
        super(path, components);
        this.text = text;
        this.type = textType;
    }

    @Override
    protected void setupProperties(Node node) {
        try {
            node.setProperty("sling:resourceType", "foundation/components/textimage");
            node.setProperty("text" , text);
            node.setProperty("textIsRich" , type.type);
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
    }
}
