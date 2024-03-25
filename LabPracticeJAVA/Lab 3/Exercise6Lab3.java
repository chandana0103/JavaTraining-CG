class Exercise6Lab3 {
   static boolean alphabeticalOrder(String str){
      int strlen = str.length();
      for (int i=1; i<strlen; i++){
         if (str.charAt(i)<str.charAt(i-1)){
          return false;
         }
      }
      return true;
   }
   static public void main(String[] args) {
      String str = "abcmnqxaz";
      if ( alphabeticalOrder(str)){
         System.out.println("The letters are in alphabetical order.");
      } else{
         System.out.println("The letters are not in alphabetical order.");
      }
   }
}