package Views;

import javax.swing.*;

public class ValueWindow {
    private static double value;
    public static double menuValue(){

        try{
            value = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el valor a convertir","Valor",
                    JOptionPane.QUESTION_MESSAGE));
            return  value;
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"El valor Ingresado es invalido");
            return 0;
        }

    }
}
