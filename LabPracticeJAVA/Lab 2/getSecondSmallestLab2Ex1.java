class getSecondSmallestLab2Ex1{

  static int getSecondSmallest(int[] a) {
  int temp ,size;
   size=a.length;
      for(int i=0;i<size;i++) {
         for(int j=i+1;j<size;j++) {
            if(a[i]>a[j]) {
             temp=a[i];    
              a[i]=a[j];
              a[j]=temp;
             }
         }
      }
   return a[1];
}
public static void main(String args[]){
  int[] a ={2, 5 , 9, 3, 7};
  System.out.println("second smallest number is : "+getSecondSmallest(a));
}

} 