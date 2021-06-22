package tryandcatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException event) {
            System.out.println("Invalid position");
        } catch (InputMismatchException event) {
            System.out.println("Invalid character");
        }

        System.out.println("End of program");

        sc.close();
    }
}
