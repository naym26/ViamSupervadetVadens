import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("¬ведите фамилию: ");
        String fam = in.nextLine();
        System.out.print("¬ведите им€: ");
        String im = in.nextLine();
        System.out.print("¬ведите отчество: ");
        String otch = in.nextLine();
        in.close();

        System.out.println(fam + " " + im + " " + otch);
        System.out.printf("%s %s %s", fam, im, otch);
    }
}
