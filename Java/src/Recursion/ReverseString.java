package Recursion;


public class ReverseString {
    public static void reverse(char[] str) {
        swap(str,0, str.length-1);
    }
    public static void swap(char[] str,int index1,int index2) {
        if (index1 < index2) {
            char temp = str[index1];
            str[index1] = str[index2];
            str[index2] = temp;
            swap(str,index1+1,index2-1);
        }
    }

    public static void reverse2(char[] str) {
        int i = 0;
        int j = str.length -1;
        while (i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        reverse2(str);
        System.out.println(str);
    }
}
