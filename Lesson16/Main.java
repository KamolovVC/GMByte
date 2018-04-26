package Lesson16;

public class Main {
    public static void main(String[] args) {
        byte A[] = new byte[21];
        byte B[] = new byte[21];
        byte C[] = new byte[21];
        byte a = 0;
        while (a <= 20) {
            A[a] = a;
            System.out.println("A[" + a + "] = " + A[a]);
            a++;
        }
        System.out.println();
        a = 0;
        for (byte i = 20; i >= 0; i--) {
            B[a] = i;
            System.out.println("B[" + a + "] = " + B[a]);
            a++;
        }
        System.out.println();
        for (byte j = 0; j <= 20; j = (byte) (j + 2)) {
            C[j] = j;
            System.out.println("C[" + j + "] = " + C[j]);
        }

        Task2[] task2 = new Task2[7 ];

        for (int k = 0; k < task2.length; k++) {
            task2[k] = new Task2();
            task2[k].speed = 100 + k;
            task2[k].doors = 3 + k;
            task2[k].shells = 4 + k;
        }
        for (int t = 0; t < task2.length; t++) {
            System.out.println("task2[" + t + "].speed = " + task2[t].speed);
            System.out.println("task2[" + t + "].doors = " + task2[t].doors);
            System.out.println("task2[" + t + "].shells = " + task2[t].shells);
            System.out.println();
        }

    }
}
