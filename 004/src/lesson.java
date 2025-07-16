import java.util.Scanner;
public class lesson {
    public static void main(String[] args){
        /*for(int i = 1; i < 3; i++)
        {
            System.out.printf("i = %d \n", i);
            switch (i)
            {
                default:
                    System.out.printf("i = %d \n", i++);
                    System.out.printf("i = %d \n", i);
                    break;
            }
            System.out.printf("i = %d \n", i);
        }*/

        //task1
        /*int naseleine = 10000000;
        int born = 14;
        int deaht = 8;
        int fokus = 1000;

        int delta = born - deaht;

        int delta_nas;

        for(int i = 1; i < 11; i++){
            //delta_nas = delta * (naseleine/fokus);
            naseleine += delta * naseleine / fokus;
            System.out.println(naseleine);
        }
        System.out.println(naseleine);*/

        //task2
        /*int naseleine = 10000000;
        int born = 14;
        int deaht = 8;
        int fokus = 1000;

        for(int i = 1; i <=10; i++){
            if (born > 7) born -= 1;
            if (deaht > 6) deaht -= 1;
            int delta = born - deaht;
            naseleine += delta * naseleine / fokus;


        }
        System.out.println(naseleine);*/

        //task3
        /*Scanner in = new Scanner(System.in);

        System.out.print("¬ведите сумму вклада: ");
        int sum = in.nextInt();
        System.out.print("¬ведите срок вклада в мес€цах: ");
        int month = in.nextInt();

        float new_sum = sum;
        for(int i = 1; i <= month; i++){
            new_sum += new_sum*7/100;
        }
        System.out.println(new_sum);
        in.close();*/

        //task5
        /*Scanner in = new Scanner(System.in);

        System.out.print("¬ведите сумму вклада: ");
        int sum = in.nextInt();
        System.out.print("¬ведите срок вклада в мес€цах: ");
        int month = in.nextInt();

        float new_sum = sum;
        int i = 1;
        while(i <= month){
            new_sum += new_sum*7/100;
            i++;
        }
        System.out.println(new_sum);
        in.close();*/

        //task6
        /*for(int i = 1;i < 10;i++){
            for (int j = 1; j < 10;j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }*/

        //task7
        Scanner in = new Scanner(System.in);
        int input;
        do{
            System.out.print("¬ведите первое число: ");
            int a = in.nextInt();
            System.out.print("¬ведите второе число: ");
            int b = in.nextInt();
            System.out.printf("–езультат умножени€ %d \n", a*b);
            System.out.print("ƒл€ завершени€ нажмите 1: ");
            input = in.nextInt();
        }
        while(input != 1);
        in.close();
    }
}
