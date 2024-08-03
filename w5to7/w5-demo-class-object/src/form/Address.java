package form;


public class Address {
  private String line1;
  private String line2;
  private String line3;

  //all arguments contructor

  public Address (String line1, String line2, String line3){
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
  }

  public String getLine1 (){
    return this.line1;
  }

  public String getLine2(){
    return this.line2;
  }

  public String getLine3(){
    return this.line3;
  }

  
  
  public void setLine2(String Line2){
    this.line2 = line2;
  }
  
  public String toString(){
   return "Address(" + "Line1 = " + this.line1 +" Line 2 = " + this.line2 +" Line 3 = "+ this.line3 + ")";
    }

  
  // public String AddressObject (String getFirstName,String getSecondName, String Address){
  //   return null;
  // }

  public static void main(String[] args) {
  
  //Create a form object , with address object
  Address address = new Address("Charles","chan","123");
  Form form = new Form("Charles","Chan",address);
  // a.setFirstname("Charles");
  // a.setSecondName("Chan");
  // a.setAddress(new Address("123", "htestenull", "Sai wan Ho"));

  System.out.println(form);
  System.out.println(address);  //println call from.toString()
    // Form.class >> toString()
  //Form.class & address.class > toString()
  //Form(firstName = Vincent, secondName = Lau, address)

  //MAP : Address > Address object // Address > Form Object (address)
  //Form object : address, lastName, firstName , toString()
  //**object refernce 放入method入面, 人地點LAOD 唔關你事嫁...人地點處置係佢自由, .toString
//Form oject to string will call address object toString()  去左個邊
// XX Object reference 會自動搵到個地址,  address object XX變
//method, att 跟住object身上
//NEW 幾多, control address not control object.
//can control address.  copy address to another address.


  System.out.println(form.getAddress().getLine2()); //call Adress object toString()

  Form form2 = new Form("Jenny","Wong", new Address("abc", "ijl", "def"));
  System.out.println(form2.getAddress().getLine2());

    form.getAddress().setLine2("xyz");
    System.out.println(form.getAddress().getLine2()); //xyz
    
    System.out.println(form2.getAddress().getLine2()); //xyz
    //address object 帶address.

    //why both form address and form 2 address was changed to xyz?
}
}
