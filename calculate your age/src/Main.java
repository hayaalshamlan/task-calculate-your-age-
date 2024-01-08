import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter year");
        int year = Scanner.nextInt();

        System.out.println("Enter month");
        int month = Scanner.nextInt();

        System.out.println("Enter day");
        int day = Scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        Calendar birthCalender = Calendar.getInstance();
        birthCalender.set(year, month, day);

        int age = calendar.get(Calendar.YEAR) - birthCalender.get(Calendar.YEAR);
        System.out.println("This is your age..." + age);
        Scanner.close();

    }
}
