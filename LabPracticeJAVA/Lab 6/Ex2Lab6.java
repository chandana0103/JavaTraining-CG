import java.util.*;
public class Ex2Lab6 {
	public static Map<Character, Integer> countChars(char[] ch) {
	   Map<Character,Integer> ans=new HashMap<>();
	    for(int i=0;i<ch.length;i++) {
		int count=1;
	        for(int j=i+1;j<ch.length;j++) {
		   if(ch[i]==ch[j] && ch[i]!=' ') {
		     count++;
		     ch[j]='0';
		   }
	        }
		   if(ch[i]!='0' && ch[i]!=' ')
	           ans.put(ch[i],count);
	     }
		 return ans; 
	}
	public static void main(String[] args) {
	    String str=" a dwq sd f sfefs grf d";
	    char[] ch=str.toCharArray();
		 
	    Map<Character,Integer> ans=countChars(ch);
	     System.out.println(ans);
	}
}
