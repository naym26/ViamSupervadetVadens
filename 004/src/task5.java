import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a;
        do{
            System.out.println("Не угадал!");
        }
        while (in.nextInt() != 1);
        in.close();

    }
}
