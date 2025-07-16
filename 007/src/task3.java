//Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.
import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.close();
        System.out.println(factorial(a));

    }
    static int factorial(int p_int){
        int result = 0;
        if(p_int == 1){
            return 1;
        }
        if(p_int == 0){
            return 0;
        }

        return factorial(p_int-1) * p_int;
    }
}
