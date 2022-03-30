package recursion;

public class PrintArray {
    public static void printElement(int[] arr,int index) {
        if (index < 0 || index >= arr.length)
            return;
        printElement(arr,index+1);
        System.out.println(arr[index]);
    }

    public static int F(int n) {
        System.out.println("Cal F["+n+"]");
        if (n<= 2)
            return 1;
        return F(n-1)+F(n-2);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
//        printElement(arr,0);
        System.out.println(F(5));

    }
}
