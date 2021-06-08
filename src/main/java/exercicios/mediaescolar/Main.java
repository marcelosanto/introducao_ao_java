package exercicios.mediaescolar;

import exercicios.mediaescolar.entities.Media;
import exercicios.salario.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Media media = new Media();

        System.out.print("Name: ");
        media.name = sc.nextLine();

        System.out.print("Nota 1: ");
        media.nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        media.nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        media.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + media);
    }
}
