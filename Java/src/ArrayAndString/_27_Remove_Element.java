package ArrayAndString;

import java.util.Arrays;

public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int k = removeElement(arr,2);
        int[] arr2 = new int[k];
        System.arraycopy(arr, 0, arr2, 0, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}
