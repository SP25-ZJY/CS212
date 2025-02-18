package lecture_note_6_7.sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {

        // 🟢 Sorting Integers
        int[] numbers = {42, 13, 89, 27, 5, 67};
        System.out.println("Before Sorting (Integers): " + Arrays.toString(numbers));
        SortingUtils.selectionSort(numbers);
        System.out.println("After Sorting (Integers):  " + Arrays.toString(numbers) + "\n");

        // 🟡 Sorting Strings
        String[] names = {"Charlie", "Alice", "Bob", "David"};
        System.out.println("Before Sorting (Strings): " + Arrays.toString(names));
        SortingUtils.selectionSort(names);
        System.out.println("After Sorting (Strings):  " + Arrays.toString(names) + "\n");

        // 🔴 Sorting Students by Score
        Student[] students = {
                new Student("Alice", 85),
                new Student("Bob", 78),
                new Student("Charlie", 92),
                new Student("David", 90)
        };

        System.out.println("Before Sorting (Students by Score):");
        for (Student s : students) System.out.println(s);

        SortingUtils.selectionSort(students);

        System.out.println("\nAfter Sorting (Students by Score):");
        for (Student s : students) System.out.println(s);
    }
}
