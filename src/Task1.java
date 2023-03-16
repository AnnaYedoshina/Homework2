import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца:");
        int month = scanner.nextInt();
        {
            switch (month){
                case 1 -> System.out.println("январь");
                case 2 -> System.out.println("февраль");
                case 3 -> System.out.println("март");
                case 4 -> System.out.println("апрель");
                case 5 -> System.out.println("май");
                case 6 -> System.out.println("июнь");
                case 7 -> System.out.println("июль");
                case 8 -> System.out.println("август");
                case 9 -> System.out.println("сентябрь");
                case 10 -> System.out.println("октябрь");
                case 11 -> System.out.println("ноябрь");
                case 12-> System.out.println("декабрь");
                default -> System.out.println("default");
                }
            }
        }
    }