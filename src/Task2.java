import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца:");
        int month = scanner.nextInt();
        if (month == 1) {
            System.out.println("январь");
        } else if (month == 2) {
            System.out.println("февраль");
        } else if (month == 3) {
            System.out.println("май");
        } else if (month == 4) {
            System.out.println("апрель");
        } else if (month == 5) {
            System.out.println("май");
        } else if (month == 6) {
            System.out.println("июнь");
        } else if (month == 7) {
            System.out.println("июль");
        } else if (month == 8) {
            System.out.println("август");
        } else if (month == 9) {
            System.out.println("сентябрь");
        } else if (month == 10) {
            System.out.println("октябрь");
        } else if (month == 11) {
            System.out.println("ноябрь");
        } else if (month == 12) {
            System.out.println("декабрь");
        }

    }
}
