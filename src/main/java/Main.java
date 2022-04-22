import CoinClasses.Coin;
import CoinClasses.CoinFactory;
import CoinClasses.Coins;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Path outputPath = Paths.get("results.txt");

        System.out.println("Welcome to the currency converter");
        InputReceiver receiver = new InputReceiver();

        ArrayList<CalculationResult> resultList = new ArrayList<>();

        do {
            Coins coinType;
            if (receiver.chooseOption() == 1) {
                coinType = Coins.USD;
            } else {
                coinType = Coins.ILS;
            }
            Coin coin = CoinFactory.getCoinInstance(coinType);
            double calcValue = coin.calculate(receiver.amountInput());

            System.out.println(calcValue);

            CalculationResult result = new CalculationResult(calcValue, coinType);
           resultList.add(result);

        } while (receiver.doOver());

        System.out.println("Thanks for using our currency converter");

        if (Files.exists(outputPath)) {
            Files.delete(outputPath);
        }
        Files.createFile(outputPath);

        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i).toString());
            Files.writeString(outputPath, resultList.get(i).toString() + "\n", StandardOpenOption.APPEND);
        }

    }
}

