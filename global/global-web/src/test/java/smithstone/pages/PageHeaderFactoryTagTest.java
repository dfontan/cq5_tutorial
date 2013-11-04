package smithstone.pages;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockPageContext;
import smithstone.global.web.PageHeaderFactoryTag;

import javax.servlet.ServletRequest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PageHeaderFactoryTagTest {


    private MockPageContext pageContext;
    private PageHeaderFactoryTag tag;
    private String pageContextVariableName = "pageHeader";
    private String exampleTitle;

    @Before
    public void setUp() throws Exception {
        pageContext = new MockPageContext();
        tag = new PageHeaderFactoryTag();
        exampleTitle = "TITLE HERE";
    }

    @Test
    public void ifNoTitleProviderProvidedInScopeUseDefault() throws Exception {
        assertPageHeaderAvailableHasCorrectTitle(TitleProvider.DEFAULT_TITLE);
    }

    @Test
    public void pageHeaderExistsOnPageContext() throws Exception {
        setTitleProvider();
        assertPageHeaderAvailableHasCorrectTitle(exampleTitle);
    }

    private void setTitleProvider() {
        pageContext.setAttribute(PageHeaderFactoryTag.TITLE_PROVIDER_SCOPE_ATTRIBUTE_NAME, createTitleProvider());
    }

    private TitleProvider createTitleProvider() {
        TitleProvider titleProvider = Mockito.mock(TitleProvider.class);
        Mockito.when(titleProvider.getTitle()).thenReturn(exampleTitle);
        return titleProvider;
    }

    private void assertPageHeaderAvailableHasCorrectTitle(String expectedTitle) throws Exception {
        doTag();
        assertThat(getPageHeader().getTitle(), equalTo(expectedTitle));
    }

    private PageHeader getPageHeader() {
        ServletRequest request = pageContext.getRequest();
        return (PageHeader) request.getAttribute(pageContextVariableName);
    }

    private void doTag() throws Exception {
        tag.setOut(pageContextVariableName);
        tag.setJspContext(pageContext);
        tag.doTag();
    }
}

