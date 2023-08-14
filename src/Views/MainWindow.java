package Views;

import javax.swing.*;

public class MainWindow {
    private Object [] options = {"Divisas","Temperatura"};
    private Object option;
    private int exit;

    public void welcome(){
      do {
          option = JOptionPane.showInputDialog(null, "Selecciona la Conversion que deseas realizar", "Convertidor Alura-Oracle",
                  JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

          if (option == "Divisas") {
              CurrenciesWindow curriences = new CurrenciesWindow();
              curriences.menu();
          } else {
              JOptionPane.showMessageDialog(null, "En construccion ......");
          }

          exit= JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");

      }while(exit == 0);

    }

}
