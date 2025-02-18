package lecture_note_6_7.course;

import java.util.Scanner;

public class CourseTestZee {
    public static void main(String[] args) {
        CourseZee cs212= new CourseZee();

        CourseZee cs151 = new CourseZee("Python", 4);

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4 ; i++) {

            System.out.println("Enter Grade" + (i+1));

            int grade = input.nextInt();
            cs151.update(grade, i);

        }

        System.out.println("Average is " + cs151.averageGrade());
        System.out.println("Index of 14 is: " + cs151.search(14));
    }
}
