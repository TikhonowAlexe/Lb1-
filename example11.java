import java.util.Calendar;
import java.util.Scanner;

public class example11 {

    public static void main(String[] args) {

   Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        year = (year - 2023) * (-1);
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш возраст: " + year);
        in.close();



    }
}