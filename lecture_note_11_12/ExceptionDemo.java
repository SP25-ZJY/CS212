package lecture_note_11_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean validInput = false;


        try {

            System.out.println("Let's divide 2 integers");

            System.out.print("Enter integer x: ");
            int x = input.nextInt();

            System.out.print("Enter integer y: ");
            int y = input.nextInt();

            System.out.println("The quotient is " + x / y);

            System.out.println("after print out the quotient");

        } catch ( InputMismatchException                         ex) { // Remove the Exception class before teaching

            System.out.println(ex.getMessage());


        } catch ( ArithmeticException                       ex) { // Remove the Exception class before teaching

            System.out.println(ex);

        }

    }
}
