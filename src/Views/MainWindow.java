package Views;

import javax.swing.*;

public class MainWindow {
    private Object [] options = {"Divisas","Temperatura"};

    public void welcome(){
        JOptionPane.showInputDialog(null,"Selecciona la Conversion que deseas realizar","Convertidor Alura-Oracle",
                JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
    }
}
