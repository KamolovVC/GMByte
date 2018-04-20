public class Main {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 11;
        method(a);
        System.out.println("methodByte вернул: " + methodByte(b));

    }
    static void method (byte a) {
        System.out.println("В качестве аргументов мне передали:" + a);
    }
    static byte methodByte (byte a) {
        System.out.println("Ура! Сделан мой первый шаг в java!");
        a = (byte) (a + 5);
        return a;
    }
}
