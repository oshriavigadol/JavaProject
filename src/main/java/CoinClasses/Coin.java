package CoinClasses;

public abstract class Coin implements ICalculate {

    public abstract double getValue();

    //Converts the user's input to the desired currency
    public double calculate(double input){

        return input*getValue();
    }
}
