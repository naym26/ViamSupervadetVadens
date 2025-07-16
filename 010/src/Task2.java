/*
Для задачи https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson8_classes_objects
реализуйте неизменность поля названия у класса Counter.
Ведь очень странно, если мы можем менять название счетчика по ходу выполнения программы, не так ли?
* */
public class Task2 {
    public static void main(String[] args){
        counter2 positive = new counter2("Четные числа");
        counter2 negative = new counter2("Нечетные числа");
        for (int i = 1; i <= 100; i++){
            if (i%2 == 0){
                positive.increase();
            }
            else{
                negative.increase();
            }
        }
        positive.displayInfo();
        negative.displayInfo();

    }

}
class counter2{

    public String name;
    int value;

    counter2(String name, int value){
        setName(name);
        this.value = value;
    }

    counter2(String name){
        this(name, 0);
    }

    int increase(){
        this.value += 1;
        return this.value;
    }

    int increase(int value){
        this.value += value;
        return this.value;
    }

    int decrease(){
        this.value -= value;
        return this.value;
    }

    int decrease(int value){
        this.value -= value;
        return this.value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void displayInfo(){
        System.out.printf("%s:\t %d\n", name, this.value);
    }

}
