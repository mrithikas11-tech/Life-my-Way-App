package com.canigetafiver.lifemyway.service;

public class MonthlyBudget implements Budget {
    private double budget;
    private double spent;
    private double remaining;

    @Override
    public void setBudget(double budget) {
        this.budget = budget;
    }
    @Override
    public double getBudget() {
        return this.budget;
    }


    @Override
    public void calculateRemaining(double amount) {
        spent += amount;
        remaining =this.budget - this.spent;
    }

    @Override 
    public double getRemaining() {
        return this.remaining;
    }
    @Override
    public boolean isExceeded() {
        return this.spent > this.budget;
    }

    @Override 
    public void resetBudget() {
        this.budget = 0;
        this.spent = 0; 
        this.remaining = 0;
    }
    
}
