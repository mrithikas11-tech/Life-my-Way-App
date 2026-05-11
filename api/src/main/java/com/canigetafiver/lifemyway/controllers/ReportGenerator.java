package com.canigetafiver.lifemyway.controllers;


import com.canigetafiver.lifemyway.api.Expense;

import java.util.List;

public class ReportGenerator {

    public double calculateTotalExpenses(List<Expense> expenses) {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    public int countExpenses(List<Expense> expenses) {
        return expenses.size();
    }
}