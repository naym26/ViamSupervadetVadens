public class task2 {
    public static void main(String[] args) {
        byte a, b;
        a = -100;
        b = -29;
        System.out.println(sum(a, b));

        short c, d;
        c = 30000;
        d = 2768;
        System.out.println(sum(c, d));

        int e, f;
        e = 30000;
        f = 2768;
        System.out.println(sum(e, f));

        long g, j;
        g = 30000L;
        j = 2769L;
        System.out.println(sum(g, j));

        boolean k,l;
        k = true;
        l = true;
        System.out.println(sum(k, l));

        System.out.println(sum('Л', 'Ё', 'Ш', 'А'));
    }

    static byte sum(byte... bytes) {
        int result = 0;
        for (byte i : bytes) {
            if (result + i > Byte.MAX_VALUE || result + i < Byte.MIN_VALUE) {
                System.out.println("Есть потеря данных byte sum");
                break;
            }

            result += i;
        }
        if (result > Byte.MAX_VALUE || result < Byte.MIN_VALUE) System.out.println("Есть потеря данных byte sum");
        return (byte) result;

    }

    static short sum(short... shorts) {
        int result = 0;
        for (short i : shorts) {
            result += i;
        }
        if (result > Short.MAX_VALUE || result < Short.MIN_VALUE) System.out.println("Есть потеря данных short sum");
        return (short) result;
    }

    static int sum(int... ints) {
        int result = 0;
        for (int i : ints) {
            result += i;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) System.out.println("Есть потеря данных int sum");
        return result;
    }

    static long sum(long... longs) {
        long result = 0;
        for (long i : longs) {
            result += i;
        }
        if (result > Long.MAX_VALUE || result < Long.MIN_VALUE) System.out.println("Есть потеря данных long sum");
        return result;
    }

    static float sum(float... floats) {
        float result = 0;
        for (float i : floats) {
            result += i;
        }
        if (result > Float.MAX_VALUE || result < Float.MIN_VALUE) System.out.println("Есть потеря данных float sum");
        return result;
    }

    static double sum(double... doubles) {
        double result = 0;
        for (double i : doubles) {
            result += i;
        }
        if (result > Double.MAX_VALUE || result < Double.MIN_VALUE) System.out.println("Есть потеря данных double sum");
        return result;
    }

    static boolean sum(boolean... booleans) {
        boolean result =true;
        for (boolean i : booleans) {
            result &= i;
        }

        return result;
    }

    static String sum(char... chars) {
        String result ="";
        for (char i : chars) {
            result += i;
        }

        return result;
    }
}
