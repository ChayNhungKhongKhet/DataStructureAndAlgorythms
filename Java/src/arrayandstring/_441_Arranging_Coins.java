package arrayandstring;

public class _441_Arranging_Coins {

//    public int arrangeCoins(int n) {
//        int k = 0;
//        for (int i = n; i >= 0 ;) {//Count row
//            i = i-k;
//            if (i < 0)
//                break;
//            k++;
//        }
//        List<Integer>[] ar = new List[k];//create mang 2 chieu to add
//        int count = 0;//count number row complete
//        int numElementOfRow = 1;//number element of each row
//        int tempK = 0;// tempK increase to
//        while (tempK < k) {
//            ar[tempK] = new ArrayList<>();//create new list at index temK of ar
//            for (int i = 0; i <= tempK ; i++) {
//                ar[tempK].add(1);
//                n--;
//                if (n <= 0)
//                    break;
//            }
//            if (ar[tempK].size() == numElementOfRow) {
//                count++;
//                numElementOfRow++;
//            }
//            tempK++;
//        }
//        return count;
//    }

    public int arrangeCoins(int n) {
        int count = 0;
        int i = 1;
        while (n > 0) {
            n = n - i;
            i++;
            if (n >= 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        _441_Arranging_Coins j = new _441_Arranging_Coins();
        System.out.println(j.arrangeCoins(5));
    }
}
