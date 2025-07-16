import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите строку");
        String s = in.nextLine();

        mySwitch(s);

        in.close();
    }

    static void mySwitch(String p_string) {
        switch (p_string) {
            case "Hi":
                myOutput("Hello");
                break;
            case "Bye":
                myOutput("Good bye");
                break;
            case "How are you":
                myOutput("How are you doing");
                break;
            default:
                myOutput("Unknown message");
        }
    }

    static void myOutput(String p_string) {
        System.out.println(p_string);
    }
}
