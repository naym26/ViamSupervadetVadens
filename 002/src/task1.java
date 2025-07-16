import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();

        int c = b*a*(a + b)/(a*a);
        System.out.println(c);*/

        System.out.print("Input a: ");
        float a = in.nextFloat();
        System.out.print("Input b: ");
        float b = in.nextFloat();

        float c = b*a*(a + b)/(a*a);
        System.out.println(c);
    }
}
