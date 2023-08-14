package Views;

import Logic.Temperature;

import javax.swing.*;

public class TemperatureWindow {
    private Object [] options = {"De Farenheit a Celsius","De Celsius a Farenheit"};
    private Object option;
    private double value;
    private Temperature converter = new Temperature();

    public void menu(){
        option = JOptionPane.showInputDialog(null,"Selecciona la conversion que deseas realizar","Temperatura"
                ,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        value = ValueWindow.menuValue();
        JOptionPane.showMessageDialog(null,converter.convertertoTemperature(value,option));

    }
}
