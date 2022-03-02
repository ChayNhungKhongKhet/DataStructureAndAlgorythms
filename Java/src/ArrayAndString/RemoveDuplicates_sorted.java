package ArrayAndString;

import java.util.Arrays;

public class RemoveDuplicates_sorted {
    public static int removeDuplicates(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;
        int i = 0;
        int k = 0;
        while(i<n){
            if(a[k] != a[i]){
                k++;
                a[k] = a[i];
            }
            i++;
        }
        return k+1;
    }



    public static void main(String[] args) {
        int[] a = {1,1,2};
        int k = removeDuplicates(a);
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));

    }
}
