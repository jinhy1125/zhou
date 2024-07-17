package com.jinhy.zhou.sceen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TransparentWindowFX extends Application {

    // 用于存储窗口拖动的初始x和y坐标
    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage primaryStage) {
        // 创建一个标签用于显示文字
        Label label = new Label("Draggable and Transparent Window in JavaFX");
        label.setTextFill(Color.BLACK);

        // 创建一个栈面板作为根节点，并设置透明背景
        StackPane root = new StackPane(label);
        root.setStyle("-fx-background-color: transparent;");

        // 创建场景，设置透明
        Scene scene = new Scene(root, 400, 200);
        scene.setFill(Color.TRANSPARENT);

        // 使窗口可拖动
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffset);
            primaryStage.setY(event.getScreenY() - yOffset);
        });

        // 设置舞台样式为透明
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        // 设置场景到舞台
        primaryStage.setScene(scene);
        // 设置舞台为置顶
        primaryStage.setAlwaysOnTop(true);
        // 显示舞台
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
