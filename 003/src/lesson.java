import java.util.Scanner;
public class lesson {
    public static void main(String[] args){
        /*int x=1;
        int y=2;
        int z = x<y? (x+y) : (x-y);
        System.out.println(z);*/

        /*int a = 5;
        if (a <= 0){
            if (a == 5){
                a++;
            }
            else {
                a--;
            }
        }
        */

        //task1
        Scanner in = new Scanner(System.in);
        /*System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();

        in.close();
        if (a > b){
            System.out.printf("Число %d больше числа %d", a, b);
        }
        else if (a == b){
            System.out.printf("Число %d равно числу %d", a, b);
        }
        else{
            System.out.printf("Число %d меньше числа %d", a, b);
        }*/

        //task2
        /*System.out.print("Введите число: ");
        int a = in.nextInt();
        if (a < 9 && a > 2){
            System.out.println("Число больше 2 и меньше 9");
        }
        else{
            System.out.println("Неизвестное число");
        }
        in.close();*/

        //task4
        System.out.print("Введите первое число");
        int num1 = in.nextInt();
        System.out.print("Введите второе число");
        int num2 = in.nextInt();
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
        int a = in.nextInt();

        switch(a){
            case 1:
                System.out.println("Сложение");
                System.out.print("Результат операции: " + (num1+num2));
                break;
            case 2:
                System.out.println("Вычитание");
                System.out.print("Результат операции: " + (num1-num2));
                break;
            case 3:
                System.out.println("Умножение");
                System.out.print("Результат операции: " + (num1*num2));
                break;
            default:
                System.out.println("Операция не определена");

        }

        in.close();
    }
}
