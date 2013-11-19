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
        return new CQContactFormView((ValueMap) context.findAttribute("properties"));
    }

    public static ContactModel model(JspContext context){
        return new CQContactFormModel((Resource) context.findAttribute("resource"));
    }
}
