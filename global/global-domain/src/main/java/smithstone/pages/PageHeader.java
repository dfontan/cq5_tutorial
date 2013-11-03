package smithstone.pages;

public class PageHeader {


    public TitleProvider titleProvider;

    public PageHeader(TitleProvider titleProvider) {
        this.titleProvider = titleProvider;
    }


    public void setTitleProvider(TitleProvider titleProvider) {
        this.titleProvider = titleProvider;
    }

    public String getTitle(){
        return titleProvider.getTitle();
    }

}

