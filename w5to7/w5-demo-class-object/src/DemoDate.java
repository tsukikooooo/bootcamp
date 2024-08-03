import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    //17 types (8 primitives + 8 wrapper class + String)
    //similar to valueOf
    LocalDate ld= LocalDate.of(2022,12,31);
    System.out.println(ld.toString()); // only type ld only also OK

    // LocalDate ld2 = LocalDate.of(2002,12,32); // show error : java.time.DateTimeException

    //plusDays()
    System.out.println(ld.plusDays(1L)); //2023-01-01 , int -> long (upcast)
    System.out.println(ld.plusMonths(3L)); //2023-03-01
    System.out.println(ld.plusWeeks(5L));
    System.out.println(ld.plusYears(2L));

    //minus()

   System.out.println(ld.minusDays(100L));

   //get
    Month month = ld.getMonth();
    String monthString = month.toString();
    System.out.println(ld.getMonth()); //DECEMBER

    System.out.println(ld.getYear()); //2022
    System.out.println(ld.getDayOfMonth()); //31
    System.out.println(ld.getDayOfYear()); //365
    System.out.println(ld.getDayOfWeek()); //SATURDAY
    System.out.println(monthString);

  }
  
}
