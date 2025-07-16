import java.util.Scanner;

public class lesson {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();

        System.out.printf("Name: %s Age: %d Height: %.2f", name, age, height);*/

        /*int a = 2;
        int b = 5;
        int result = b * 3 + 20 / 2 * a--;
        System.out.println(result);*/

        int a = 8;
        int b = 7;
        int c = a + 5 * ++b;
        System.out.println(c);  // 48
        b = 7;
        System.out.println(b);
        c = a + 5 * b++;
        System.out.println(c);
        System.out.println(b);
    }
}
