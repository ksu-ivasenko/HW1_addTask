public class Main {
    public static void main(String[] args) {
        task6();
        task7();
        task8();
    }
    public static void task6(){
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = - result;
        System.out.println (result);}
    public static void task7(){
        //задача 7
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println ("a = " + a + " b = " + b);}

    public static void task8(){

        //задание 8
        int a = 456;
        int b = (a % 100 - a % 10)/10;
        System.out.println ("значение a = " + a + " значение b = " + b);}

}