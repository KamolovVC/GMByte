package Lesson15;

public class ClassForLesson15 {
    public void method(byte a, int b, long c) {
        System.out.println("Byte/int/long");
    }

    public void method(byte a, long b, int c) {
        System.out.println("byte/long/int");
    }

    public void method(int a, byte b, long c) {
        System.out.println("int/byte/long");
    }

    public void method(int a, long b, byte c) {
        System.out.println("int/long/byte");
    }

    public void method(long a, int b, byte c) {
        System.out.println("long/int/byte");
    }

    public void method(long a, byte b, int c) {
        System.out.println("long/byte/int");
    }
}

