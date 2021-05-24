import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double y = 32.325255;

        System.out.println(y);
        System.out.printf("%.4f%n", y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", y);
        System.out.println("RESULTADO = " + y + " METROS");
    }
}
