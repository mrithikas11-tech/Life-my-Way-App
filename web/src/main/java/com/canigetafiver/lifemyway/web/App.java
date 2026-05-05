package com.canigetafiver.lifemyway.web;

import com.canigetafiver.lifemyway.service.UserService;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, LifeMyWay!");
        UserService userService = new UserService();
        // Use the userService to get user information
        System.out.println(userService.getUser().getName());
    }
}
