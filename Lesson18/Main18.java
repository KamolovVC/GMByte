package Lesson18;

public class Main18 {


    public static void main(String[] args) {
        Puppy18 puppy18 = new Puppy18();
        puppy18.eyes = 2;
        puppy18.head = 1;
        puppy18.foots = 4;
        System.out.println(puppy18.eyes);
        System.out.println(puppy18.head);
        System.out.println(puppy18.foots);

        puppy18.Gav();
        puppy18.Run();

        puppy18.color = 10;
        puppy18.wool = 20;

        System.out.println(puppy18.color);
        System.out.println(puppy18.wool);

        puppy18.walk();
        puppy18.crowl();

    }

}
