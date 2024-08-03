package deck;

public class Card {

 // private String suit;
 // private String rank;

 private Suit Suit; //Enum Suit
 private Rank rank; //Enum Rank
  
//public Card(String suit, String rank){
  public Card(Suit suit,Rank rank){
  this.suit = suit;
  this.rank = rank;
}

//public String getSuit()
public Suit getSuit(){
  return this.suit;

}

//public String getRank(){
public Rank getRank(){
 return this.rank;
}

//Coding Style: Early Return
public boolean isHigherThan(Card card){//when the method is defined small enough
  //compare rank first, if they are equal, then compare suit
  if(this.rank.isHigherThan(card.getRank())){   ///** coding style : value return: 就小if / for loo */
    return true; //exit method!!
  if(this.rank == card.getRank()&& this.suit.isHigherThan(card.getSuit()))
    return true; //early return
  return false;//  base condition (most likely)mo ,,, return 少可能性
  }
}
//prove 
@Override
public String toString(){
  return "Card(" + "suit = " + this.suit + "rank = " + this.rank + ")";
}



  public static void main(String[] args) {
  //   Deck deck = new Deck();
  //   Card[] cards = deck.getCards();
  //   for (Card card : cards){
  //     System.out.println(card);
  //   }    
  
  // // shuffle()
  //   //deck.suffle(10);
  //   new ShuffleManager(deck.getCards()).shuffle(10);  // doc.佢行為 , can change to .check vinc.

  //   for (Card cars: deck.getCards()){
  //     System.out.println(card);
  //   }
    System.out.println(new Card(Suit.CLUB, Rank.NINE)
        .isHigherThan(new Card(Suit.DIAMOND, Rank.JACK))); // false

    System.out.println(new Card(Suit.CLUB, Rank.JACK)
        .isHigherThan(new Card(Suit.DIAMOND, Rank.JACK))); // true

    System.out.println(new Card(Suit.SPADE, Rank.KING)
        .isHigherThan(new Card(Suit.SPADE, Rank.JACK))); // true


}
}
}
}

