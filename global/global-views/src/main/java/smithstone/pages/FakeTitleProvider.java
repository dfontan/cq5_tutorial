package smithstone.pages;

public class FakeTitleProvider implements TitleProvider {

    public static final String TITLE = "MOO";


    @Override
    public String getTitle() {
        return TITLE;
    }
}
