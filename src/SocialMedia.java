public abstract class SocialMedia {
    private String name;
    private String author;
    private String sinceYear;

    public SocialMedia(String name, String author, String sinceYear) {
        this.name = name;
        this.author = author;
        this.sinceYear = sinceYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSinceYear() {
        return sinceYear;
    }

    public void setSinceYear(String sinceYear) {
        this.sinceYear = sinceYear;
    }

    public final boolean addicted() {
        return true;
    }
}
