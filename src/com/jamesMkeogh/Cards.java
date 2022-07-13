package com.jamesMkeogh;

import java.util.Random;

public class Cards<cardVal> {

    int cardVal;
    String picCard;
    int numCards = 51;
    int suits = 3;

    void pickACard() {
        Random randVal = new Random();
        int upperbound = 12;

        cardVal = randVal.nextInt(upperbound);
        System.out.println("face value " + cardVal);


    }

    void setValue(int cardVal) {
        switch (cardVal) {
            case 1:
                picCard = "Ace";
                break;
            case 11:
                picCard = "Jack";
                break;
            case 12:
                picCard = "Queen";
                break;
            case 13:
                picCard = "King";
                break;
            default:
                picCard = String.valueOf(cardVal);
        }


    }
    void showCard(){

        System.out.println("Your card is "+ cardVal+" "+picCard);
    }

}
