// Student class will inherit person class
// How to inherit: extends
// How many class can a class inherit:
// Person is the parent class and student is the child class
// Student is the sub class and person is the super class

public class Student extends Person{
    // Attributes are inherited - Not the private attributes
    // Methods are inherited - Not the private methods
    // Setters and getters are inherited - Not the private methods

    // Constructors are not inherited but you an use the constructors

    int student_id;
    double gpa;

    Student(){

    }
}
