package smithstone.global.web;

import smithstone.pages.PageHeader;
import smithstone.pages.TitleProvider;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class PageHeaderFactoryTag extends SimpleTagSupport {

    private String out;

    @Override
    public void doTag() throws JspException, IOException {

        TitleProvider titleProvider = (TitleProvider)getJspContext().findAttribute("titleProvider");

        PageHeader header = new PageHeader(titleProvider);

        getJspContext().setAttribute(getOut(), header, PageContext.REQUEST_SCOPE);

    }

    public void setOut(String out) {
        this.out = out;
    }

    private String getOut() {
        return out;
    }
}
