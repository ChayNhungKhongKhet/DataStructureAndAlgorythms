package arrayandstring;

import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                for (int j = a.length-1; j >i; j--) {
                    a[j] = a[j-1];
                }
                i++;
            }
        }
    }

    public static void duplicateZeros2(int[] arr)
    {
        int noOfZeros = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0) noOfZeros++;
        }
        for(int i=n-1;i>=0;i--)
        {
            int curIndex = i+noOfZeros;
            if(curIndex<n)
            {
                arr[curIndex] = arr[i];
            }
            if(arr[i] == 0)
            {
                if(curIndex-1 < n)
                {
                    arr[curIndex-1] = arr[i];
                }
                noOfZeros--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
