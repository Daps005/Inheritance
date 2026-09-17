// Private and protected are not allowed as class modifiers here

public class Person {
    // height, age, color, name, weight
    double height;
    int age;
    String color;
    String name;
    double weight;

    // Constructors can have private protected public access modifiers

    public Person() {
        height = 48;
        age = 18;
        color = "black";
        name = "";
        weight = 140;
    }

    // Protected members are accessible within the same package - java files under same directory/folder
    protected Person(double height, int age) {
        this.height = height;
        this.age = age;

    }

    // Overloaded constructor
    private Person(double height, int age, String color, String name, double weight) {
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
    public void Call_Private(){

    }
}

