package Views;

import Logic.Currencies;

import javax.swing.*;



public class CurrenciesWindow {
    private Object [] options = {"De pesos a Dolar","De pesos a Euro","De pesos a Libra","De pesos a Yen",
                                  "De pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos"};
    private Object option;
    private double value;
    private Currencies converter = new Currencies();

    public void menu(){
        option =JOptionPane.showInputDialog(null,"Elija la moneda a la que deseas converitr tu dinero","Monedas",
                JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

           value = ValueWindow.menuValue();
           JOptionPane.showMessageDialog(null, converter.convertertoCurrency(value, option));

    }
}
