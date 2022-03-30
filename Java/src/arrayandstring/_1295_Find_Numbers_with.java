package arrayandstring;

public class _1295_Find_Numbers_with {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if (check(num) % 2 ==0) {
                count++;
            }
        }
        return count;
    }

    private static int check(int num) {
        int count = 0;
        while (num != 0){
            num = num/10;
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
