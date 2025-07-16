
import java.util.Scanner;

/**
 * Используя задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson7_varargs_overloading/Task5.java">...</a>
 * (можете сделать на основе своего решения,
 * но для наглядности удобства новых возможностей рекомендую взять за основу решение по ссылке):
 * <p>
 * 1. Вынесите поиск простых чисел в отдельный класс.
 * <p>
 * 2. Реализуйте возможность вывода на экран суммы N первых простых чисел,
 * где N – число, введенное пользователем с клавиатуры;
 * <p>
 * 3. Вынесите нужные вам переменные в поля класса.
 * Если необходимо – сделайте их константами уровня класса или объекта.
 * Помните, константа ссылочного типа гарантирует неизменность ссылки, а не содержимого объекта.
 * Массив – ссылочный тип.
 */
public class Task3Ask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of prime numbers: ");
        int numbersLimit = scanner.nextInt();

        scanner.close();

        PrimeNumbersFinder primeNumbersFinder = new PrimeNumbersFinder(numbersLimit);
        int[] primeNumbers = primeNumbersFinder.findPrimeNumbers();

        System.out.println(sum(primeNumbers));
    }

    static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    static int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }
}

class PrimeNumbersFinder {
    //    Вынося массив как константу уровня объекта,
//    мы получаем возможность не передавать ее как параметр.
//    А также использовать массив повторно, если простые числа уже найдены
    public final int[] primeNumbers;

    public PrimeNumbersFinder(int numbersLimit) {
        this.primeNumbers = new int[numbersLimit];
    }

    public int[] findPrimeNumbers() {
//        Если массив уже заполнен - нет смысла пересчитывать
        if (primeNumbers[primeNumbers.length - 1] != 0) {
//            Более верным решением было бы возвраать копию массива.
//            Но мы еще не изучили модификаторы доступа и не можем ограничить получение
//            массива как поля класса, поэтому возвращение копии пока избыточно
            return primeNumbers;
        }

        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = findNextPrimeNumber(number, i);
            }
        }

        return primeNumbers;
    }

    public int findNextPrimeNumber(int number, int currentIndex) {
        boolean isPrime = isPrime(number, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, currentIndex);
    }

    public boolean isPrime(int number, int currentIndex) {
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