import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите целое число: ");
        int a = in.nextInt();
        in.close();
        int result = 0;
        for (int i = a; i !=0; i /=10){
            result += i%10;
        }
        if (result<0) result *=-1;
        System.out.printf("—умма числа %d равна %d", a, result);
        System.out.println();

        int j = a;
        int result_while = 0;
        while (j != 0){
            result_while += j%10;
            j /=10;
        }
        if (result_while<0) result_while *=-1;
        System.out.printf("—умма числа %d равна %d", a, result_while);

    }
}
