package com.canigetafiver.lifemyway.controllers;


import com.canigetafiver.lifemyway.api.Expense;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortController {

    public List<Expense> sortByAmount(List<Expense> expenses) {

        List<Expense> sorted = new ArrayList<>(expenses);

        sorted.sort(Comparator.comparingDouble(Expense::getAmount));

        return sorted;
    }

    public List<Expense> sortByTitle(List<Expense> expenses) {

        List<Expense> sorted = new ArrayList<>(expenses);

        sorted.sort(Comparator.comparing(Expense::getTitle));

        return sorted;
    }
}
