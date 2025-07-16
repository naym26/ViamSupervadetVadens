/*
»спользу€ кодовую базу из задачи(https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson6_methods/Task3.java) вынести строковые и символьные литералы в константы. ѕопробуйте нарисовать пр€моугольник, использу€ == дл€ каждой единицы длины и || Ц дл€ каждой единицы ширины.

“акже попробуйте записать в константу переменную scanner. ”проститс€ ли использование сканера внутри методов чтени€ с клавиатуры?
* */
import java.util.Scanner;

public class Task1 {
    public static final String LENGTH = "-";
    public static final String WIDTH = "|";
    public static final String CORNER = "#";
    public static final String SPACE = " ";

    public static final Scanner IN = new Scanner(System.in);

    public static final String enLength = "¬ведите длину пр€моугольника: ";
    public static final String enWidth = "¬ведите ширину пр€моугольника: ";

    public static void main(String[] args){

        int a = enterData(enLength);

        int b = enterData(enWidth);

        IN.close();

        for (int s = 1; s <= b+2; s++) {
            for (int d = 1; d <= (a+2); d++) {
                printSquar(s, b, d, a);
            }
            System.out.println();
        }
    }

    static void printSquar(int s, int b, int d, int a){
        if (s == 1 || s == (b+2)) {
            if (d == 1 || d == (a+2)) {
                System.out.print(CORNER);
            } else System.out.print(LENGTH);
        } else if (d == 1 || d == (a+2)) {
            System.out.print(WIDTH);
        } else
            System.out.print(SPACE);
    }

    static int enterData(String pData){
        System.out.print(pData);

        return IN.nextInt();
    }
}
