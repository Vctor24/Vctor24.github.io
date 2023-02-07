/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafxapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author diurno
 */
public class FXMLDocumentController implements Initializable {
    String operador1;
    String operacion;
    String operador2;
    @FXML
    private TextField tfPantalla;
    @FXML
    private Button bAtras;
    @FXML
    private Button bCE;
    @FXML
    private Button bC;
    @FXML
    private Button bDivide;
    @FXML
    private Button bSiete;
    @FXML
    private Button bOcho;
    @FXML
    private Button bNueve;
    @FXML
    private Button bMultiplicar;
    @FXML
    private Button bCuatro;
    @FXML
    private Button bCinco;
    @FXML
    private Button bSeis;
    @FXML
    private Button bMas;
    
    @FXML
    private Button bUno;
    @FXML
    private Button bDos;
    @FXML
    private Button bTres;
    @FXML
    private Button bMenos;
    @FXML
    private Button bMasMenos;
    @FXML
    private Button bCero;
    @FXML
    private Button bComa;
    @FXML
    private Button bIgual;
    
   
   
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bAtrasClick(ActionEvent event) {
    String result = tfPantalla.getText();
    result = result.substring(0, result.length()-1);
    if(result.equals("")){
        result = "0";
    }
    tfPantalla.setText(result);
    }

    @FXML
    private void bCEClick(ActionEvent event) {
        tfPantalla.setText("0");
    }

    @FXML
    private void bCClick(ActionEvent event) {
        tfPantalla.setText("0");
        operador1 = "";
        operador2 = "";
        operacion = "";
    }

    @FXML
    private void bDivideClick(ActionEvent event) {
        operador1 = tfPantalla.getText();
        tfPantalla.setText("0");
        operacion = "/";
    }

    @FXML
    private void bSieteClick(ActionEvent event) {
    if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"7");
        }else tfPantalla.setText("7");
    }

    @FXML
    private void bOchoClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"8");
        }else tfPantalla.setText("8");
    }

    @FXML
    private void bNueveClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"9");
        }else tfPantalla.setText("9");
    
    }

    @FXML
    private void bMultiplicarClick(ActionEvent event) {
        operador1 = tfPantalla.getText();
        tfPantalla.setText("0");
        operacion = "*";
    }

    @FXML
    private void bCuatroClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"4");
        }else tfPantalla.setText("4");
    }

    @FXML
    private void bCincoClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"5");
        }else tfPantalla.setText("5");
    }

    @FXML
    private void bSeisClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"6");
        }else tfPantalla.setText("6");
    }

    @FXML
    private void bMasClick(ActionEvent event) {
    operador1 = tfPantalla.getText();
    tfPantalla.setText("0");
    operacion = "+";
    }

    @FXML
    private void bUnoClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"1");
        }else tfPantalla.setText("1");
    }

    @FXML
    private void bDosClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"2");
        }else tfPantalla.setText("2");
    }
    

    @FXML
    private void bTresClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"3");
        }else tfPantalla.setText("3");
    }
    

    @FXML
    private void bMenosClick(ActionEvent event) {
        operador1 = tfPantalla.getText();
        tfPantalla.setText("0");
        operacion = "-";
    }

    @FXML
    private void bMasMenosClick(ActionEvent event) {
        if(tfPantalla.getText().charAt(0) == '-'){
            tfPantalla.setText(tfPantalla.getText().substring(1));
        } else{
            tfPantalla.setText("-"+ tfPantalla.getText());
        }
    }

    @FXML
    private void bCeroClick(ActionEvent event) {
        if(!tfPantalla.getText().equals("0")){
            tfPantalla.setText(tfPantalla.getText()+"0");
        }
    }

    @FXML
    private void bComaClick(ActionEvent event) {
    if(!tfPantalla.getText().contains(".")){
        tfPantalla.setText(tfPantalla.getText()+".");
    }
    }

    @FXML
    private void bIgualClick(ActionEvent event) {
        operador2 = tfPantalla.getText();
        double op1 = Double.parseDouble(operador1);
        double op2 = Double.parseDouble(operador2);
        double resultado = 0; 
        switch(operacion){
            case "+": 
                resultado = op1 + op2;
            break;
            case "-":
                resultado = op1 - op2;
            break;
            case "*":
                resultado = op1 * op2;
            break;
            case "/":
                resultado = op1 / op2;
            break;           
        }
        String result = resultado+"";
        if (result.endsWith(".0")){
            result = result.substring(0, result.length()-2);
        }
        tfPantalla.setText(result);
    }
}
   
    

