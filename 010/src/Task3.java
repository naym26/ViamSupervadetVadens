/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * <p>
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * <p>
 * Вывести в консоль сумму всех элементов полученного массива.
 * <p>
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 * <p>
 * Используя эту задачу https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson7_varargs_overloading/Task5.java
 * (можете сделать на основе своего решения, но для наглядности удобства новых возможностей рекомендую взять за основу решение по ссылке):
 * <p>
 * 1.Вынесите поиск простых чисел в отдельный класс.
 * 2.Реализуйте возможность вывода на экран суммы N первых простых чисел, где N – число, введенное пользователем с клавиатуры;
 * 3.Вынесите нужные вам переменные в поля класса. Если необходимо – сделайте их константами уровня класса или объекта. Помните, константа ссылочного типа гарантирует неизменность ссылки, а не содержимого объекта. Массив – ссылочный тип.
 * Примечание: это одна задача, а не различные варианты:)
 */
import java.util.Scanner;
public class Task3 {
    public static final String EN_NUMBER = "Введите размер массива простых чисел: ";
    public static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {
        int a = enterData(EN_NUMBER);
        int[] primeNumbers = new int[a];
        IN.close();

        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2; //Тернарная операция
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = findPrimeNumber.findNextPrimeNumber(number, primeNumbers, i);
            }
        }

        System.out.println(sum(primeNumbers));
    }

    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    static int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }

    static int enterData(String pData){
        System.out.print(pData);

        return IN.nextInt();
    }
}

class findPrimeNumber{

    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
//    заполнения одного элемента массива
    static int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
        boolean isPrime = isPrime(number, primeNumbers, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, primeNumbers, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    static boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }

}