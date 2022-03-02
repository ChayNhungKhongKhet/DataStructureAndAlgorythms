package Sorting;

import java.util.Arrays;

public class Quick_sort {
    public static void quickSort(int[] a, int iL, int iR) {
        //Stop conditional //case base
        if (iL >= iR)
            return;
        //step 1:Choose key (mid)
        //step 2:Partition by key ,right > key,left < key
        var i = partition2(a, iL, iR);
        //step 3:split array
        System.out.println("iL = " + iL + ",iR = " + iR );
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, iL, iR + 1)));
        System.out.println(Arrays.toString(a));
        System.out.println("---------------------------------------");
        quickSort(a, iL, i - 1);
        quickSort(a, i, iR);
    }

    public static void quickSort2(int[] a, int left, int right) {
        if(left >= right) return;
        int pivot = a[(left+right)/2];
        int i = left,j=right;
        do {
            while (a[i] <pivot) i++;
            while (a[j] >pivot) j--;
            if (i<=j){
                swap(a,i,j);
                i++;
                j--;
            }
        }while (i<j);
        System.out.println("Left = " + left + ",Right = " + right +",Pivot = "+pivot);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, left, right + 1)));
        System.out.println(Arrays.toString(a));
        System.out.println("---------------------------------------");
        quickSort2(a,left,j);
        quickSort2(a,i,right);
    }

    public static int partition(int[] a, int iL, int iR) {
        var pivot = a[iR];
        var pIndex = iL;
        var i = iL;
        while (i < iR) {
            if (a[i] <= pivot) {
                swap(a, i, pIndex);
                pIndex++;
            }
            i++;
        }
        swap(a, pIndex, iR);
        return pIndex;
    }

    private static int partition2(int[] a, int iL, int iR) {
        var pivot = a[(iL+iR)/2];
        while (iL <= iR) {
            while (a[iR] > pivot) iR --;
            while (a[iL] < pivot) iL ++;
            if (iR >= iL) {
                swap(a,iL,iR);
                iL ++;
                iR --;
            }
        }
        return iL;
    }


    public static void swap(int[] a, int x, int y) {
        var temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }


    public static void main(String[] args) {
//        int[] a = new int[30];
//        int[] a = {5,10,8,7,6,5,3,12,14,2,4,2,4,1,2,3,12,4,21,2,5};
        int[] a = {5,2,6,4,7,1};
//        int[] a = {3, 7, 5, 6, 5, 2, 1, 4, 2};
//        for (int i = 0; i < 15; i++) {
//            a[i] = (int) (Math.random() * 30);
//        }
        System.out.println("Before sorted");
        System.out.println(Arrays.toString(a)+"\n");
        quickSort2(a, 0, a.length - 1);
        System.out.println("After sorted");
        System.out.println(Arrays.toString(a));
    }
}
