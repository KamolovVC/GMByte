package Lesson23;

public class Main_Lesson23 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a НЕ РАВНО b");
        }

        String c = new String("Hello");
        String d = new String("Hello");
        if (c == d) {
            System.out.println("c = d");
        } else {
            System.out.println("c НЕ РАВНО d");
        }

        String x = new String("Hello");
        String y = new String("Hello");
        if (x.equals(y)) {
            System.out.println("c = d");
        } else {
            System.out.println("c НЕ РАВНО d");
        }
    }
}
