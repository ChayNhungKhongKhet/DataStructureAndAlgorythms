package arrayandstring;

public class _5967_Check_if_All_A_Appears_Before {
    public boolean checkString(String s) {
        boolean isTrue = true;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == 'b' && s.charAt(i+1) == 'a' )
                return false;
        }

        return true;
    }
}
