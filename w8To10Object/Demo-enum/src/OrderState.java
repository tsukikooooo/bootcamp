public enum OrderState {
  ORDERED(0),
  PAID(1),
  READY_TO_SHIP(2),
  DELIVERED(3);

private int value;

  public OrderStatus next(){
   for (OrderState statue: OrderStatus.vlaue()){
    if (this.value + 1 == statues.getValue())
     return status;
     return numbll;
   }

  public getOrderStatus (){
    return this.getOrderStatus;

  }
  public static void main(String[] args) {
    System.out.println(OrderState.READY_TO_SHIP.next());
  }
}
