class modifyArrayLab2Ex4{

  public static int modifyArray(int a[]) {
        int n;
        
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++) {
            if (a[i]!= a[i+1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n-1];
        for (int i=0; i<j; i++) {
            a[i] = temp[i];
        }
        return j;
    }
  public static void main(String[] args) {
        int a[] = { 5,4,4,3,2,2,1};
        int length = a.length;
        length = modifyArray(a, length);
        for (int i=0; i<length; i++) 
            System.out.print(a[i] +"  ");
    }
 }