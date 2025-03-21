package lecture_note_11_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;



public class ReadGradesFromFile{

    public static ArrayList<Integer> readGrades(String filename){
        File inputFile = new File (filename);
        Scanner input = null;
        try {
            input = new Scanner(inputFile);
        }
        catch (FileNotFoundException fnfe) {
            //handle exception here
            return null;
        }

        ArrayList <Integer> grades = new ArrayList<>();

        while(input.hasNext( )){
            int grade = input.nextInt();
            grades.add(grade);
        }
        input.close();
        return grades;
    }


    public static void main(String[] args) {
        ArrayList<Integer> myGrades;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the filename?");

        String fname = input.next();

        myGrades = readGrades(fname);

        System.out.println(myGrades);


    }
}