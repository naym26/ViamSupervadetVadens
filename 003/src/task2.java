import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = in.nextLine();

        /*if(s.equals("Hi")) System.out.println("Hello");
        else if(s.equals("Bye")) System.out.println("Good bye");
        else if(s.equals("How are you")) System.out.println("How are you doing");
        else System.out.println("Unknown message");*/

        switch (s){
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are you doing");
                break;
            default:
                System.out.println("Unknown message");
        }

        in.close();
    }
}
