public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println("Мой вес: " + bird.weight);
        System.out.println("Мой размах крыльев: " + bird.wingspan);
        System.out.println("Моя максимальная скорость полёта: " + bird.speedMax);
        System.out.println("Моя максимальная высота полёта: " + bird.maxHeight);
        bird.fly();
        bird.walk();
        bird.eat();
        bird.toLayEggs();


    }
}
class Bird {
    byte weight = 100;
    byte wingspan = 50;
    byte speedMax = 40;
    byte maxHeight = 30;

    void fly () {
        System.out.println("Я умею летать!");
    }

    void walk () {
        System.out.println("Я умею ходить!");
    }

    void eat () {
        System.out.println("Я умею есть!");
    }

    void toLayEggs () {
        System.out.println("Я умею откладывать яица!");
    }

}
