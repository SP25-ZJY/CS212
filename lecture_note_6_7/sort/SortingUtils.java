package lecture_note_6_7.sort;

public class SortingUtils {

    // Selection Sort for integers
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort for integers
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort for Strings (Alphabetical Order)
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort for Strings
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort for Student objects (Sorting by Score)
    public static void selectionSort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].compareTo(students[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            Student temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    // Insertion Sort for Student objects (Sorting by Score)
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}