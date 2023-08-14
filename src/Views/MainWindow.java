package Views;

import Logic.Temperature;

import javax.swing.*;

public class MainWindow {
    private Object [] options = {"Divisas","Temperatura"};
    private Object option;
    private int exit;
    private TemperatureWindow temperature = new TemperatureWindow();
    CurrenciesWindow curriences = new CurrenciesWindow();

    public void welcome(){
      do {
          option = JOptionPane.showInputDialog(null, "Selecciona la Conversion que deseas realizar", "Convertidor Alura-Oracle",
                  JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

          if (option == "Divisas") {
              curriences.menu();
          } else {
              temperature.menu();
          }

          exit= JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");

      }while(exit == 0);

    }

}
