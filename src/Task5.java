import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер цвета: ");
        int num = scanner.nextInt();
        {
            switch (num) {
                case 1 -> System.out.println("Красный");
                case 2 -> System.out.println("Оранжевый");
                case 3 -> System.out.println("Желтый");
                case 4 -> System.out.println("Зеленый");
                case 5 -> System.out.println("Голубой");
                case 6 -> System.out.println("Синий");
                case 7 -> System.out.println("Фиолетовый");
                default -> System.out.println("default");

            }
        }
    }
}