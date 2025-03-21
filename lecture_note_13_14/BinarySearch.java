package lecture_note_13_14;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch{

    public static int search(int [] numbers, int key){
        for(int i = 0;i<numbers.length; i++){
            if(numbers[i] == key)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int [] numbers, int key, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = (start + end )/2;

        if(numbers[mid] == key){
            return mid;
        } else if(numbers[mid]> key){
            return binarySearch(numbers, key, start, mid -1);
        } else{
            return binarySearch(numbers, key, mid+1, end);
        }
    }

    public static void main(String [] args){

        int[] myNumbers = new int[100];

        // Generate random integers and fill the array
        Random random = new Random();
        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = random.nextInt(1000); // Random numbers between 0 and 999
        }

        // Sort the array
        Arrays.sort(myNumbers);

        long startTime_ns = System.nanoTime();
        System.out.println(search(myNumbers,200));

        long endTime_ns = System.nanoTime();

        System.out.println("Linear Search Took "+(endTime_ns - startTime_ns)/1e6 + " ms");
        startTime_ns = System.nanoTime();
        System.out.println(binarySearch(myNumbers,41, 0, myNumbers.length-1 ));

        endTime_ns = System.nanoTime();
        System.out.println("Binary Search Took "+(endTime_ns - startTime_ns)/1e6 + " ms");

    }



}

