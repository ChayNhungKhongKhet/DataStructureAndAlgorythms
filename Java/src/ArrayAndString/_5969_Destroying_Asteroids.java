package ArrayAndString;

public class _5969_Destroying_Asteroids {
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int indexMaxOfMaster = 0;
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > asteroids[indexMaxOfMaster])
                indexMaxOfMaster = i;
        }
        int sum = mass;
        for (int i = 0; i < indexMaxOfMaster; i++) {
            sum += asteroids[i];
        }
        if (sum >= asteroids[indexMaxOfMaster])
            return true;
        for (int i = indexMaxOfMaster+1; i < asteroids.length; i++) {
            sum += asteroids[i];
        }
        return sum > asteroids[indexMaxOfMaster];
    }

    public static void main(String[] args) {
        int[] a = {3,9,19,5,21};
        System.out.println(asteroidsDestroyed(10,a));
    }
}
