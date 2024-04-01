import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        Scanner scanner = new Scanner(System.in);
        var num1 = scanner.nextDouble();
        var num2 = scanner.nextDouble();
        System.out.println("Действие (+, -, *, /):");
        String action = scanner.next();
        switch (action){
            case "+":
                System.out.printf("%f + %f = %f", num1, num2, num1+num2);
                break;
            case "-":
                System.out.printf("%f - %f = %f", num1, num2, num1-num2);
                break;
            case "*":
                System.out.printf("%f * %f = %f", num1, num2, num1*num2);
                break;
            case "/":
                System.out.printf("%f / %f = %f", num1, num2, num1/num2);
                break;
            default:
                System.out.println("Действие не распознано!");
                break;
        }
    }
}