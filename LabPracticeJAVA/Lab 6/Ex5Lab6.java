import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;
class Ex5Lab6 {
    static int getSecondSmallest(Integer[] a) {
     List<Integer> num=Arrays.asList(a);
     Collections.sort(num);
     int small=num.get(1);
     return small;
   }       
public static void main(String[] args) {
    Integer[] a={12,34,5,6,7};
    int res=getSecondSmallest(a);
 
   System.out.println(+res);
 }
}
