package tryandcatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method();

        System.out.println("End of program");


    }

    public static void method() {
        System.out.println("Method 1 Start");

        method2();

        System.out.println("Method 1 End");
    }

    public static void method2() {
        System.out.println("Method 2 Start");

        try (Scanner sc = new Scanner(System.in)) {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException event) {
            System.out.println("Invalid position");
            event.printStackTrace();
        } catch (InputMismatchException event) {
            System.out.println("Invalid character");
            event.printStackTrace();
        } finally {
            System.out.println("Finally executed");
        }

        System.out.println("Method 2 End");
    }
}
