package com.canigetafiver.lifemyway.controllers;

import com.canigetafiver.lifemyway.api.Category;
import com.canigetafiver.lifemyway.api.Expense;

import java.util.ArrayList;
import java.util.List;

public class FilterController {

    public List<Expense> filterByCategory(List<Expense> expenses, String categoryName) {

        List<Expense> filtered = new ArrayList<>();

        for (Expense expense : expenses) {

            Category category = expense.getCategory();

            if (category != null &&
                category.getName().equalsIgnoreCase(categoryName)) {

                filtered.add(expense);
            }
        }

        return filtered;
    }

    public List<Expense> filterByMinimumAmount(List<Expense> expenses, double minimumAmount) {

        List<Expense> filtered = new ArrayList<>();

        for (Expense expense : expenses) {

            if (expense.getAmount() >= minimumAmount) {
                filtered.add(expense);
            }
        }

        return filtered;
    }
}
