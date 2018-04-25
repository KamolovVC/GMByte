package Lesson13;

public class Main {
    public static void main(String[] args) {
        //task 1.1:
        int a = 100;
        while (a > 0) {
            System.out.print(a + " ");
            a = a - 2;
        }
        System.out.println();
        //task 1.2:
        a = 100;
        do {
            System.out.print(a + " ");
            a = a - 2;
        }while (a > 0);
        System.out.println();
        for (int i = 100; i > 0; i = i - 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task 2.1 and 2.2:
        a = 10;
        while (a <= 50) {
            System.out.print(a + " ");
            a = a + 3;
        }
        System.out.println();
        //task 1.2:
        a = 10;
        do {
            System.out.print(a + " ");
            a = a + 3;
        }while (a <= 50);
        System.out.println();
        for (int i = 10; i <= 50; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
