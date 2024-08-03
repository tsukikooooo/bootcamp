public class StringHelper {

  private String str;

  public StringHelper (String str){
    this.str = str;

  }
  public int length(){
    return str.length();
  }

  //instance method
  public void setCharAt(int index, char ch){
    String s = "";
    for(int i = 0; i < this.str.length();i++){
      if (i == index)
       s+= ch;
       else
      s+= this.str.charAt(i);
    }
    this.str = s;   //new object  "hello" >> "holea"
    return this; //REVIS THE string object inside StringHelper Object
}
  public String toString(){
    return this.str;

  }
  public void setStringHelper(String str){
    this.str = str;
  }
   
  public String getStringHelper(){
    return this.str;
  }
  
  public StringHelper append(String s){  //change own object and arrow move the object
    this.str += s;
    return this; //<<this: return myself out 將自己return出去
  }

  public String subString (int starIdx, int endIdx){  //唔修改自己
    String s = "";
    for (int i = starIdx; i < endIdx; i++){
       s += this.str.charAt(i);
    }
    //this.str =s 
    return s; //唔修改自己 return s 出去

  }
 public static void main(String[] args) {
  StringHelper sh = new StringHelper("hello");
  sh.setCharAt(3, 'a');

  sh.append("world");
  System.out.println(sh.toString()); //halo world


  //chain method call
  sh.append("!!!").append("I'm Moon.").setCharAt(10, '#').append("!!!!");    //coz appending myself.
  System.out.println(sh.toString()); //helloworld#!!I'm Moon.

  ///why chatAt 不可以再call 因為佢係void

  "hello".charAt(1); //nothing (no sysout,coz)


  System.err.println(sh.subString(2, 5));  //lao  //object入面有object. check grap ... 

  
}
}
