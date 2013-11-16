package smithstone.global.web;

import smithstone.forms.ContactForm;
import smithstone.forms.ports.ContactModel;
import smithstone.forms.ports.ContactView;
import smithstone.global.factories.ContactFormFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class ContactFormFactoryTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        ContactForm form = new ContactForm();
        form.setModel(ContactFormFactory.model(getJspContext()));
        form.setView(ContactFormFactory.view(getJspContext()));
        getJspContext().setAttribute("form", form, PageContext.REQUEST_SCOPE);
    }


}

