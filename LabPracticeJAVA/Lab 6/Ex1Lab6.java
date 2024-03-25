import java.util.*;
class Ex1Lab6 {
  public static List<String> getValues(HashMap<Integer,String> map) {
       List<String> list=new ArrayList<>(map.values());
       Collections.sort(list);
       return list;
 }
 public static void main(String args[]) {
   HashMap<Integer,String> map=new HashMap<>();
   map.put(12,"a");
   map.put(10,"e");
   map.put(20,"c");
   map.put(25,"k");
   List<String> list=getValues(map);
   System.out.println(list);
 }
} 