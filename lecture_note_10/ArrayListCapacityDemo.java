package lecture_note_10;
import java.util.ArrayList;

public class ArrayListCapacityDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(4); // Initial capacity

        System.out.println("Size: " + list.size() + " | Estimated Capacity: 4");

        for (int i = 1; i <= 10; i++) {
            list.add(i);
            System.out.println("Size: " + list.size() + " | Estimated Capacity: " + estimateCapacity(list));
        }
    }

    public static int estimateCapacity(ArrayList<?> list) {
        int size = list.size();
        int capacity = 10; // Default initial capacity
        while (capacity < size) {
            capacity += (capacity >> 1); // Increase by 50%
        }
        return capacity;
    }
}