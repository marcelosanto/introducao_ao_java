package exercicios.rectangle.entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        return  width * height;
    }

    public double Perimeter(){
        return  (width + height) * 2;
    }

    public double Diagonal(){
        double result = (width * width) + (height * height);
        return Math.sqrt(result);
    }
}
