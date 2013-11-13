package smithstone.components.forms.adapter;

import org.apache.sling.api.resource.Resource;
import smithstone.forms.ports.ContactModel;

public class CQContactFormModel implements ContactModel {

    private Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String getFormAction() {
        return resource.getPath() + ".submit.html";
    }
}
