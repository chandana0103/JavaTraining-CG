import java.util.*;
class Ex4Lab6 {
       public HashMap<String,String> getStudent(HashMap<String,Integer> student) {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = student.keySet();
              for(String s:set) {
                     Integer marks = student.get(s);
                     if(marks>=90) {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80) {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70) {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] arr){
              HashMap<String,Integer> student = new HashMap<>();
              Ex4Lab6 stu = new Ex4Lab6();
              
              student.put("101",95);
              student.put("102",86);
              student.put("103",94);
              student.put("104",90);
              student.put("105",43);
              System.out.println(stu.getStudent(student));
       }
}