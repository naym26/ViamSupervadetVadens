import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите первое число: ");
        int num1 = in.nextInt();
        System.out.print("¬ведите второе число: ");
        int num2 = in.nextInt();

        if ((num1%2) == 0){
            System.out.println(num1*num2);
        } else System.out.println((float)num1/num2);

        if (num1 == num2){
            System.out.println("„исла равны");
        }

        in.close();
    }
}
