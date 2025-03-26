/*
Реализовать класс-счетчик. Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.

Реализовать для созданного класса конструктор с двумя параметрами, с одним (значение счетчика в таком случае инициализировать как 0),
методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целое значение. Методы должны возвращать актуальное значение счетчика.

Используя созданный класс, посчитать количество четных и количество нечетных чисел в ряду от 1 до 100. Конечные показатели счетчиков вывести в консоль.

Пример вывода в консоли:
   Нечетные числа: 50
   Четные числа: 50
 */
public class task1 {
    public static void main(String[] args){
        counter positive = new counter("Четные числа");
        counter negative = new counter("Нечетные числа");
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
class counter{
    String name;
    int value;

    counter(String name, int value){
        this.name = name;
        this.value = value;
    }

    counter(String name){
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

    void displayInfo(){
        System.out.printf("%s:\t %d\n", name, this.value);
    }

}
