package estruturacondicional;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //ifOuElse();
        switchCase();
    }

    public static void ifOuElse() {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if(hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }

    public  static void switchCase(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero:");
        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
    }
}
