package exercicios;

import java.util.Scanner;

public class numero03 {
    public static void main(String[] args){
        exercicio01();
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
}
