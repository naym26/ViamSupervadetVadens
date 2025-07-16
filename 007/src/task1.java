public class task1 {
    public static void main(String[] args){
        System.out.println(concat("слово1", "слово2", "слово3"));
    }
    static String concat(String ...rows){
        String result = "";
        for(String x: rows){
            result += " " + x;
        }
        return result;
    }
}
