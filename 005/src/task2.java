import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] int_arr = new int[5];

        System.out.println("¬ведите элементы массива:");

        for (int i = 0; i < int_arr.length; i++){
            System.out.printf("¬ведите %d элемент массива: ", i);
            int_arr[i] = in.nextInt();
        }

        in.close();
        for (int j = 0; j < int_arr.length; j++){
            if (j == 0) System.out.println(int_arr[j] + int_arr[int_arr.length-1]);
            else
                System.out.println(int_arr[j] + int_arr[j-1]);
        }
    }
}
