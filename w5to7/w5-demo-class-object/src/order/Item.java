package order;

public class Item {

  private double price;
  private int quantity;

  public Item(double price, int quantity){
    this.price = price;
    this.quantity = quantity;
  }

  
  public double getPrice(){
    return this.price;
  }

  public int getQuantity(){
    return this.quantity;
  }

  // public void setPrice(double price){
  //   this.price = price;
  // }

  // public void setQuantity(int quantity){
  //   this.quantity = quantity;
  // }
  
  public double subtotal() {
    return this.price * this.quantity; // double* int >> = double * double 3.33333 * 2.0 (有無精度問題?)
  }
  
  
}
