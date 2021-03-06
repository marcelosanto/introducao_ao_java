package metodoabstrato;

import metodoabstrato.entities.Circle;
import metodoabstrato.entities.Rectangle;
import metodoabstrato.entities.Shape;
import metodoabstrato.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + i + " data");
            System.out.print("Rectangle or Circle (r/c)? ");
            char tipo = sc.next().charAt(0);

            if (tipo == 'r') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                sc.nextLine();
                String color = sc.next();

                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(Color.valueOf(color), width, height));

            } else if (tipo == 'c') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                sc.nextLine();
                String color = sc.next();

                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(Color.valueOf(color), radius));
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
