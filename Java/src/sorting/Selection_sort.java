package sorting;

import java.util.Arrays;

public class Selection_sort {

    public static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("i = "+i+"------");
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println("j = "+j +" " + Arrays.toString(arr));
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,9,7,2};
        selection_sort(arr);
        System.out.println("After sorted");
        System.out.println(Arrays.toString(arr));
    }
}
