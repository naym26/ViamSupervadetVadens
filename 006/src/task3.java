import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("¬ведите длину пр€моугольника: ");
        int a = in.nextInt();
        System.out.print("¬ведите ширину пр€моугольника: ");
        int b = in.nextInt();

        in.close();

        for (int s = 1; s <= b+2; s++) {
            for (int d = 1; d <= a+2; d++) {
                //boolean bool = d == 1 || d == a;
                /*if (s == 1 || s == b+2) {
                    if (d == 1 || d == a+2) {
                        System.out.print(" ");
                    } else System.out.print("-");
                } else if (d == 1 || d == a+2) {
                    System.out.print("|");
                } else
                    System.out.print(" ");*/

                printSquar(s, b, d, a);
            }
            System.out.println();
        }
    }

    static void printSquar(int s, int b, int d, int a){
        if (s == 1 || s == b+2) {
            if (d == 1 || d == a+2) {
                System.out.print(" ");
            } else System.out.print("-");
        } else if (d == 1 || d == a+2) {
            System.out.print("|");
        } else
            System.out.print(" ");
    }
}
