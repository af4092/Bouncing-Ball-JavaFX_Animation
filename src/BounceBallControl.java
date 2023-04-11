package com.special.effect.javafxprojects.BounceBall;

import com.special.effect.javafxprojects.BallPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BounceBallControl extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BallPane ballPane = new BallPane();

        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        ballPane.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.UP){
                ballPane.increaseSpeed();
            }else if(e.getCode() == KeyCode.DOWN){
                ballPane.decreaseSpeed();
            }
        });

        Scene scene = new Scene(ballPane, 250, 150);
        stage.setTitle("Bouncing Ball");
        stage.setScene(scene);
        stage.show();

        ballPane.requestFocus();
    }
}
