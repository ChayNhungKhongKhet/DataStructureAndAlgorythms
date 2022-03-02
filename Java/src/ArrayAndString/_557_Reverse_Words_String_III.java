package ArrayAndString;

public class _557_Reverse_Words_String_III {
    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder subString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                swap(subString, 0, subString.length()-1);
                stringBuilder.append(subString).append(" ");
                subString = new StringBuilder("");

            }
            else subString.append(s.charAt(i));
            if (i == s.length()-1){
                swap(subString, 0, subString.length()-1);
                stringBuilder.append(subString);
            }
        }
        return stringBuilder.toString();
    }

    public static void swap(StringBuilder s, int i, int j){
        while (i<j){
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }

    }

    public static String reverseWordss(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0;
        for (;j<c.length;j++) {
            if (c[j] == ' ') {
                reverseWord(c, i, j-1);
                i = j+1;
            }
        }
        reverseWord(c, i, j-1);
        return new String(c);
    }

    private static void reverseWord(char[] c, int i, int j) {
        while (i < j) {
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }



    public static void main(String[] args) {
        String string = "Let's take LeetCode contest";
        string = reverseWordss(string);
        System.out.println(string);
    }
}
