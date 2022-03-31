package AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] phrase= new String[]{ "Excellent product.", "Such a great product.", "I always use that product.","Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String[] events= new String[] {"Now I feel good, I have succeeded with this product."," Makes miracles. I am happy of the results.",
                "I cannot believe but now I feel awesome.","Try it yourself, I am very satisfied."," I feel great!"};
        String[] authors= new String[]{"Diana","Petya","Stella","Elena","Katya", "Iva", "Annie", "Eva"};
        String[] cities= new String[]{"Burgas","Sofia","Plovdiv","Varna","Ruse"};

        int massages=Integer.parseInt(sc.nextLine());
        Random random=new Random();

        for (int i = 0; i < massages; i++) {
            StringBuilder sb=new StringBuilder();
            sb.append(phrase[random.nextInt(phrase.length)]+" ");
            sb.append(events[random.nextInt(events.length)]+" ");
            sb.append(authors[random.nextInt(authors.length)]+ " - ");
            sb.append(cities[random.nextInt(cities.length)]);
            sb.append(System.lineSeparator());
            System.out.print(sb);
        }

    }
}
