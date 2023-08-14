package Logic;

public class Temperature {

    private double celcius, farenheit;

    public String convertertoTemperature(double value, Object option){
        if(option == "De Farenheit a Celsius"){
            celcius = (value - 32) /1.8;
            return "La temperatura de "+ value + "°F es igual a " + celcius + " °C";
        }else if(option == "De Celsius a Farenheit"){
            farenheit = (1.8 * value) + 32;
            return "La temperatura de "+ value + "°C es igual a " + farenheit + " °F";
        }else return "Valor invalido";
    }
}
