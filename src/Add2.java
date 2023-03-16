import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        int sum = scanner.nextInt();
        System.out.print("Введите количество месяцев: ");
        int month = scanner.nextInt();
        float f = sum;
        for (int i = 1; i < month; i++) {
            f = f * 1.07F;
            System.out.println(f);


        }
    }
}
