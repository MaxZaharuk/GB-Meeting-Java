import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int n = myMethods.getNumber("Введите число n: ");
        System.out.printf("Треугольное число: %d", myMethods.getSumFromOne(n));
        System.out.println();
        System.out.println("Задача 2");
        n = myMethods.getNumber("Введите число n для поиска простых чисел: ");
        System.out.printf("Список простых чисел от 1 до %d : %s", n, myMethods.isPrimeList(n));
        System.out.println();
        System.out.println("Задача 3");
        
        double a = myMethods.getNumber("Введите первое число: ");
        double b = myMethods.getNumber("Введите второе число: ");
        Scanner op = new Scanner(System.in);
        System.out.println("Введите операцию: +, -, * или / ");
        String operation = op.nextLine();
        System.out.printf("Результат операции %f %s %f равен %f", a, operation, b, myMethods.operation(a, b, operation));
    }
}



