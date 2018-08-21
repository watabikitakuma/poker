package tddbc.poker.io;

import tddbc.cards.Cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiscardReader {

    public Cards read() {
        String selectedCards = "";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("捨てるカードを半角スペースカンマ区切りで入力してください。例） A♠,5♦,K♥");
            selectedCards = reader.readLine();

        } catch (IOException e) {
            System.out.println("致命的なエラーが発生しました。ポーカーは中止します。");
            System.exit(1);
        }

        return selectedCards.isEmpty() ? null : new CardParser().parse(selectedCards.split(","));
    }
}
