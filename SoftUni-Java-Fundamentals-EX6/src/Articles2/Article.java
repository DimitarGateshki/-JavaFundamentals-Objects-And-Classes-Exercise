package Articles2;

public class Article {
    private String Title;
    private String Content;
    private String Author;

    public Article(String title, String content, String author) {
        Title = title;
        Content = content;
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",this.Title,this.Content,this.Author);
    }
}
