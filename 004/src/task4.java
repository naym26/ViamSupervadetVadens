import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int a = in.nextInt();
        in.close();

        for(int i = 1; i <= 10; i++){
            if (i == a) System.out.println("Числа равны");
            else if(i%2 == 0) System.out.printf("Сумма чисел %d и %d равна %d \n", i, a, i+a);
            else System.out.printf("Разность чисел %d и %d равна %d \n", i, a, i-a);
        }
    }
}
