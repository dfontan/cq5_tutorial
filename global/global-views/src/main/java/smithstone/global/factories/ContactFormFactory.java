package smithstone.global.factories;

import smithstone.components.forms.FakeContactFormModel;
import smithstone.components.forms.FakeContactFormView;
import smithstone.forms.ports.ContactModel;
import smithstone.forms.ports.ContactView;

import javax.servlet.jsp.JspContext;

public class ContactFormFactory {

    public static ContactView view(JspContext context){
        return new FakeContactFormView();
    }

    public static ContactModel model(JspContext context){
        return new FakeContactFormModel();
    }
}
