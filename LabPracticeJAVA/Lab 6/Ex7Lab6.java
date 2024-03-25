import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.reverseOrder;
import java.util.Scanner;
class Ex7Lab6 {
    static int getSorted(Integer[] a) {
    List<Integer> num=Arrays.asList();
 //  int rev= Collections.reverseOrder(1);
  int rev=  Collections.sort(num,Collections.reverseOrder(1) );
    return rev;
   }       
 public static void main(String[] args) {
    Integer[] a={12,34,5,6,7};
    int res=getSorted(a);
 
   System.out.println("reverse"+res);
 }
}
