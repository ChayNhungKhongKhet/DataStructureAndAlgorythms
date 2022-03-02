package ArrayAndString;

import java.util.Arrays;

public class _1299_Replace_Elements_Greatest_On_Right {

    public static int[] replaceElements(int[] a) {
        if (a == null || a.length == 0)
            return a;
        int n = a.length;
        if (n == 1){
            a[n-1] = -1;
            return a;
        }
        int max = -1,c,i=n-1;
        while (i>=0){
            c = a[i];
            a[i] = max;
            i--;
            if (max < c)
                max = c;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {17,18,5,4,6,1};
        a = replaceElements(a);
        System.out.println(Arrays.toString(a));
    }
}
