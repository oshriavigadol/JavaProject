package CoinClasses;

import CoinClasses.Coin;
import CoinClasses.Coins;
import CoinClasses.ILS;
import CoinClasses.USD;

public class CoinFactory {

    //Returns an instance of a Coin class
    public static Coin getCoinInstance(Coins coinType) {
        switch (coinType) {
            case ILS:
                return new ILS();
            case USD:
                return new USD();
        }
        return null;
    }
}

