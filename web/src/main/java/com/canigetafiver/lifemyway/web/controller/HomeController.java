package com.canigetafiver.lifemyway.web.controller;
import java.util.Optional;

import com.canigetafiver.lifemyway.web.auth.AuthSession;
import com.canigetafiver.lifemyway.web.nav.NavigationController;
import com.canigetafiver.lifemyway.web.nav.View;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {
    @FXML private Label welcomeLabel;

    @FXML private void initialize(){
        if(welcomeLabel==null) return;
        Optional<AuthSession> session=NavigationController.getInstance().authService().currentSession();
        String displayName=session.map(AuthSession::displayName).orElse("Friend");
        welcomeLabel.setText("Welcome, "+displayName+ "!");
    }

    @FXML private void onViewExpenses(){
        NavigationController.getInstance().navigateTo(View.EXPENSE_LIST);
    }

    @FXML private void onLogout(){
        NavigationController.getInstance().authService().logout();
        NavigationController.getInstance().navigateTo(View.LOGIN);
    }
}
