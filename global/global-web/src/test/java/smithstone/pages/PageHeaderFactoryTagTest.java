package smithstone.pages;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockPageContext;
import smithstone.global.web.PageHeaderFactoryTag;

import javax.servlet.ServletRequest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PageHeaderFactoryTagTest {


    @Test
    public void ifNoTitleProviderProvidedInScopeUseDefault() throws Exception {

        String MOCK_TITLE = "TITLE HERE";

        MockPageContext pageContext = new MockPageContext();

        PageHeaderFactoryTag tag = new PageHeaderFactoryTag();

        tag.setOut("pageHeader");
        tag.setJspContext(pageContext);
        tag.doTag();

        ServletRequest request = pageContext.getRequest();

        PageHeader header = (PageHeader) request.getAttribute("pageHeader");
        assertThat(header.getTitle(), equalTo(TitleProvider.DEFAULT_TITLE));
    }

    @Test
    public void pageHeaderExistsOnPageContext() throws Exception {

        String MOCK_TITLE = "TITLE HERE";

        MockPageContext pageContext = new MockPageContext();


        TitleProvider titleProvider = Mockito.mock(TitleProvider.class);

        Mockito.when(titleProvider.getTitle()).thenReturn(MOCK_TITLE);

        pageContext.setAttribute("titleProvider", titleProvider);

        PageHeaderFactoryTag tag = new PageHeaderFactoryTag();

        tag.setOut("pageHeader");
        tag.setJspContext(pageContext);
        tag.doTag();

        ServletRequest request = pageContext.getRequest();

        PageHeader header = (PageHeader) request.getAttribute("pageHeader");
        assertThat(header.getTitle(), equalTo(MOCK_TITLE));
    }
}

