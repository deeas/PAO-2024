package composition;

public class Page {
    private Integer pageNumber;
    private String content;

    public Page(Integer pageNumber, String content) {
        this.pageNumber = pageNumber;
        this.content = content;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
