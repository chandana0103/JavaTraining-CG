class sortStringsLab2Ex2 {

  public static String sortStrings(char a[]) {
     Arrays.sort(a);
     String upper="" ,lower="";
     int n=a.lenght;
     if(n%2==0) {
       for(int i=0;i<n/2;i++) {
         upper=upper+a[i];
       }
       for(int i=n/2; i<n ; i++) {
         lower=lower+arr[i];
       }
     }
     else
     }
       for(int i=0; i<(n/2)+1; i++) { 
          upper=upper+a[i];
       }
       for(int i=n/2+1;i<n;i++) {
          lower=lower+arr[i];
       }
     }
     String result=upper.toUpperCase()+lower.toLowerCase();
     return result;
  }
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter arrays");
     String str=sc.nextLine();
     str=sortStrings(n);
     
     for(int i=0; i<str.length(); i++)
     System.out.pritnln();
     
} 