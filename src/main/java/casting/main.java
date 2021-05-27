package casting;

public class main {
    public static void CalcularArea(){
       double b, B, h, area;

       b = 6.0;
       B = 8.0;
       h = 5.0;

       area = (b + B) / 2.0 * h;
       System.out.println(area);
    }

    public static void Divisao(){
        int a,b;
        double resultado;

        a = 5;
        b = 2;

        // () -> casting
        resultado = (double) a / b;
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        int x;
        double y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        CalcularArea();
        Divisao();
    }


}
