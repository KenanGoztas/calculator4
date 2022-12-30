package com.example.calculator4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Calculator4Controller implements Initializable {


    @FXML
    private TextField firstNumber;

    @FXML
    private TextField resultField;

    @FXML
    private TextField secondNumber;

    private int num1;
    private int num2;
    private double result;
    @FXML
    void calculate(ActionEvent event) {
        String operation = ((Button) event.getSource()).getText();
        num1 = Integer.parseInt(firstNumber.getText());
        num2 = Integer.parseInt(secondNumber.getText());
        result =operations(num1, num2, operation.charAt(0));
        resultField.setText(Double.toString(result));
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public double operations(int n1, int n2, char c){

        switch (c) {
            case '+':
                return n1+n2;
            case '-':
                return n1-n2;
            case '*':
                return n1*n2;
            case '/':
                if(n2==0) {
                    System.out.println("girilen sayı sıfıra bölünemez");
                    return 0;
                }
                else
                    return n1/(double)n2;
        }
        return 0;
    }


//    public void Operation(ActionEvent ae) {
//        String operation = ((Button) ae.getSource()).getText();
//        if (!operation.equals("=")) {
//            if (!op.equals("")) {
//                return;
//            }
//            op = operation;
//            number1 = Long.parseLong(txt_result.getText());
//            txt_result.setText("");
//        } else {
//            if (op.equals("")) {
//                return;
//            }
//            number2 = Long.parseLong(txt_result.getText());
//            calculate(number1, number2, op);
//        }
//    }




}

