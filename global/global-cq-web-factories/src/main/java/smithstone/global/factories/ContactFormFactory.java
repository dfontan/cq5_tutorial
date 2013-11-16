package smithstone.global.factories;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import smithstone.components.forms.adapter.CQContactFormModel;
import smithstone.components.forms.adapter.CQContactFormView;
import smithstone.forms.ports.ContactModel;
import smithstone.forms.ports.ContactView;

import javax.servlet.jsp.JspContext;

public class ContactFormFactory {

    public static ContactView view(JspContext context){
        CQContactFormView view = new CQContactFormView();
        view.setProperties((ValueMap) context.findAttribute("properties"));
        return view;
    }

    public static ContactModel model(JspContext context){
        CQContactFormModel model = new CQContactFormModel();
        model.setResource((Resource) context.findAttribute("resource"));
        return model;
    }
}
