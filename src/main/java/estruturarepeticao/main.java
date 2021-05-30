package estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        usandoDoWhile();
    }

    public static void usandoWhile(){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = 0;

        while (x != 0){
            y += x;
            x = sc.nextInt();

        }

        System.out.println(y);

        sc.close();
    }

    public static void usandoFor(){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;

        for (int i =0; i<x; i++){
            soma += i;

        }

        System.out.println(soma);

        sc.close();
    }

    public static void usandoDoWhile(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double x ;

        double  fahrenheit = 0;
        char resp;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            x = sc.nextDouble();
           fahrenheit = x * 1.8 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f %n", fahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }while (resp != 'n');



        sc.close();
    }
}
