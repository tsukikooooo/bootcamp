package deck.game;

import deck.Card;
import deck.Deck;

public class BigTwo {


//Statses  memoryStack
  public static boolean isFourKind(Card[] cards) { // 四條
    return false;
  }

  public static boolean isStraight(Card[] cards) { // 5隻順住去
    return false;
  }

  public static boolean isFullHouse(Card[] cards){ //桃花順
    return false;
  }

  public static boolean isRoyalFlush(Card[] cards) {
    return false;
  }

  public static void main(String[] args) {
    // Problem 1: How to design/handle the 2 Joker Card in the classes? (parent
    // class/ interface)
    Deck deck = new Deck();  //Problem 1: 52?rank ,ng facible 52 raks? TWO is the highest 
    // Problem 2: 52? rank? Rank.TWO is the highest in Big Two.


  }
}