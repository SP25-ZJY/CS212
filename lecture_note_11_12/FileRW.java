package lecture_note_11_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileRW {

    public static void main(String[] args) {

        File inputFile = new File("names.txt");

        try {
            Scanner input = new Scanner(inputFile);
            String name = input.next();
            System.out.println("first name: " + name);
            name = input.next();
            System.out.println("second name: " + name);

        } catch (FileNotFoundException ex){
            System.out.println("Cannot open the file");
        }

        try {
            FileOutputStream fileOutput = new FileOutputStream("test.txt", true);
            PrintWriter pw = new PrintWriter(fileOutput);

            pw.print("CS 212");
            int year = 2024;
            pw.print(year);

            pw.println("Hello, world!" + year);


            pw.close();
        }catch (FileNotFoundException ex){
            System.out.println("Cannot open the file");
        }

    }
}