

import java.util.Scanner;
public class example12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        age = (2023 - age);
        System.out.println("Ваш год рождения: " + age);
        in.close();

    }
}