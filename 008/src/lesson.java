public class lesson {

    public static void main(String[] args) {

        Person undef = new Person();
        undef.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();
        method1(sam);
        sam.displayInfo();


    }

    static void method1(Person person) {
        person.name = "Желтый";
        System.out.println(person.name);
    }
}

class Person {

    String name;    // имя
    int age;        // возраст

    Person() {
        this("Undefined", 18);
        /*this.name = "Undefined";
        this.age = 19;*/
    }

    Person(String name) {
        this(name, 18);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
