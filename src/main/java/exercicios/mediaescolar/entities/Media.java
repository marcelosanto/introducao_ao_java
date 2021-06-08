package exercicios.mediaescolar.entities;

public class Media {
    public  String name;
    public  Double nota1;
    public  Double nota2;
    public  Double nota3;

    public double CalcularNota(){
        return nota1 + nota2 + nota3;
    }

    public  String toString(){
        if(CalcularNota() >= 60.00){
            return String.format("%.2f",CalcularNota())
                    + " - PASS";
        } else {
            double points = 60.00 - CalcularNota();
            return "FAILED "
                    + "MISSING - "
                    + String.format("%.2f",points)
                    + " - POINTS";
        }
    }
}
