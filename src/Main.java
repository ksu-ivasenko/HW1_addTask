public class Main {
    public static void main(String[] args) {

        //задача 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = - result;
        System.out.println (result);

        //задача 7
        a = 5;
        b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println ("a = " + a + " b = " + b);

        //задание 8
        a = 456;
        b = (a % 100 - a % 10)/10;
        System.out.println ("значение a = " + a + " значение b = " + b);



    }
}