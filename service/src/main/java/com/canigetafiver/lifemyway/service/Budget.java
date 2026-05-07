package com.canigetafiver.lifemyway.service;

public interface Budget {
  void setBudget(double budget); //should be able to set the budget
  double getBudget(); //should be able to get the budget
  void calculateRemaining(double amount); //should be able to calculate the total spent so far and update the spent variable
  double getRemaining(); //should be able to get the remaining budget without updating the spent variable
  boolean isExceeded(); //should be able to mention if the budget is exceeded 
  void resetBudget(); //should be able to reset the budget and spent amount for a new period    
}
