//import java.util.regex.*;    
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

class Header{
	String from;
	String to;
	public Header() {
		super();
	}
	public Header(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
}

class Email {
	//Header header;
	Header header=new Header();
	String body;
	String greetings;
	public Email() {
		super();
	}
	public Email(String body, String greetings) {
		
		this.body = body;
		this.greetings = greetings;
	}
	
}

class EmailOpe{
	public int emailVerify(Email e) {
//		String from=e.header.from;
//		String to=e.header.to;
//		//int msg=0;
//		if(from.matches( "^[A-Za-z0-9+_.-]+@(.+)$") || to.matches("^[A-Za-z+_.-]+@(.+)$")) {
//			if(to.matches( "^[A-Za-z+_.-]+@(.+)$") && from.matches( "^[A-Za-z+_.-]+@(.+)$")) {
//				return 2;
//			}else {
//				return 1;
//			}
//		}else {
//			return 0;
//		}
		Pattern p=Pattern.compile("[A-Za-z_][A-Za-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m=p.matcher(e.header.from);
		Matcher m1=p.matcher(e.header.to);
		int count=0;
		if(m.find()&& m.group().contentEquals(e.header.from)){
			count++;
		}
		if(m1.find()&& m1.group().contentEquals(e.header.to)) {
			count++;
		}
		return count;
	}
	
	public String bodyEncryption(Email e) {
//		 String s = "";
//		 String msg=e.body;
//		 //String msg=m.toLowerCase();
//		 int shift=3;
//		    int len = msg.length();
//		    for(int x = 0; x < len; x++){
//		        char c = (char)(msg.charAt(x) + shift);
//		        if (c > 'z')
//		            s += (char)(msg.charAt(x) - (26-shift));
//		        else
//		            s += (char)(msg.charAt(x) + shift);
//		    }
//		    return s;
		char[] ch=e.body.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
			}else {
				if(ch[i]=='x'||ch[i]=='y'||ch[i]=='z'||ch[i]=='X'||ch[i]=='Y'||
						ch[i]=='Z') {
					ch[i]=(char)(ch[i]-23);
				}else {
				ch[i]=(char)(ch[i]+3);
				}
			}
		}
		String s=new String(ch);
		return s;
	}
	
	public String greetingMessage(Email e) {
//		String greeting=e.greetings;
//		String mail=e.header.from;
//		char[] ch = new char[mail.length()];
//		char[] c = new char[mail.length()];
//        for (int i = 0; i < mail.length(); i++) {
//            ch[i] = mail.charAt(i);
//        }
//        for(int i=0;i<mail.length();i++) {
//        	if(ch[i]=='@') {
//        		break;
//        	}
//        	c[i]=ch[i];
//        }
//        String name=new String(c);
//        
//		return greeting+" "+name;
		String s[]=e.header.from.split("@");
		return e.greetings+" "+s[0];
	}
}

public class EmailOperation {

	public static void main(String[] args) {
		Email email=new Email();
//		Scanner sc=new Scanner(System.in);
		email.header.from="kush@cap.com";
		email.header.to="kabra@cap.com";
		email.body="Hi There Hows you";
		email.greetings="Regards";
//		email.from=sc.next();
//		email.to=sc.next();
//		sc.nextLine();
//		email.body=sc.nextLine();
//		email.greetings=sc.next();
		EmailOpe eop=new EmailOpe();
		System.out.println(eop.emailVerify(email));
		System.out.println(eop.bodyEncryption(email));
		System.out.println(eop.greetingMessage(email));
	}

}
