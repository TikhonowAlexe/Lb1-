import java.util.Scanner;

public class example15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        int digit = number1 - number2;
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + digit);
        in.close();


    }
}