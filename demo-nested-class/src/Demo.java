public class Demo {
  
    public static void main(String[] args) {
      //Bank bank = new Bank(); 

      //Nested static class
      Bank.Account account = new Bank.Account();  //new緊account // 當contructor
      
      System.out.println(account.getAccNo());

    // Account account = Bank.createAccount().getAccNo();

    //Inner class (non static)  **memory need to new BOX object > new box > use BOX to new box.
      //Box.Ball ball = new Box().new Ball();     //new Box().new Ball(); // 重心係BALL 到
      Box box = new Box(); //new box to store..
      Box.Ball ball = box.new Ball();
      System.out.println(ball.getCapacity()); //10 share 弟屬閞係attituble 
      box.add(ball);
      System.out.println(box.getBalls().size());

      int x = 3;
      if ( x == 3){
      //Anonymous Inner Class
      Swimable john = new Swimable() { //連person 都唔寫, 唔想俾其他人用, 只用一次
        @Override 
        public void swim(){
          System.out.println("John is swimming....");
        }
      };
      
      john.swim();
    }else{
      Swimable sally = new Swimable() {
        private String name = "Sally";

        public String getName() { //polymolysim cannot getname..infact.
          return this.name;//coz refernce only in here. cannot get the real class... coz interface no obserber abstrutibute.
        }

        @Override
        public void swim(){
          System.out.println("Sally is swimming...");
        }
      };
      sally.swim(); //cannot sally.getName() //polymorphsim 
    }
  } 
}//no class
  