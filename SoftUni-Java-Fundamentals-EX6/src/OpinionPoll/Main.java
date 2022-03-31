package OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int people=Integer.parseInt(sc.nextLine());

        List<Person> people1=new ArrayList<>();

        for (int i = 0; i < people; i++) {
            String[] info=sc.nextLine().split("\\s+");
            Person person=new Person(info[0],Integer.parseInt(info[1]));
            people1.add(person);
        }

        people1.stream().filter(e-> e.getAge()>30).sorted(Comparator.comparing(Person::getName)).forEach(e-> System.out.println(e));

    }
}
