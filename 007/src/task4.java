import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a < 1){
            System.out.println("¬веденное число меньше 1");
            return;
        }
        in.close();
        System.out.println(root(a));
    }

    static double root(int number){
        return root(1, number);
    }

    static double root(int num1, int num2){
        if (num1 == num2){
            return Math.sqrt(num1);
        }

        return Math.sqrt(num1 + root(num1+1, num2));
    }
}
