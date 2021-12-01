import java.util.Date;

public class AvecFinal {
    public static String test(final String s1, final int i1, final long b1, final Date d1) {
        final String a = "1" + s1;
        final int ba = 2 + i1;
        final long bab = 991909000000L + b1;
        return (a + ba + bab + d1.toString());
    }
}


