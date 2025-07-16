import java.util.Scanner;

/**
 * ¬ычислите результат выражени€, использу€ рекурсивный алгоритм.
 * n Ч число, введенное с клавиатуры.
 * ƒл€ N < 1 Ч вывести соответствующее сообщение в консоль и завершить выполнение программы.
 * <p>
 * ¬ыражение: ?(1 + ?(2 + ... + ?n)))
 */
public class task4_ask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number <= 0) {
            System.out.println("The number must be at least 1");
            return;
        }

        System.out.println(calculateExpression(number));
    }

    //    ƒелаем удобный дл€ использовани€ метод с одним параметром
    static double calculateExpression(int number) {
        return calculateExpression(1, number);
    }

    //    –еализуем рекурсивный метод, второй параметр которого необходим,
//    но всегда известен дл€ первого вызова
    static double calculateExpression(int number, int maxNumber) {
        if (number == maxNumber) {
            return Math.sqrt(number);
        }

        return Math.sqrt(number + calculateExpression(number + 1, maxNumber));
    }
}