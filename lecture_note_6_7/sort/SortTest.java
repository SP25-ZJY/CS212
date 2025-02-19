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

        // Create Students
        Student[] students = {
                new Student("Alice", new int[]{85, 90, 78, 92, 88}),
                new Student("Bob", new int[]{70, 75, 80, 85, 90}),
                new Student("Charlie", new int[]{95, 94, 96, 92, 91})
        };

        // Display students before sorting
        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort students by average grade
        SortingUtils.selectionSort(students);
        // SortUtils.insertionSort(students); // Use this for insertion sort

        // Display students after sorting
        System.out.println("\nAfter Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
