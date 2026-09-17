//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
//        Person p2 = new Person(72, 70, "Black", "Barack Obama", 170);
//        System.out.println(p2.name);
        Person p2 = new Person(72, 70);

        System.out.println(p2.name);

        Student s1 = new Student();
        s1.age = 20;
        s1.gpa = 4.00;
        System.out.println(s1.gpa);

        Instructor instructor1 = new Instructor();
        instructor1.age = 45;
        instructor1.name = "Bellamy Sanders";
        instructor1.weight = 188.7;
        instructor1.height = 75;
        instructor1.color = "Black";
        instructor1.instructor_id = 1234567;
        instructor1.department = "Computer Science";
        instructor1.officeNumber = "CSB 222";

        System.out.println(instructor1.age);
        System.out.println(instructor1.name);
        System.out.println(instructor1.weight);
        System.out.println(instructor1.height);
        System.out.println(instructor1.color);
        System.out.println(instructor1.instructor_id);
        System.out.println(instructor1.department);
        System.out.println(instructor1.officeNumber);


    }
}