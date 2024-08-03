public class DemoStringBuilder {

  public static void main(String[] args) {
    String x ="hello"; //slow performance.  ie: concat, replace 
    //String for 改動...搬運等

    //Fast performance. 10times fast different
    StringBuilder sb = new StringBuilder("hello");   // StringBuilder is class. "new StringBulder() > constructor" 直接用
    Cat cat = new Cat();
    cat.setAge(13); //void method

    x += "world";
    sb.append("world");   //append = "+""

    System.out.println(sb.toString()); //helloworld
    sb.replace(1, 2, "xx");  //<< 唔洗放返入sb到, 指 sb = sb.replace 依樣  // return self object.
    System.out.println(sb.toString());

    sb.setCharAt(4, 'A');
    System.out.println(sb.toString());

    sb.reverse();
    System.out.println(sb.toString());

    //array, primeivate faster than method on string

    sb.insert(4, '*');
    System.out.println(sb.toString()); //dlro*woAlxxh

    /// 好用method deleteCharAt():remove, setCharAt():replace , Insert(): add 

    String s = sb.substring(1, 3);
    System.out.println(s);  //修改object
    System.out.println(sb.toString()); //無改
  }
  
}
