class Exercise3Lab3 {
  static boolean isVowel(char ch) {
    if(ch!='a' && ch!='e' && ch!='i' && ch!= 'o' && ch!= 'u') {
      return false;
    }
      return true;
  }
  static String alterString(char[] str) {
    for(int i=0; i<str.length; i++) {
       if(!isVowel(s[i])) {
          if(s[i]=='z'){
             s[i]='b';
          }
          else {
            str[i] = (char)(str[i]+1);
          if(isVowel(str[i])) {
            str[i] = (char)(str[i]+1);
          }
          }
       }
     }
      return String.valueOf(s);
  }
  public static void main(String[] args) {
      String s = "java";
      System.out.println(alterString(s.toCharArray()));
  }
}
 