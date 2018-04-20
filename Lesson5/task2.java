public class main {
    public static void main(String[] args) {

        byte variable_1 = vasya();
        byte variable_2 = petya();
        byte sumVariable_1_and_Variable_2 = (byte) (variable_1 + variable_2);
        System.out.println("Числа из методов сложились и получилось " + sumVariable_1_and_Variable_2);
    }
    static byte vasya () {
        byte x = 1;
        byte y = 2;
        return (byte) (x + y);
    }
    static byte petya () {
        byte d = 10;
        byte c = 20;
        return (byte) (d + c);
    }
}
