package recursion;

public class ConvertDecimalToBinary {
    public static String convertDecimal_Binary(int decimal,String result) {
        if (decimal == 0)
            return result;
        result = decimal % 2 + result;
        return convertDecimal_Binary(decimal/2,result);
    }

    public static void main(String[] args) {
        System.out.println(convertDecimal_Binary(233,""));
    }
}
