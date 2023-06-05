package machine;

import java.util.Scanner;

public interface Interaction {

    void fill(int waterAmount, int milkAmount, int beansAmount, int cupsAmount);

    void buy(String choice);

    void take();
    void remaining();

    static void menu(Interaction maker){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        switch (action){
            case "buy" -> {
                System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String choice = scanner.next();
                if (choice.equals("back"))
                {
                    menu(maker);
                }
                else {
                    maker.buy(choice);
                    menu(maker);
                }

            }
            case "fill" -> {
                System.out.println("Write how many ml of water you want to add:\n");
                int water = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:\n");
                int milk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:\n");
                int beans = scanner.nextInt();
                System.out.println("Write how many disposable cups you want to add:\n");
                int cups = scanner.nextInt();
                maker.fill(water,milk,beans,cups);
                menu(maker);
            }
            case "take" -> {
                maker.take();
                menu(maker);
            }
            case "remaining" -> {
                maker.remaining();
                menu(maker);
            }
            case "exit" -> {

            }
            default -> System.out.println("Error. Wrong Action.");
        }
    }
}
