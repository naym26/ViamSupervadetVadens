import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        in.close();

        if(a%2==0 || b%3==0){
            if(a > b) System.out.println(a + " больше " + b);
            else if(a == b) System.out.println(a + " равно " + b);
            else System.out.println(a + " меньше " + b);
        }

        if(((a%2)==0) && ((a%3)==0)){
            if (Math.pow(a,b) > Integer.MAX_VALUE) System.out.println("Результат выражения слишком большой!");
            else if(Math.pow(a,b) < Integer.MIN_VALUE) System.out.println("Результат выражения слишком маленький!");
            else System.out.println(Math.pow(a,b));
        }
    }
}
