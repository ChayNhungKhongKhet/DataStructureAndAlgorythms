package sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            System.out.println("i = "+i+"------");
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("j = " +j +" "+Arrays.toString(arr));
                }
            }
            if (isSorted) break;
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,5,3,6,9,7,2};
        bubbleSort(arr);
        System.out.println("After sorted");
        System.out.println(Arrays.toString(arr));
    }

}
