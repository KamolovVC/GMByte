package Lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_Lesson24 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Ваше имя?");
        String name = bufferedReader.readLine();
        System.out.println("Ваша фамилия?");
        String family = bufferedReader.readLine();

        System.out.println("Your name and surname: " + name + " " + family);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваше имя?");
        String nameScanner = scanner.next();
        System.out.println("Ваша фамилия?");
        String familyScanner = scanner.next();

        System.out.println("Your name and surname: " + nameScanner + " " + familyScanner);

    }
}
