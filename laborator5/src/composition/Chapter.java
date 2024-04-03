package composition;

public class Chapter {
    private String name;
    private Page[] pages;

    public Chapter(String name, Page[] pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Page[] getPages() {
        return pages;
    }

    public void setPages(Page[] pages) {
        this.pages = pages;
    }
}
