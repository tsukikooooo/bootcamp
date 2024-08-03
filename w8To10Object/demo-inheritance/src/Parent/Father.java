package Parent;

public class Father {
  private String name;

  //implicityly empty constructor
   public Father(){

   }
  //WHen there is a non-empty constructor the class will remove 
public Father(String name){
  this.name = name;
}

  
}
