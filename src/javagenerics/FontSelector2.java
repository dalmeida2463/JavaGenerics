/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author dalmeida2463
 */
public class FontSelector2 extends Application {
    
    ComboBox<String> fontNameComboBox;
    ComboBox<Integer> fontSizeComboBox;
    Text textNode;
    CheckBox boldChkBox;
    CheckBox italicBox;
    
            
    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        HBox centerPane = new HBox(5);
        Text textNode = new Text("Programming is Fun");
        centerPane.getChildren().add(textNode);
        centerPane.setAlignment(Pos.CENTER);
        borderPane.setCenter(centerPane);
        
        HBox topPane = new HBox();
        
        ObservableList<String> fontNameList =
                FXCollections.observableArrayList(Font.getFontNames());
        fontNameComboBox = new ComboBox<>(fontNameList);
        fontNameComboBox.setValue("Arial");
        Label fontNameLabel = new Label("Font Name", fontNameComboBox);
        
        ArrayList<Integer> fontSizeList = new ArrayList<>();
        for(int i = 0; i <= 100; i++) fontSizeList.add(i);
        ObservableList<Integer> fontSizes =
            FXCollections.observableArrayList(fontSizeList);
        fontSizeComboBox = new ComboBox<>(fontSizes);
        fontSizeComboBox.setValue(20);
        Label fontSizeLabel = new Label("Font Size", fontSizeComboBox);
        fontSizeLabel.setContentDisplay(ContentDisplay.RIGHT);
        fontNameLabel.setContentDisplay(ContentDisplay.RIGHT);
        
        topPane.setAlignment(Pos.CENTER);
        topPane.getChildren().addAll(fontNameLabel, fontNameComboBox, fontSizeLabel,fontSizeComboBox);
        borderPane.setTop(topPane);
        
        boldChkBox = new CheckBox("Bold");
        italicBox = new CheckBox("Italicize");
        HBox bottomHBox = new HBox(5);
        bottomHBox.setAlignment(Pos.CENTER);
        bottomHBox.getChildren().addAll(boldChkBox,italicBox);
        borderPane.setBottom(bottomHBox);
            
        textNode.setFont(Font.font("Arial"));
        
        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        EventHandler<ActionEvent> handler = e->{
            textNode.setFont(
                    Font.font(fontNameComboBox.getValue(),
                    boldChkBox.isSelected() ? FontWeight.BOLD: FontWeight.NORMAL,
                    italicBox.isSelected() ? FontPosture.ITALIC: FontPosture.REGULAR,
                    fontSizeComboBox.getValue()
                ));
        };
        
        fontNameComboBox.setOnAction(handler);
        fontSizeComboBox.setOnAction(handler);
        boldChkBox.setOnAction(handler);
        italicBox.setOnAction(handler);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
