package form;
public class Form {
  private String firstName;
  private String secondName;
  private Address address; //define new class define in exist class

  //constructor get set
  public Form(String firstName, String secondName , Address address){
    this.firstName = firstName;
    this.secondName = secondName;
    this.address = address;
  }

  

  public String getFirstName(){
    return this.firstName;
  }

  public String getSecondName(){
    return this.secondName;
  }

  public Address getAddress(){  //Address as class, not only 17 types.
    return this.address;
  }

  public void setFirstname (String firstName){
    this.firstName = firstName;
  }

  public void setSecondName(String secondName){
    this.secondName = secondName;
  }

  public void setAddress (Address address){
    this.address = address;
  }

  public String toString(){
    return "Name: " + firstName + " " +secondName + 
    ", Address: " + address; // call this.address.toString(), 
    //** STring 開加號, 咩都會變string

  }


}
