package smithstone.pages;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PageHeaderViewTest {


    @Test
    public void pageHasProviderTitle() throws Exception {
        Document document = Jsoup.connect("http://localhost:9999/global-cq-view-tests/fixtures/header_test.jsp")
                .get();
        assertThat(document.title(), equalTo(FakeTitleProvider.TITLE));
    }
}
