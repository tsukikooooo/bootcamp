package sorting;

import java.util.Comparator;

public class LongDescendingOrder implements Comparator<Long>{
  @Override
  public int compare(Long l1, Long l2){
    return l2.compareTo(l1); //l2 > l2 return 負數, l1行先'
    //return l2 > l1 ? -1: 1 //X premivate , 係warrper class...not suggess.. ">" --> convert Long to long
    //desending
  }
  
}
