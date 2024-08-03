import java.time.LocalDate;
import java.util.Objects;

public class Book { //extends Object 

  private String author;
  private LocalDate publishDate;

  public Book (String author, LocalDate publishDate){
    this.author = author;
    this.publishDate = publishDate;
  }
  
  //if you do not @Override , the hashCode() method by default representing the Object address
  @Override
  public int hashCode(){
    return Objects.hash(this.author, this.publishDate); //死記

  

    //return Objects.hash(this.author); // 每個作者得一本書, 只睇書名就可以分, //Hash code 用黎分返開唔同object..
  }

  public String getAuthor(){
    return this.author;
  }
  public LocalDate getPublishDate(){
    return this.publishDate;
  }
  //5**
  //if you override it , the purpose is to make it become ture even if they are 2 differennt object in heap memory
  @Override
  public boolean equals(Object obj) {  //coz Object 本身就係 Object obj , 睇equals() 
    if (this == obj){ //b1 == obj 
      return true; 
    }
    if (!(obj instanceof Book)){ //Object of book class 問下keyword obj ref. 係咪由依個產生 //instanOf is checking if the obejct pointing by reference is an Object produced by Book.Class
      return false;
    }
    Book book = (Book) obj; //已經知一定係BOOK OBJECT 而且唔同地址
    return Objects.equals(this.author,book.getAuthor()) && Objects.equals(this.getPublishDate(), book.getPublishDate());
  //   if (book.getAuthor().equals(this.author) && book.getPublishDate().compareTo(this.publishDate) == 0){
  //     return true;
  //   }
  //   return false;
  // }
  }
  public static void main(String[] args) {
    Book b1 = new Book("John", LocalDate.of(2000, 12, 12));
    Book b2 = new Book("John", LocalDate.of(2000, 12, 12));

    System.out.println(b1.hashCode()); //75848450 coz you override. @Override
    System.out.println(b2.hashCode()); //75848450

    Book b3 = new Book("May",LocalDate.of(2001, 12, 31)); 
    System.out.println(b3.hashCode()); //6490683

    System.out.println(b1 == b2); //false (check object reference.) 
    System.out.println(System.identityHashCode(b1)); //1175962212 b1 & b2 different object
    System.out.println(System.identityHashCode(b2));//918221580

    //Object.class has equals() method.
    //if you do note override, equals() by default checking object address
  //  System.out.println(b1.equals(b2)); //false not like String
     System.out.println(b1.equals(b2)); //After override , true 
    //depends unique.. barcode //which system...books borrow or book purchase system.

    // if both objects are located in different address, equals() must return false (No override)
    // System.out.println(b1.equals(new Cat()));//false


    //Notes test
    String str = "abc";
    System.err.println(str.hashCode()); //96354 
    System.out.println(97 * (int)Math.pow(31,2)+98*31 + 99); //hashcode method.

    //Implication
    //There will be another String value with same hash code.
    //2 different String potentially can be with same hash code.
    String str2 = "abcdefghijklxy";
    System.out.println(str2.hashCode());

    String str3 = "bbcdefghijklxy";  //overflow
    System.out.println(str2.hashCode());

    Integer i3 = 365;
    System.out.println(i3.hashCode()); //365 , direct return hash code value

    System.out.println(new String("abc"). equals(new String("abc")));//true 兩個
    //check 

    //Compile time determine if s1 is able to call equals()
    //Run time determine implematation (MEthod contect) of equals() method
    Object s1 = new String("abcd");//object False

    Object s2 = new String ("abcd"); 
    System.out.println(s1.equals(s2));//T  > Run time (Object 身上拎GE野)
    // Runtime: String.equals()

    Object s3 = new Object();
    Object s4 = new Object();
    System.err.println(s3.equals(s4));//false (runtime :object equalas())

    //**paint
    

    //object and equals have 2 closee
  }
  

}
