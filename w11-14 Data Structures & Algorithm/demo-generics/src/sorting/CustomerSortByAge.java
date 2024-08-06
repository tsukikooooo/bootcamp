package sorting;


import java.beans.Customizer;
import java.util.Comparator;

public class CustomerSortByAge implements Comparator<Customer> {
//Age 

public static CustomerSortByAge of(){
  return new CustomerSortByAge();
}

  @Override
  public int compare(Customer c1, Customer c2){
    return c1.getAge() > c2.getAge() ? -1 : 1;
  }
}
