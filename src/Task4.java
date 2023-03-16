import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temp = scanner.nextInt();
        if (temp > -5) {
            System.out.println("Тепло");
        } else if (-5 >= temp && temp > -20) {
            System.out.println("Нормально");
        } else if (-20 >= temp) {
            System.out.println("Холодно");

        }
    }
}
