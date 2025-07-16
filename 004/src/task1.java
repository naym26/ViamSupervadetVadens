import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = in.nextInt();
        in.close();
        int result = 1;
        for (int i = 1; i <=a; i++){
            result *= i;
        }
        System.out.println("Факториал числа " + a + " - " + result);



    }
}
