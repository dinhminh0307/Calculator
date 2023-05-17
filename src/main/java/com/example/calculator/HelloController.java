package com.example.calculator;

import com.example.calculator.Model.Answer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.net.URL;
import java.nio.DoubleBuffer;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private HBox button7;
    @FXML
    private HBox button8;
    @FXML
    private HBox button9;
    @FXML
    private HBox buttonDelete;
    @FXML
    private HBox buttonAc;
    @FXML
    private HBox button4;
    @FXML
    private HBox button5;
    @FXML
    private HBox button6;
    @FXML
    private HBox buttonMultiple;
    @FXML
    private HBox buttonDivider;
    @FXML
    private HBox button1;
    @FXML
    private HBox button2;
    @FXML
    private HBox button3;
    @FXML
    private HBox buttonPlus;
    @FXML
    private HBox buttonMinus;
    @FXML
    private HBox button0;
    @FXML
    private HBox buttonPoint;
    @FXML
    private HBox buttonPowerByTen;
    @FXML
    private HBox buttonAns;
    @FXML
    private HBox buttonEqual;
    @FXML
    private Text text0;
    @FXML
    private Text text1;
    @FXML
    private Text text2;
    @FXML
    private Text text3;
    @FXML
    private Text text4;
    @FXML
    private Text text5;
    @FXML
    private Text text6;
    @FXML
    private Text text7;
    @FXML
    private Text text8;
    @FXML
    private Text text9;
    @FXML
    private GridPane gridPane;
    @FXML
    private Text resultText;
    @FXML
    private AnchorPane anchorPane;

    private String storeToString = "";
    private double preNumber;
    private double postNumber;
    private double answer;
    public void setComponent() {
        resultText = new Text(Double.toString(answer));
        resultText.setFont(new Font("Arial", 20));
        anchorPane.getChildren().add(resultText);
        gridPane.setGridLinesVisible(true);
        for(Node node : gridPane.getChildren()) {
            node.setStyle(("-fx-background-color: #FA9E56"));
        }
    }

    public void addResultToScreen() {
        anchorPane.getChildren().clear();
        anchorPane.getChildren().add(resultText);
        AnchorPane.setTopAnchor(resultText, 0.0);
        AnchorPane.setBottomAnchor(resultText, 0.0);
        AnchorPane.setLeftAnchor(resultText, 0.0);
        AnchorPane.setRightAnchor(resultText, 0.0);
    }
    public void onButton0(MouseEvent event) {
        Answer newAnswer = new Answer();
        anchorPane.getChildren().clear();
        if(newAnswer.getValue() == 0.0) {
            preNumber = Double.parseDouble(text0.getText());
            resultText.setText(Double.toString(preNumber));
        }
        else {
            if(button0.isFocused()) {
                postNumber = Double.parseDouble(text0.getText());
            }
            storeToString = storeToString + newAnswer.to_String() + text0.getText();
            resultText.setText(storeToString);
            newAnswer.setValue(Double.parseDouble(storeToString));
        }
    }
    public void onButton1(MouseEvent event) {
        Answer newAnswer = new Answer();
        anchorPane.getChildren().clear();
        if(newAnswer.getValue() == 0.0) {
            preNumber = Double.parseDouble(text0.getText());
            resultText.setText(Double.toString(preNumber));
        }
        else {
            storeToString = storeToString + newAnswer.to_String() + text0.getText();
            resultText.setText(storeToString);
            newAnswer.setValue(Double.parseDouble(storeToString));
        }
    }
    public void clearTheScreen() {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setComponent();
    }
}