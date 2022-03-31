package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=Integer.parseInt(sc.nextLine());
        List<Student> students=new ArrayList<>();
        for (int i = 0; i < input; i++) {
            String[] info= sc.nextLine().split("\\s+");
            Student student=new Student(info[0],info[1],Double.parseDouble(info[2]));
            students.add(student);
        }

        students.stream().sorted(Comparator.comparingDouble(Student::getGrade).reversed()).forEach(s-> System.out.println(s));

    }
}
