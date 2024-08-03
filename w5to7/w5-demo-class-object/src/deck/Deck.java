package deck;

import java.util.Arrays;

// use static, coz not alosp on object, static belongs to class,  你想唔想每次NEW 時係咪需要佢,,,,係先private, 

public class Deck {
  //Player , Deck, Card, 
  // public static final String [] suits = new String[]{"DIAMOND", "CLUB","HEART","SPADE"};
  // private static final String [] ranks = new String[] {"2","3","4","5","6","7","8","9","10", "J","Q","K","A"};

  private static int length = Suit.values().length * Rank.values().length;

  private Card[] cards; //洗緊依個牌...

  public Deck(){
    this.cards = new Card[length];
    int idx = 0;
    for (Suit suit : Suit.values()){
      for (Rank rank : Rank.values()){
        this.cards[idx++] = new Card(suit, rank);
      }
      }
    }
   
   public static void test(){  //main is when attend 
    System.out.println("Hello");
    Deck d = new Deck(); 
    d.getCards();  // XXthis card.
    } //無This.
    


  public Card[] getCards() {
    return this.cards;

  }
  
    //joycer.
    public void shuffle(int times) {
      ShuffleManager sm = new ShuffleManager(getCards());
      sm.shuffle(times);
      this.cards = sm.getCards();
    }
  
    public static void main(String[] args) {
      Deck deck = new Deck();
      deck.shuffle(100);
      
      System.out.println("Card[] after shuffle():");
  
      for (Card card : deck.getCards()) {
        System.out.println(card);
    }
  
}
}
