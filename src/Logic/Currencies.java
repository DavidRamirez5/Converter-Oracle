package Logic;

public class Currencies {

    // Estableciendo valores

    private double dollar = 17;
    private double euro = 19;
    private double libra = 21.5;
    private double Yen = 8.5;
    private double Won = 77.5;

    public String convertertoCurrency(double value, Object option){
        // Tambien se puede usar una sentencia switch
        if(option == "De pesos a Dolar"){
            return "Tienes $ " + String.format("%.2f",value/dollar) + " USD";

        }else if (option =="De pesos a Euro"){
            return "Tienes € " + String.format("%.2f",value/euro) + " EUR";

        } else if (option == "De pesos a Libra") {
            return "Tienes £ " + String.format("%.2f",value/libra) + " GBP";

        }else if(option== "De pesos a Yen"){
            return "Tienes ¥ " + String.format("%.2f",value/Yen) + " JPY";

        }else if (option == "De pesos a Won Coreano"){
            return "Tienes ₩ " + String.format("%.2f",value/Won) + " KRW";

        }else if(option == "De Dolar a Pesos"){

            return "Tienes $  " + String.format("%.2f",dollar * value) + " MXN";

        }else if (option == "De Euro a Pesos"){

            return "Tienes $ " + String.format("%.2f",euro * value) + " MXN";

        }else if (option == "De Libras a Pesos"){

            return "Tienes $ " + String.format("%.2f",libra*value) + " MXN";

        }else return "Valor Invalido";
    }


}


