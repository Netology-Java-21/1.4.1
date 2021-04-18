import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Операции над double/float\n" +
                "1. Сравнить\n" +
                "2. Округлить\n" +
                "3. Отбросить дробную часть");
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        switch (menu) {
            case 1 -> {
                System.out.println("Введите первое число:");
                Float a = scanner.nextFloat();
                System.out.println("Введите второе число:");
                Float b = scanner.nextFloat();
                double res = (a - b);
                if (res == 0) {
                    System.out.println("числа равны");
                    System.out.println(res);
                }
                System.out.println(res);
            }
            case 2 -> System.out.println("2");
            default -> System.out.println("3");
        }
    }

}
