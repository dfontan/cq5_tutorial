package smithstone.components.form;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

public class ContactFormTest {


    public static final String base = "http://localhost:9999/global-views/fixtures";
    public static final String url = base + "/components/forms/contact_form/form_test.jsp";


    @Test
    public void pageRendersCorrectly() throws Exception {

        Document document = Jsoup.connect(url).get();
        assertThat(document, notNullValue());


    }
}
