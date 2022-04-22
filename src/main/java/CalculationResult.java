import CoinClasses.Coins;

public class CalculationResult {
    private double calcResult;
    private Coins coinType;


   public CalculationResult(double result, Coins coinType){
       this.calcResult = result;
       this.coinType = coinType;
   }

    @Override
   public String toString() {
        String resStr = calcResult + ", ";
        if (coinType == Coins.ILS) {
            resStr += "CoinTypes.ILS to CoinTypes.USD";
        } else if (coinType == Coins.USD) {
            resStr += "CoinTypes.USD to CoinTypes.ILS";
        }
       return resStr;
   }



}
