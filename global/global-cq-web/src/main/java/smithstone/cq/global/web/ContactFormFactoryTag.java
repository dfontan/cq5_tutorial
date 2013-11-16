package smithstone.cq.global.web;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import smithstone.components.forms.adapter.CQContactFormModel;
import smithstone.components.forms.adapter.CQContactFormView;
import smithstone.forms.ContactForm;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class ContactFormFactoryTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        CQContactFormModel model = new CQContactFormModel();
        model.setResource((Resource) getJspContext().findAttribute("resource"));
        CQContactFormView view = new CQContactFormView();
        view.setProperties((ValueMap) getJspContext().findAttribute("properties"));
        ContactForm form = new ContactForm(view, model);
        getJspContext().setAttribute("form" , form, PageContext.REQUEST_SCOPE);
    }
}
