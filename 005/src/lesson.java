public class lesson {
    public static void main(String[] args) {
        String[] nums = new String[5];
        for (String s : nums) {
            s = "!";
            System.out.println(s);
        }

        for (String s : nums) {
            System.out.println(s);
        }
    }
}
