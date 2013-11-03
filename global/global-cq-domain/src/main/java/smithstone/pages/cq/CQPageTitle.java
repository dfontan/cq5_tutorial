package smithstone.pages.cq;

import com.day.cq.wcm.api.Page;
import smithstone.pages.TitleProvider;


public class CQPageTitle implements TitleProvider {

    private Page currentPage;

    public void setCqPage(Page properties) {
        this.currentPage = properties;
    }

    @Override
    public String getTitle() {
        return currentPage == null ? DEFAULT_TITLE : currentPage.getTitle() == null ? DEFAULT_TITLE : currentPage.getTitle();
    }
}
