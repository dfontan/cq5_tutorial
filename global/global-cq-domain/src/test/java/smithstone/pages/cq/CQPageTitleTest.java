package smithstone.pages.cq;

import com.day.cq.wcm.api.Page;
import org.junit.Test;
import org.mockito.Mockito;
import smithstone.pages.TitleProvider;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CQPageTitleTest {

    public static final String NO_TITLE = null;
    public static final String FAKE_PAGE_TITLE = "Mocked Page Title";

    @Test
    public void headerHasTitleFromCQHasTitle() throws Exception {
        assertTitle(FAKE_PAGE_TITLE, FAKE_PAGE_TITLE);
    }

    @Test
    public void headerHasDefaultTitleWhenCQPageHasNoTitle() throws Exception {
        assertTitle(NO_TITLE, TitleProvider.DEFAULT_TITLE);
    }

    private void assertTitle(String actual, String expected) {
        CQPageTitle header = new CQPageTitle();
        header.setCqPage(fakePage(actual));
        assertThat(header.getTitle(), equalTo(expected));
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
