public class Book {
  private String name;
  private int barcode;
  private boolean newbook;

  public void setName(String name){ // void return type
    this.name = name;
  }

  public void setBarcode(int barcode){
    this.barcode = barcode;
  }
  public String getName(){
    return this.name;
  }
  public int getBarcode(){
    return this.barcode;
  
  }
  public void setNewbook(boolean newbook){
    this.newbook = newbook;
  }

  public boolean newbook(){
    return this.newbook;
  }

  public static void main(String[] args) {
    Book b1 = new Book();
    b1.setName("Harry");
    System.out.println(b1.getName());
  }
  
  
}
