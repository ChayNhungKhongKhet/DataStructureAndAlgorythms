package recursion;

import java.util.Scanner;

public class _509_Fibonacci_Number {
    static final Scanner sc = new Scanner(System.in);
    static int[] Fn = new int[31];
    public static int F(int n) {
        System.out.println("Cal F["+n+"]");
        if (n <=1) {
            Fn[n] = n;
            return n;
        }
        Fn[n] = F(n-1)+F(n-2);
        return Fn[n];
    }

    public static void main(String[] args) {
        F(10);
    }
}
