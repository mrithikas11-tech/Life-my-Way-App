package com.canigetafiver.lifemyway.service;
import java.util.ArrayList;

public class BudgetManager {
    private ArrayList<Budget> budgetList; 


   public BudgetManager() {
    budgetList = new ArrayList<Budget>();
   
   }
   public void addBudget(double amount, Period period, Category category) {
    Budget b = new Budget(amount,period,category); //example
    budgetList.add(b);
   }

   public void deleteBudget(Category category) {
    budgetList.removeIf(b -> b.getCategory() == category);
   }

   public ArrayList getBudgetList() {
    return budgetList; 
   }

   public void editBudgetAmount(Budget budget, double amount) {
    int index = budgetList.indexOf(budget);
    Budget nb = new Budget(amount, budget.getPeriod(), budget.getCategory());
    budgetList.set(index, nb);
   }

   public void editBudgetCategory(Budget budget, Category category) {
    int index = budgetList.indexOf(budget);
    Budget nb = new Budget(budget.getAmount(),budget.getPeriod(),category);
    budgetList.set(index, nb);
   }

    public void editBudgetPeriod(Budget budget, Period period) {
    int index = budgetList.indexOf(budget);
    Budget nb = new Budget(budget.getAmount(),period,budget.getCategory());
    budgetList.set(index, nb);
   }

}
