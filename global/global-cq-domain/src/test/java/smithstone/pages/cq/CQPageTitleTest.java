package smithstone.pages.cq;

import com.day.cq.wcm.api.Page;
import org.junit.Test;
import org.mockito.Mockito;
import smithstone.pages.PageHeader;
import smithstone.pages.TitleProvider;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CQPageTitleTest {

    public static final String NO_TITLE = null;
    public static final String FAKE_PAGE_TITLE = "Mocked Page Title";

    @Test
    public void headerHasTitleFromCQHasTitle() throws Exception {
        CQPageTitle header = new CQPageTitle();
        header.setCqPage(fakePage(FAKE_PAGE_TITLE));
        assertThat(header.getTitle(), equalTo(FAKE_PAGE_TITLE));
    }

    @Test
    public void headerHasDefaultTitleWhenCQPageHasNoTitle() throws Exception {
        CQPageTitle header = new CQPageTitle();
        header.setCqPage(fakePage(NO_TITLE));
        assertThat(header.getTitle(), equalTo(TitleProvider.DEFAULT_TITLE));
    }

    @Test
    public void headerHasDefaultTitleWhenCQPageHasNotBeenSet() throws Exception {
        assertThat(new CQPageTitle().getTitle(), equalTo(TitleProvider.DEFAULT_TITLE));
    }

    private Page fakePage(String title) {
        Page page = Mockito.mock(Page.class);
        Mockito.when(page.getTitle()).thenReturn(title);
        return page;
    }
}
