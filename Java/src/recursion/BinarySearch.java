package recursion;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return search(nums,nums.length-1,0,target);
    }
    public static int search(int[] a, int right, int left, int target){
        if(left > right)
            return -1;
        var mid = (right+left)/2;
        if(a[mid] == target)
            return mid;
        else if(target > a[mid])
            return search(a,right,mid+1,target);
        else
            return search(a,mid-1,left,target);
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr, arr.length-1,0,9));
    }
}
