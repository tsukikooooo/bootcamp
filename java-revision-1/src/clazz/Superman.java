package clazz;

import java.util.Objects;

//
public class Superman extends Person implements Flyable, PowerUp {

  public Superman() {
    // super(); //implicitly calling Person()
  }

  public Superman(String name, int hkid) { // <<< 用新key word , Superman 已create左
    super(name, hkid); // call parent class constructor
  }

  @Override
  public void fly() {

  }

  @Override
  public void powerUp() {

  }


  public static void main(String[] args) {
    // Inheritance only for instance methods and attribute
    // Do not inherit constructor
    Superman sm = new Superman("John", 123); // name? No >>>>no name attribute in superman

    // Polymorphism
    Person p1 = new Superman("Vincent", 124);
    // During compile time, p1 cannot fly(), coz p1 is declared by person,
    // which can call the instance method from Person.class ONLY
    // fly() method is hidden when u use p1 to interact Superman Object

    p1.eat();

    // Superman s1 = p1; // cannot , 因為parent 唔可以落child, down cast
    Superman s1 = (Superman) p1;// <<<咁樣
    // what is the risk?
    // 1. p1 can be an object created by other class and this class extending Person.class as well.
    s1.fly();

    // From Programming prespective , if you want to elimiate the risk, you can use instamceOf
    Superman s2;
    if (p1 instanceof Superman) {
      s2 = (Superman) p1;
    }

    // equals()
    System.out.println(sm); // Superman(person=Person(name=John)
    Superman sm2 = new Superman("John", 123);
    System.out.println(sm.equals(sm2)); // true

    PowerUp superman = new Superman("Sally", 125); // what is the point to use interface as object reference?
    superman.powerUp();

    Superman sm3 = (Superman) superman; // OK
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) // (同一飯)
      return true;
    if (!(obj instanceof Superman))
      return false;
    Superman sm = (Superman) obj;
    return Objects.equals(super.getName(), sm.getName())
        && Objects.equals(super.getId(), sm.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.getName(), super.getId()); // hashmap XX 放primivate
  }

  @Override
  public String toString() {
    return "Superman(" //
        + "person=" + super.toString() //
        + ")";
  }
}

