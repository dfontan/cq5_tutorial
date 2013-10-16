package smithstone.pages;

public interface TitleProvider {

    String DEFAULT_TITLE = "-";

    String getTitle();


    static class NullTitleProvider implements TitleProvider {

        @Override
        public String getTitle() {
            return DEFAULT_TITLE;
        }
    }
}
