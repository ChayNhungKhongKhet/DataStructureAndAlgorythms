package arrayandstring;

import java.util.Arrays;

public class _189_Rotate_Array {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] a = new int[len];
        int j = len-1;
        for (int i = k-1; i >=0; i--) {
            a[i] = nums[j];
            j--;
        }
        for (int i = 0; i <= k; i++) {
            a[j] = nums[i];
            j++;
        }
        System.arraycopy(a, 0, nums, 0, len);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotate(a,3);
        System.out.println(Arrays.toString(a));
    }
}
