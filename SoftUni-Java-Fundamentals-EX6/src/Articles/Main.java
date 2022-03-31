package Articles;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        String[] split=input.split(", ");
        Articles first=new Articles(split[0],split[1],split[2] );

        int operation=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < operation; i++) {
            input= sc.nextLine();
            String[] splitChange=input.split(": ");
            switch (splitChange[0]){
                case "Edit":
                    first.edit(splitChange[1]);
                    break;
                case "ChangeAuthor":
                    first.changeAuthor(splitChange[1]);
                    break;
                case "Rename":
                    first.changeTitle(splitChange[1]);
                    break;

            }

        }
        System.out.println(first);

    }
}
