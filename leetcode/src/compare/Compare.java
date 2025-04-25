package compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Student s = new Student(1,"John", 25);
        Student s1 = new Student(2,"John", 25);
        System.out.println(s.compareTo(s1));
        List<Student> l = Arrays.asList(new Student(1,"Alice", 25), new Student(2,"Bob", 25));
        Comparator<Student> comparator = (s3,s4)->s3.getName().compareTo(s4.getName());
        Collections.sort(l, comparator);
        l.stream().map(Student::getName).forEach(System.out::println);
    }
}
