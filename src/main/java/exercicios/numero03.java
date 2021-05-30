package exercicios;

import java.util.Scanner;

public class numero03 {
    public static void main(String[] args){

        exercicio04();
    }

    public static void exercicio01(){
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Informe um numero: ");
        x = sc.nextInt();

        if(x >= 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

    }

    public static void exercicio02(){
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Informe um numero: ");
        x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }

    public static void exercicio03(){
        Scanner sc = new Scanner(System.in);
        int x, y, resul;

        System.out.println("Informe dois numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if(x > y) {
            resul = x / y;
            if(resul * y == x) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Não sao Multiplos");
            }
        } else {
            resul = y / x;
            if( resul * x == y) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Não sao Multiplos");
            }
        }

    }

    public static void exercicio04(){
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Informe um numero: ");
        x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }
}
