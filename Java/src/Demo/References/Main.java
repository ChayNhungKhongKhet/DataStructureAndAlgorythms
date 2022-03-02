package Demo.References;

public class Main {

    public static void main(String[] args) {
//        Person person = new Person("Tan",19);
//        Person person1 = new Person("Thang",20);
//        System.out.println(person);
//        System.out.println(person1);
//        person1.swap(person);
//        System.out.println(person);
//        System.out.println(person1);
//
//        Integer i = new Integer(72311);
//        byte x = i.byteValue();
//        System.out.print(x);
    }

    static int func(int n) {
        int result;
        if (n == 1)
            return 1;
        result = func(n - 1);
        return result;
    }
}
