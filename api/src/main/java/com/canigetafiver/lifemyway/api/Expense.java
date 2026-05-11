package com.canigetafiver.lifemyway.api;

public class Expense {

    private String title;
    private double amount;
    private String date;
    private Category category;

    public Expense(String title, double amount, String date, Category category) {
        this.title = title;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }
}