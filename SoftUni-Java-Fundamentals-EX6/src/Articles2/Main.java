package Articles2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Article> articles=new ArrayList<>();

        int operations=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < operations; i++) {
            List<String> article= Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

            Article article1=new Article(article.get(0),article.get(1),article.get(2));
            articles.add(article1);
        }

        String input=sc.nextLine();


            switch (input){
                case "title":
                    articles.stream().sorted(Comparator.comparing(Article::getTitle))
                            .forEach(article -> System.out.println(article));
                    break;
                case "content":
                    articles.stream().sorted(Comparator.comparing(Article::getContent))
                            .forEach(article -> System.out.println(article));
                    break;
                case "author":
                    articles.stream().sorted(Comparator.comparing(Article::getAuthor))
                            .forEach(article -> System.out.println(article));
                    break;
            }

        }


}
