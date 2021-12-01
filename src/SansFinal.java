import java.util.Date;

public class SansFinal {
    public static String test(String s1, int i1, long b1, Date d1) {
        String a = "1" + s1;
        int ba = 2 + i1;
        long bab = 991909000000L + b1;
        return (a + ba + bab + d1.toString());
    }
}
