package estruturarepeticao;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        usandoFor();
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
}
