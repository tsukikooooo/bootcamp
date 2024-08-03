public class Customer {
  private int age;
  private String name;

  public Customer(int age, String name){
    this.age = age;
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  @Override //Top class, if not override will follow object to String?
  public String toString(){
    return "Customer(" + "age = "+ this.age + ",name" + this.name + ")";
  }
  
}
