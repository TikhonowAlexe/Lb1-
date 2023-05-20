import java.util.Scanner;
import java.util.Calendar;

public class example9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Какой месяц?: ");
        String month = in.nextLine();

        System.out.println("Сколько дней в данном месяце?: ");
        int age = in.nextInt();

        System.out.println("Сейчас месяц: " + month + " Сегодня: " + age + " Число ");
        in.close();


    }
}