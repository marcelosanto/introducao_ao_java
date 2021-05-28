package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class numero02 {
    public static void Soma(){
        Scanner sc = new Scanner(System.in);

        int x,y, resultado;

        x = sc.nextInt();
        y = sc.nextInt();

        resultado = x + y;

        System.out.println("SOMA = " + resultado);

        sc.close();
    }

    public static void Raio(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x,y, result;

        x = sc.nextDouble();

        y = Math.pow(x,2);

        result = (double) 3.14159 * y;

        System.out.printf("A = %.4f" , result);

        sc.close();
    }

    public static void Diferenca(){
        Scanner sc = new Scanner(System.in);

        int a,b,c,d, resul;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        resul = (a*b)-(c*d);

        System.out.println("DIFERENCA = " + resul);

        sc.close();
    }

    public static void Salario(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a,b;
        double c, resu;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();

        resu = (double) b * c;

        System.out.println("NUMBER = " + a);
        System.out.println("SALARY = U$ " + resu);

        sc.close();
    }


    public static void Construcao(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }

    public static void CalcularObjeto(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }

    public static void main(String[] args) {
        //Soma();
        //Raio();
        //Diferenca();
        //Salario();
        //Construcao();
        CalcularObjeto();
    }
}
