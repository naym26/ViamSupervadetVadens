import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();

        in.close();
        boolean c =a*a*a > b*b;
        System.out.println(c);
    }
}
