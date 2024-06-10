package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane to represent the chessboard
        GridPane gridPane = new GridPane();

        // Set the size of each square on the chessboard
        int squareSize = 50;

        // Add alternating colored squares to represent the chessboard pattern
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle square = new Rectangle(squareSize, squareSize);

                // Alternate the colors of the squares
                if ((row + col) % 2 == 0) {
                    square.setFill(Color.WHITE);
                } else {
                    square.setFill(Color.BLACK);
                }

                gridPane.add(square, col, row);
            }
        }

        // Create the scene and set it in the stage
        Scene scene = new Scene(gridPane, 8 * squareSize, 8 * squareSize);
        primaryStage.setScene(scene);

        // Set the title of the stage
        primaryStage.setTitle("Chess Board");

        // Show the stage
        primaryStage.show();
    }
}
