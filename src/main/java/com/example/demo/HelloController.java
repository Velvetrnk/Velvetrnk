package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Нееее,миша все фигня");
    }

    @FXML
    protected void onDAlloButtonClick() {welcomeText.setText("Ты че? ты же не егор");
    }

    @FXML
    protected void onLElloButtonClick() {
        welcomeText.setText("Вот, это оно ");
    }

    @FXML
    protected void onYlloButtonClick() { welcomeText.setText("Ну такое");
    }
}