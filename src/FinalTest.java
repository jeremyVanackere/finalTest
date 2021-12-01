import java.util.Date;

/**
 * Le mot-clef final sur une variable ne concerne que la compilation.
 * Le compilateur va soit en faire une constante (si la valeur peut être déterminé à la compilation), soit simplement vérifier que la variable ne sera initialisé qu'une seule fois.
 *
 * Mais cela n'a aucun impact sur le bytecode généré, et il ne peut donc pas y avoir de différence à l'exécution (tant qu'on n'est pas dans le cas de la constante bien sûr).
 *
 *
 * Malgré tout je recommande l'utilisation de final sur les variables, lorsque c'est possible, pour un code plus propre.
 */
public class FinalTest {

    public static final int N_ITERATIONS = 10000000;
    private static final int NBL = 9995556;

    public static String testFinal() {
        final String a = "a";
        final String b = "b";
        return a + b;
    }

    public static String testNonFinal() {
        String a = "a";
        String b = "b";
        return a + b;
    }

    public static void main(String[] args) {
        /**
         * test 1
         */
        long tStart, tElapsed;

        tStart = System.currentTimeMillis();
        for (int i = 0; i < N_ITERATIONS; i++)
            testFinal();
        tElapsed = System.currentTimeMillis() - tStart;
        System.out.println("Method with finals took " + tElapsed + " ms");

        tStart = System.currentTimeMillis();
        for (int i = 0; i < N_ITERATIONS; i++)
            testNonFinal();
        tElapsed = System.currentTimeMillis() - tStart;
        System.out.println("Method without finals took " + tElapsed + " ms");

        /**
         * test 2
         */
        long t1, t2;
        long b1 = System.currentTimeMillis();
        String s1 = "Hello" + b1;
        int i1 = s1.length();
        Date d1 = new Date();

        t1 = System.currentTimeMillis();
        for (int i = 0; i < NBL; i++) {
            AvecFinal.test(s1, i1, b1, d1);
        }
        System.out.println("avec final: " + (System.currentTimeMillis() - t1));

        t2 = System.currentTimeMillis();
        for (int i = 0; i < NBL; i++) {
            SansFinal.test(s1, i1, b1, d1);
        }
        System.out.println("sans final: " + (System.currentTimeMillis() - t2));
    }

}
