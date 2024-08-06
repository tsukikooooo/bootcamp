public class StringBox {
  private String value;
  private Integer integer;

  public StringBox(String value){
    this.value = value;
  }
  public void setInterger(Integer value){
    this.integer = value;
  }

  public String getValue(){
    return this.value;
  }

  public void setValue(String value){
    this.value = value;
  }

  public static void main(String[] args) {
    StringBox box = new StringBox("abc");
    System.out.println(box.getValue()); //abc

    StringBox box2 = new StringBox("bba");
    System.out.println(box2);
  }
}
