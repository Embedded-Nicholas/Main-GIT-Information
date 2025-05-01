package finalTask2Sprint;

import java.util.*;

public class ExpensesManager {
    HashMap<String, List<Double>> expensesByCategories; // замените на таблицу с именем expensesByCategories

    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // создайте таблицу
    }

    // добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            expensesByCategories.get(category).add(expense);

        } else {
            List<Double> newListExpenses = new ArrayList<>();
            newListExpenses.add(expense);
            expensesByCategories.put(category, newListExpenses);
        }

        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }


    void printAllExpenses() {
        // замените логику для работы с таблицами
        for (String key : expensesByCategories.keySet()) {
            System.out.println(key);
            for (Double expense : expensesByCategories.get(key)) {
                System.out.println(expense);
            }
        }
    }

    // метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        for (Double expense : expensesByCategories.get(category)) {
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // таблица называется иначе
        System.out.println("Траты удалены.");
    }
}