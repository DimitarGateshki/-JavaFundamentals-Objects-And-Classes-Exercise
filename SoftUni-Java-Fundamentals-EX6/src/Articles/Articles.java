package Articles;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void   edit(String newInfo){
        this.content=newInfo;
    }

    public  void changeAuthor(String newAuthor){
        this.author=newAuthor;
    }

    public  void changeTitle(String newTitle){
        this.title=newTitle;
    }

@Override
    public String toString(){
        String result=String.format("%s - %s: %s",this.title,this.content,this.author);
        return result;
    }
}
