package com.special.effect.javafxprojects.BounceBall;

import com.special.effect.javafxprojects.BallPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BounceBallSlider extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BallPane ballPane = new BallPane();
        Slider slSpeed = new Slider();
        slSpeed.setMax(20);
        ballPane.rateProperty().bind(slSpeed.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(slSpeed);

        Scene scene = new Scene(pane, 250, 250);
        stage.setTitle("Bouncing Ball Slider");
        stage.setScene(scene);
        stage.show();
    }
}
