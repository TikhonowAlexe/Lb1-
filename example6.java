import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("имя: ");
        String name = in.nextLine();

        System.out.println("фамилия: ");
        String surname = in.nextLine();

        System.out.println("отчество: ");
        String patronimyc = in.nextLine();

        System.out.println("имя: " + name);
        System.out.println("фамилия: " + surname);
        System.out.println("отчество: " + patronimyc);
        in.close();

    }
}