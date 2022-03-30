package arrayandstring;

import java.util.Arrays;

public class SquareOfASortedArr {
    public static int[] sortedSquares(int[] a) {
        int k = a.length-1;
        int i = 0;
        int j = a.length-1;
        int[] result = new int[a.length];
        while (i <= j){
            int n = a[i] * a[i];
            int m = a[j] * a[j];
            if (n > m){
                result[k] = n;
                i++;
            }
            else{
                result[k] = m;
                j--;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-9,-6,-5,1,3,6,8};
        arr = sortedSquares(arr);
        System.out.println(Arrays.toString(arr));
    }
}
