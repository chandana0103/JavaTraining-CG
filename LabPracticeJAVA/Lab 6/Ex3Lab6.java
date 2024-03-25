import java.util.*;
public class Ex3Lab6 {
    public static HashMap getSquares(int[] a) {
     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 
        for (int n: a) {
	   map.put( n, n*n);
	 }
	    return map;
      }
		 
     public static void main(String[] args) {
	   int a[] = new int[]{1,2,3,4,5};
	   HashMap<Integer, Integer> map =getSquares(a);
	
	   Iterator<Integer> i = map.keySet().iterator();
	    while(i.hasNext()){
	    Integer key = i.next();
	      System.out.println(key + " = " + map.get(key));
	    }
   }
 }
