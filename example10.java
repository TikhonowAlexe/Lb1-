import java.util.Scanner;
import java.util.Calendar;

public class example10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myyear, result;
        do {
            System.out.print("Ваш год рождения: ");
            myyear = sc.nextInt();
            result = myyear - year;
        } while(result>0);
        System.out.println("Ваш возраст "+result+"");


    }
}