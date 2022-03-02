package ArrayAndString;

import java.math.BigDecimal;

public class _476_Number_Complement {
    public static int findComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String complement = "";
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0')
                complement += '1';
            else
                complement += '0';
        }
        int decimal = Integer.parseInt(complement,2);
        return decimal;
    }

    public static int findComplement2(int num) {
        int mask= 1;
        while(num>mask) mask= (mask<<1) | 1;
        return num^mask;
    }
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
