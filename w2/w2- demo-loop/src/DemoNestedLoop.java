public class DemoNestedLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 4;i++) {  //0,1,2,3
      for (int j = 0; j <2 ; j++){ // 0 ,1 
        System.out.println("hello " + " i=" + i + " j=" + j);
   //     hello  i=1 j=1
  //      hello  i=2 j=0
  //      hello  i=2 j=1
  //      hello  i=3 j=0
  //      hello  i=3 j=1
      }
    }
    // output: 
    //hello i =1, j= 2
    //hello i =3, j = 4
    for (int i = 1; i < 4; i++){
      for (int j = 0; j < 2; j++){
        if (i % 2== 1 && j%2 == 0) {
        
      
        System.out.println("hello1 " + " i=" + i + " j=" + j);

      }
    }
  }
  //Approach 2:
  for (int i = 1; i < 4; i++){

      if (i % 2 == 0) {
        continue;
      }
     for (int j = 0; j < 2; j++){
      if (j % 2 == 1){
        continue;
      }
    }
      
    }
  
  // 1 - 20 
  // 1 3 5 7  9 12 

  //searching 
  String s = "Vincent Book Game Laptop";
  // Find the index of 1st character 'a'
  // 14
  int idx = 0;
  for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i)=='a'){
      idx = i;
      break;  // break >> means break loop!!!!
    }
  }
    System.out.println("The index of 1st character is" + idx);
   ///need to print the final ans only

   // *****
   for(int i = 0; i<5; i++){
    System.out.println("*");
   }
   System.out.println();

   //*****
   //*****
   //*****
   //*****
   //*****
   //tip
   //1. new line
   //2. 
   for (int row = 0; row <5;row++){
    for (int coloum = 1; coloum < 5;coloum++){
      System.out.println("*");
    }
    System.out.println();
  }
//倒三角
  for (int i = 0; i < 5; i++){
    for (int j = 5; j < 5-i; j++){
      System.out.println("*");
    }
  }System.out.println();
  
  // * 
  // **
  // ***
  // ****
  // ***
  // **
  // *

  // Ex. 
  for (int i = 0; i < 5)
}
}

