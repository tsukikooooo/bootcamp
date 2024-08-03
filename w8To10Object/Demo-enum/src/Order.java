public class Order {
  
  private OrderState orderState;
  private int paidAmount;
  private int orderAmount;

  public Order(int orderAmount){
    this.orderAmount = orderAmount;
    this.orderState = OrderState.ORDERED;
  }

  public OrderState getOrderStatus(){
    return this.orderState;
  }

  public void credit(int amount){
    this.paidAmount += amount;
    //Encapsulation
    if(this.isPaid() && this.getOrderStatus() == OrderState.ORDERED){
    //  this.setOrderState(this.orderState.next());
    //this.setOrderStatus(OrderStatus.PAID)
    setToPaid();
  }
}

  public void setToPaid() {
    this.orderState(OrderState.PAID);
  }
  public boolean isPaid(){
    return this.paidAmount >= this.orderAmount; //獨發點
  
  }

  public static void main (String[] args){
    Order order = new Order(100);
  
    //create card > 50
    System.out.println(order.paidAmount);
    
    order.credit(50);
    // OrderState currenStatus = order.getOrderStatus();
    // if(order.isPaid() && order.getOrderStatus() == OrderState.ORDERED){
    //   order.setOrderState(currenStatus.next());
    }

    
  }


