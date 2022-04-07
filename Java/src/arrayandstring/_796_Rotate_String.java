package arrayandstring;


public class _796_Rotate_String {
    public boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            String slice = "";
            slice += s.substring(1);
            slice += s.substring(0,1);
            if (slice.equals(goal))
                return true;
            s = slice;
        }
        return false;

    }

    public static void main(String[] args) {
        _796_Rotate_String f = new _796_Rotate_String();
        System.out.println(f.rotateString("abcde","cdeab"));
    }
}
