package Lesson14;

public class Main {
    public static void main(String[] args) {
        ClassForLesson14 classForLesson14 = new ClassForLesson14();
        classForLesson14.setHDD((byte) 1);
        classForLesson14.setRAM((byte) 11);

        System.out.println(classForLesson14.getHDD());
        System.out.println(classForLesson14.getRAM());

    }
}
