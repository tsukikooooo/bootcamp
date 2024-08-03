public enum Direction{
  EAST(1),NORTH(2),WEST(-1),SOUTH(-2);

  // Advantage: Able to present some relationship among the enum objects

  private int number;

  //constructor
  private Direction(int number){
    this.number = number;
  }

//instance method
  private boolean isOppsite(Direction direction){
    return Math.abs(direction.number)==Math.abs(this.number) && direction != this; 
}
  public static void main(String[] args) {
    // Direction > Class/enum
    //Diection.EAST > object
    System.out.println(Direction.EAST.isOppsite(Direction.EAST));
    
    System.out.println(Direction.NORTH.isOppsite(Direction.SOUTH));
    
    System.out.println(Direction.EAST.isOppsite(Direction.SOUTH));//前面Direction.EAST 係object
//-------------------------

    public Direction oppsite(){
      for(Direction direction : Direction.number()){
        if(direction.EAST == this.getValue*-1){
          return direction;
        }
        return null;

    public static Direction oppsite(Direction direction){
      for (Direction d: Direction.values()){
        if(d.getValue() == this.getValue)
      }
    }
    }
    // call static method.
    System.out.println(Direction.isOppsite(Direction.EAST,Direction.WEST));

    public static boolean isOppsite(Direction d1, Direction d2){
      return d1.getValue;
    


    }
 //Vincent version
//public get


 //   private boolean isOppsite(Direction direction){
 //     return this get.Value
    }

  
    

