import sorting.Customer;

public class XYZ<T, U> { //2 different additubute <E> : means orico write
  private T t;
  private U u;

  public XYZ (){
  }

  public XYZ( T t , U u){
    this.t = t;
    this.u = u;
  }

  public void setU(U u){
    this.u = u;
  }

  public static void main(String[] args) {
    XYZ<String, Customer> customers = new XYZ<>();
    //customers.setU("abc");   >>>>>>>// error, coz T -> String, U -> Customer
    customers.setU(new Customer());

    //T can be same as U
    XYZ<String, String> strings= new XYZ<>();

    //whats need generics?....> want users to decide? user to complete the class
  }
}
