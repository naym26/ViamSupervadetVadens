public class Lesson {

    public static void main(String... args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        System.out.println(counter1.counter);
        counter1.counter++;
        System.out.println(counter1.counter);
        counter2.counter++;
        System.out.println(counter1.counter);

        System.out.println(counter1.counter + " " + counter2.counter);
    }
}
class Counter {
    public static int counter;
}
