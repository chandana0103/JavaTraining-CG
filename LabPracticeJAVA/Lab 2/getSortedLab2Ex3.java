jaavcimport java.util.*;
class getSortedLab2Ex3 {

    public static int[] getSorted(int a[]) {
        for(int i=0; i<a.length/2; i++) {
        int temp=a[i];
        a[i]=a[a.length-i-1];
        a[a.length-i-1]=temp;

        }
        return a;
    }

    public static void main(String[] args) 
    {
         int a[]=new int[3];
         Scanner input=new Scanner(System.in);
         System.out.println("Enter three array elements: ");
         for(int i=0;i<a.length;i++){
             a[i]=input.nextInt();
         }
         int array[]=getSorted(a);
         System.out.println("Array In Reverse Order are : ");
         for(int i=0;i<array.length;i++){
             System.out.println(array[i]);
         }
    }
}