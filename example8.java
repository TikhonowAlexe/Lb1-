import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("день недели: ");
        String day = in.nextLine();

        System.out.println("месяц: ");
        String month = in.nextLine();

        System.out.println("число: ");
        String number = in.nextLine();

        System.out.println("день недели: " + day);
        System.out.println("месяц: " + month);
        System.out.println("число: " + number);

        in.close();

    }
}