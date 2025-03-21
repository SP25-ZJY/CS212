package lecture_note_13_14;

public class MergeSort{

    public static void merge(int arr[], int start, int end){

        int mid = (start + end)/2;

        int sizeOfLeftHalf = mid - start + 1;

        int sizeOfRightHalf = end - mid;

        int [] left = new int[sizeOfLeftHalf];
        int [] right = new int[sizeOfRightHalf];


        //copy a chunk [start to end] of the array to 2 halves
        for(int i=0;i<sizeOfLeftHalf;i++){

            left[i] = arr[start + i];
        }

        for(int i=0;i<sizeOfRightHalf;i++){
            right[i] = arr[mid + 1 + i];
        }

        int i=0, j=0, k=0;

        //merge the 2 halves back to the original part of array
        while(i < sizeOfLeftHalf && j < sizeOfRightHalf){

            if (left[i] <= right[j]){
                arr[start + k] = left[i];
                i++;
            } else {
                arr[start+k] = right[j];
                j++;
            }
            k++;
        }


        //copy the rest of the halfs if any back
        for(;i < sizeOfLeftHalf; i++){
            arr[start + k] = left[i];
            k++;
        }

        for(;j < sizeOfRightHalf; j++){
            arr[start + k] = right[j];
            k++;
        }

        return;
    }

    public static void mergeSort(int [] numbers, int start, int end){

        if(start < end){
            int mid = (start + end)/2;

            mergeSort (numbers, start, mid);
            mergeSort (numbers, mid + 1, end);

            merge(numbers, start, end);
        }
        return;

    }



    public static void main(String[] args){
        int [] myNumbers = {31,	47,	10,	19,	12,	41,	33,	27};

        mergeSort(myNumbers, 0,myNumbers.length-1);

        for(int i =0; i < myNumbers.length; i++){
            System.out.print(myNumbers[i] + " ");
        }
        System.out.println();

    }
}