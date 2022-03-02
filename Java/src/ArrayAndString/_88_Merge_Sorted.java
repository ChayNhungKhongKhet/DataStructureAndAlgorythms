package ArrayAndString;

import java.util.Arrays;

public class _88_Merge_Sorted {
    public static void merge(int[] a1, int m, int[] a2, int n) {
        int k = (n+m)-1;
        int i = m-1;
        int j = n-1;
        while (k>=0) {
            if (i<0){
                a1[k] = a2[j];
                j--;
            }
            else if (j<0){
                a1[k] = a1[i];
                i--;
            }
            else
                if (a1[i] < a2[j]) {
                    a1[k] = a2[j];
                    j--;
                } else {
                    a1[k] = a1[i];
                    i--;
                }
            k--;
        }

    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3,0,0,0};
        int[] nums2 = {0, 1, 2};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
