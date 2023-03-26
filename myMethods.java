import java.util.ArrayList;
import java.util.Scanner;

public class myMethods {
    public static int getNumber(String message){
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        boolean isNumber = input.hasNextInt();
        while(!isNumber){
            System.out.println("Ошибка ввода! Введите число: ");
            input.next();
            isNumber = input.hasNextInt();
        }
        int number = input.nextInt();
        return number;
    }

    public static int getSumFromOne(int limit){
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        return sum;
    }

    public static ArrayList<Integer> isPrimeList(int limit){
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 2; i <= limit + 1; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.round(Math.sqrt(i)) + 1; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                prime.add(i);
            }
        }
        return prime;
    }

    public static double operation(Double a, Double b, String action){
        double result = 0;
        switch (action){
            case "+":
            result = a + b;
            break;
            case "-":
            result = a - b;
            break;
            case "*":
            result = a * b;
            break;
            case "/":
            result = a / b;
            break;
        }
        return result;
    }

}
