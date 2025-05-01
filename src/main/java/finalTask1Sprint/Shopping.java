package finalTask1Sprint;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Отобразить список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить программу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                if (productCount < shoppingList.length) {
                    System.out.println("Введите название товара:");
                    shoppingList[productCount] = scanner.next();
                    System.out.printf("Товар %s добавлен в список под номером %d%n", shoppingList[productCount], ++productCount);
                }
                else{
                    System.out.println("Извините, список полон!");
                }
            } else if (actionNumber == 2) {
                for (int i = 0 ; i < productCount ; i++) {
                    System.out.printf("%d. %s%n", i + 1,shoppingList[i]);
                }
            } else if (actionNumber == 3) {
                shoppingList = new String[8];
                productCount = 0;
                System.out.println("Список очищен!");
            } else if (actionNumber == 4) {
                return;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}
