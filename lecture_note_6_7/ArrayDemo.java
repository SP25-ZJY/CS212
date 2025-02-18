package lecture_note_6_7;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int [] numbers;
        String [] names = new String[5];

        Scanner input = new Scanner(System.in);
        int size;
        int [] grades;
        numbers = new int[5];

        System.out.println("Please Enter number of grades");
        size = input.nextInt();

        grades = new int[size];
        // Getting elements of an array
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }
        // Access each element of an arrya
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + " is: " + grades[i]);
        }

        int total = 0;
        double average = 0.0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        average = total / grades.length;

        System.out.println("The average is: " + average);

        int [] newGrades = grades;

        newGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            newGrades[i] = grades[i];
        }



    }
}
