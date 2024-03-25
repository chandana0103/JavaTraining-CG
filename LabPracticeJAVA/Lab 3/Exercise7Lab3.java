import java.time.*;
import java.util.*;
class Exercise7Lab3 {

  public static void main(String[] args) {
     LocalDate date1 =LocalDate.of(2015,05,28);
      LocalDate date2 = LocalDate.of(2019,01,05);
      Period P=Period.between(date1,date2);

      System.out.println("difference is \n"+P.getYears()+" years");
      System.out.println(+P.getMonths()+" Months ");
      System.out.println(+P.getDays()+" days");  
     
  }
}
 