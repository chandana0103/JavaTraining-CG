import java.util.*;
class Traffic {
    String Light;
    Traffic(String Light) {
    this.Light=Light;
   }
public void signal() {
           if(Light.equals("Red")) {
               System.out.println("STOP");
           }
           else if(Light.equals("yellow")){
              System.out.println("READY");
           }
           else {
               System.out.println("GO");
           }
   }
class TrafficLightEx2 {
     public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     String Light=sc.next();
     Traffic t=new Traffic(Light);
     t.signal();
   }  
 }
}