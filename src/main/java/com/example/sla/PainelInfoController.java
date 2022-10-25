package com.example.sla;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PainelInfoController implements Initializable {

    public Slider slPeso;
    public Slider slAlt;
    public Label altL;
    public Label kiloL;

    public void btArm(ActionEvent actionEvent) {
    }
        private int Kilo;
        private int alt;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slPeso.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                Kilo =  (int) slPeso.getValue();
                kiloL.setText(Integer.toString(Kilo)+"KG");
            }
        });
        slAlt.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                alt =  (int) slAlt.getValue();
                altL.setText(Integer.toString(alt)+"CM");
            }
        });
    }
}
