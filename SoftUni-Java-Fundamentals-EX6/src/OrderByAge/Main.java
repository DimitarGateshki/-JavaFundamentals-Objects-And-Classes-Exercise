
package OrderByAge;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input=sc.nextLine();

        List<Person> people=new ArrayList<>();

        while (!input.equals("End")){
            String[] tokens=input.split("\\s+");
            int age=Integer.parseInt(tokens[2]);

            Person persons=new Person(tokens[0],Integer.parseInt(tokens[1]),age);
            people.add(persons);
            input=sc.nextLine();
        }

        people.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(p-> System.out.println(p));


    }
}
