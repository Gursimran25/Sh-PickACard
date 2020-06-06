/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.ranValue());
            c.setSuit(Card.SUITS[c.ranSuit()]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
        }
        for(int i = 0; i< magicHand.length; i++)
        {
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }
          
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the Card Value : ");
        int cardNumber = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your Suit Value : ");
        String suitName = input2.nextLine();
        System.out.println("User's Card" + " " + suitName + " " + cardNumber);
    }
    
}
