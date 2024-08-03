package order;
//20240614 想你欣賞個設計
import java.math.BigDecimal;

public class Order {
  private static int count = 0;
  private int id;
  private Item[] items;
  private String coupon;

  public Order(String coupon){
    this.id = ++count;
    this.items = new Item[0];
  }
  public int getId(){
    return this.id;
  }

  public Item[] getItems(){
    return this.items;
  }

  public String getCoupon(){
    return this.coupon;
  }

  public double getDiscount(){
    if (isCouponValid())
      return 0.2d;
    return 0.0d;
    }
  
    public boolean isCouponValid(){
      return true;
    }

  public void addItem (Item item){
    Item[] itemsList = new Item[this.items.length + 1];  //create new arr to store new array.
    for (int i = 0; i < this.items.length;i++){
      itemsList[i] = this.items[i];
    }
    itemsList[itemsList.length - 1] = item;  //last elements
    this.items = itemsList;
    //replace, object arrow to new 
    //arr is local variable , after run, will destory.
  }
  
    

  public double total(){
    BigDecimal amount = BigDecimal.valueOf(0L);
    // add, substract, multiply,divide methods return itself, return new object.
    for (int i = 0 ; i<this.items.length; i++){
    amount = amount.add(BigDecimal.valueOf(this.items[i].subtotal()));//return new BigDecimal ()
  }
  //calculate Discount
  amount = amount.multiply(BigDecimal.valueOf(1.0 - getDiscount()));
       ///SUBTOTAL 係關鍵
  return amount.doubleValue(); // convert from BigDecimal Object to double primitive value  (object身上PRSENTTAion)
  
  }
  

  public static void main(String[] args) {
    Order order = new Order("ABC");
    Item item = new Item(96.0d, 2);
    System.out.println(item.subtotal());//192.0
    order.addItem(item);
    
    Item item2 = new Item(10.0d,3);
    order.addItem(item2);
    System.out.println(order.total());
  }
}
