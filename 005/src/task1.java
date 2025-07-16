public class task1 {
    public static void main(String[] args){
        char[] char_array = {'Ë', '¨', 'Ø', 'À'};
        String myname="";
        for(char i : char_array){
            myname += (i);
            System.out.printf("%s", i);
        }
        System.out.println();
        System.out.println(myname);

    }
}
