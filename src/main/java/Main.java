import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double y = 32.325255;

        String nome = "Marcelo";
        int idade = 30;
        double renda  = 1300.0;

        System.out.println(y);
        System.out.printf("%.4f%n", y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", y);
        System.out.println("RESULTADO = " + y + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", y);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
