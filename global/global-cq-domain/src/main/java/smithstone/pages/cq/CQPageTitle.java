package smithstone.pages.cq;

import com.day.cq.wcm.api.Page;


public class CQPageTitle {

    private Page currentPage;

    public CQPageTitle() {
    }

    public void setCqPage(Page properties) {
        this.currentPage = properties;
    }

    public String getTitle() {
        return "";
//        return currentPage == null ? DEFAULT_TITLE : currentPage.getTitle() == null ? DEFAULT_TITLE : currentPage.getTitle();
    }
}
