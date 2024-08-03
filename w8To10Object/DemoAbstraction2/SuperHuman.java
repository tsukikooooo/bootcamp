public abstract class SuperHuman {
  private double height;
  //cannot new, but need contructor

  public SuperHuman(double height){ //?
    this.height = height;

  }
  //Why abstract class has constructor? but we cannot creat object for abstract 
  private SuperHuman(double height){
    this.height = height;
  }
//interface 唔影響, why java not allow multiple inheritance/? but multiple interfaces.
//so why only extend one Class. 
//after java 8 hv "default"
  public double getHeight(){
    this.height = height;


    //iinterfac can extend interfact
    //interface is 1belongs
    //makeSound() need overfide,, 
    //interface, risk low , 
    //abstract class抽黎Authobit, 中何重易
    //like business live 
   //描黎一齊住你UP, 睇下點抽離,like 保險
    
   //what is 

  }
}
