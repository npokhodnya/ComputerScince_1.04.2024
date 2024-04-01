import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            System.out.println("Выберите действие:\n" +
                    "1. Вывод от 1 до 100\n" +
                    "2. Вывод от -100 до 5\n" +
                    "3. Вывод всех четных чисел из промежутка от 1 до 100");
            Scanner scan = new Scanner(System.in);
            var act = scan.next();
            switch (act) {
                case "1":
                    printNumbers(1, 101, 1);
                    flag = false;
                    break;
                case "2":
                    printNumbers(-100, 6, 1);
                    flag = false;
                    break;
                case "3":
                    printNumbers(2, 101, 2);
                    flag = false;
                    break;
                default:
                    System.out.println("Неккоректный ввод!");
                    break;
            }
        }
    }
    public static void printNumbers(int start, int end, int step){
        for (int i = start; i < end; i+=step) {
            System.out.printf("%d ", i);
        }
    }
}