package arrayandstring;

public class Valid_Mountain_Array {
    public static boolean validMountainArray(int[] a) {
        if (a.length < 3)
            return false;
        int max = 0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] > a[max])
                max = i;
        }
        for (int k = 0; k < max; k++) {
            if (a[k]>=a[k+1])
                return false;
        }
        for (int k = max; k <a.length-1; k++) {
            if (a[k]<=a[k+1])
                return false;
        }
        return max != 0 && max != a.length-1;
    }

    public static void main(String[] args) {
        int[] a = {0,3,2,1};
        System.out.println(validMountainArray(a));
    }
}
