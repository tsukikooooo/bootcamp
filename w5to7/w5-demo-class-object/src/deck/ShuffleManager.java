package deck;

import java.util.Random;

public class ShuffleManager {


  //attribute / dependency
  private Card[] cards; // ** 俾牌佢, 再.行為  <<有依個address 就可以洗牌, just change the address..  coz address problem. 
  //why need to define 2 class as card[] cards. coz they have same address, same cards. the main key.
  public ShuffleManager(Card[] cards){
    this.cards = cards; // 邊個new manger 閞建
  }

  public Card[] getCards(){
    return this.cards;
  }


   //behavior
  public void shuffle(int times){
    Card[] newCards = null;
  for ( int i = 0 ; i < times; i ++) {
    int startIdx = new Random().nextInt(Deck.length -1) + 1; // 0-51
    int endIdx = new Random().nextInt(Deck.length - startIdx) + startIdx;
    newCards = new Card[Deck.length];   //copy 快D 
    int count = 0;
    for(int j = startIdx; j <= endIdx; j++){
      newCards[count++] = this.cards[j];
    }
    for (int j = 0 ; j < startIdx; j++){
      newCards[count++] = this.cards[i];
    }
    for (int j = endIdx + 1; j < Deck.length;j++){
      newCards[count++] = this.cards[j];
    }
      this.cards = newCards; //每次洗完replace 入去.
    }
  }
   

  }

