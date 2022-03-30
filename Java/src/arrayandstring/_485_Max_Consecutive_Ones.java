package arrayandstring;

public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum =0,bfSum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                sum ++;
                if(sum > bfSum)
                    bfSum = sum;
            }
            else{

                sum = 0;
            }

        }
        return bfSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
