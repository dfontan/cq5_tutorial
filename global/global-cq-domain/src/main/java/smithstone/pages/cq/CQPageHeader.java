package smithstone.pages.cq;

import com.day.cq.wcm.api.Page;
import smithstone.pages.PageHeader;


public class CQPageHeader implements PageHeader {

    private Page currentPage;

    public void setCqPage(Page properties) {
        this.currentPage = properties;
    }

    @Override
    public String getTitle() {
        String title = currentPage == null ? DEFAULT_TITLE : currentPage.getTitle();
        return title == null ? PageHeader.DEFAULT_TITLE : title;
    }
}
