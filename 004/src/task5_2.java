import java.util.Scanner;
public class task5_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = 0;

        /*while (a != 1){
            System.out.println("Не угадал!");
            System.out.print("Введите число: ");
            a = in.nextInt();
        }*/
        while (in.nextInt() != 1){
            System.out.println("Не угадал!");
        }
        in.close();

    }
}
