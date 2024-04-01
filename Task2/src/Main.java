import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean runaway = false;
        boolean hasKey = false;
        boolean hasBoxKey = false;
        boolean artifact1 = false;
        boolean artifact2 = false;
        boolean artifact3 = false;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ты просыпаешься в комнате, и пытаешься вспомнить свое имя...");
        System.out.print("Введи свое имя: ");
        String playerName = scan.next();
        System.out.println("\n" + playerName + ", ты осмотрелся... Вокруг тебя следующие возможности:");
        while (!runaway) {
            System.out.println("1. Открыть дверь\n" +
                    "2. Заглянуть под кровать\n" +
                    "3. Открыть ящик в углу комнаты\n" +
                    "4. Открыть вентиляцию\n" +
                    "5. Взглянуть на тумбочку\n" +
                    "6. Взглянуть на статую рядом с дверью");
            String choice = scan.next();
            switch (choice) {
                case "1":
                    if (hasKey) {
                        System.out.println(playerName + ", ты сбежал!");
                        runaway = true;
                    }
                    else System.out.println("Дверь заперта... тебе нужна ОТМЫЧКА !");
                    break;
                case "2":
                    System.out.println(playerName + ", вы нашли ПЕРВЫЙ АРТЕФАКТ !");
                    artifact1 = true;
                    break;
                case "3":
                    if (hasBoxKey) {
                        System.out.println(playerName + ", вы нашли ОТМЫЧКУ!");
                        hasKey = true;
                    } else System.out.println("Ящик закрыт... странный замок, отмычкой его не открыть, нужен КЛЮЧ !");
                    break;
                case "4":
                    if (count < 2) {
                        System.out.println("Вентиляция не открывается...");
                        count++;
                    } else if (count == 2) {
                        System.out.println(playerName + ", вы нашли ВТОРОЙ АРТЕФАКТ !");
                        count++;
                        artifact2 = true;
                    } else {
                        System.out.println("Вы уже открыли вентиляцию");
                    }
                    break;
                case "5":
                    System.out.println(playerName + ", вы нашли ТРЕТИЙ АРТЕФАКТ");
                    artifact3 = true;
                    break;
                case "6":
                    if (artifact1 && artifact2 && artifact3) {
                        System.out.println(playerName + ", вы нашли КЛЮЧ ОТ ЯЩИКА !");
                        hasBoxKey = true;
                    } else System.out.println("Нужно найти все артефакты!");
                    break;
                default:
                    System.out.println("Введено некорректное действие!");
            }
        }
    }
}