public class DemoCharSequence {///5**
  public static void main(String[] args) {
    String s = "abc";
    System.out.println(s.length()); // 3
    System.out.println(s.replace("c", "a")); // "aba" 
    String s3 = s; // type-safe

    CharSequence cs = "abc";                    //CS obejector reference
    //合約係grautte 左邊窄過右手邊, java rules (coding)
    //paraents class 少過? 2:03:30 0707
    System.out.println(cs.length()); // 3 (Polymorphism) 
    // compile-time determine the scope of object can be accessed by "cs"

    System.out.println(cs.charAt(1)); // b
    // cs.replace() // error, replace() is not included in CharSequence Interface
    // Some of methods in String object is hidden by "cs".
    //無replace 所以call 唔到, 因為replay() method 唔係AGI合約上面

    //只能指合約部分野
  
    //如果想放返出黎, 但因為佢唔係AI黎****
    // String s2 = cs; // compiler concerns the type of "cs" ONLY
    // compile time cannot realize the actual object reference by "cs"


    // both Parent Class and Interface relationship can apply "downcasting"
    String s2 = (String) cs;//<< 咁樣寫會有DOWN CAST
    // during compile-time, we don't guarantee if the casting will be successful.
    // 好唔安全, polymopyhtsome, inherian,  3樣野

    // As java developer, you may use "instanceOf" to ensure the type-safety
    if (cs instanceof String) {
      s2 = (String) cs;
    }

    System.out.println(s2.replace("b", "a")); // "aac" 無消失過, 將形態換走

    ///-----String
    StringBuilder sb = new StringBuilder("hello");  //call到String builder method
    System.out.println(sb.length()); // 5
    System.out.println(sb.charAt(1)); // e
    System.out.println(sb.reverse()); // olleh

    CharSequence cs3 = new StringBuilder("hello");
    System.out.println(cs3.length()); // 5
    System.out.println(cs3.charAt(1)); // e
    //System.out.println(cs3.reverse()); //不能reverse, 原因 指針範圍睇唔到



    StringBuilder sb2 = (StringBuilder) cs; //換去stringbuilder (), type-safety 問題) ; run-time error, cs refer to String object, CS 
    // while object reference b2 is StringBuilder
    //有可能係佢兄弟唔係parents 

  }
}