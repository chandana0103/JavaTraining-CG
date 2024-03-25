import java.util.*;

class TransactionParty{
	String seller;
	String buyer;
	
	public TransactionParty() {
		super();
	}

	public TransactionParty(String seller, String buyer) {
		super();
		this.seller = seller;
		this.buyer = buyer;
	}
}

class Receipt {
	TransactionParty tp= new TransactionParty();
	String productQR;
	
	public Receipt() {
		super();
	}

	public Receipt( String productQR) {
		
		this.productQR = productQR;
	}
}

class GenerateReceipt{
	public int verifyParty(Receipt r) {
		String sell=r.tp.seller;
		String buy=r.tp.buyer;
		//int msg=0;
		if(sell.matches( "^[\\p{L} .'-]+$") || buy.matches("^[\\p{L} .'-]+$")) {
			if(buy.matches("^[\\p{L} .'-]+$") && sell.matches( "^[\\p{L} .'-]+$")) {
				return 2;
			}else {
				return 1;
			}
		}else {
			return 0;
		}
	}
	
	public String calGST(Receipt r) {
		String qr=r.productQR;
		String tokens[] = qr.split("\\W+");
		int length=tokens.length;
		int GST_Rate=12;
		int GST=0;
		int values[]=new int[6];
		for(int i=0;i<length;i++) {
			values[i]=Integer.parseInt(tokens[i]);
		}
		GST=((values[0]*values[1])+(values[2]*values[3])+(values[4]*values[5]))*GST_Rate;
		Integer gstval=new Integer(GST);
		String gst=gstval.toString();
		return gst;
	}
}
public class ValidatingUsers {

	public static void main(String[] args) {
		Receipt r=new Receipt();
//		Scanner sc=new Scanner(System.in);
		r.tp.seller="Kush";
		r.tp.buyer="Kabra";
		r.productQR="250,10@100,3@50,7";
//		r.seller=sc.next();
//		r.buyer=sc.next();
//		r.productQR=sc.next();
		GenerateReceipt gr=new GenerateReceipt();
		System.out.println(gr.verifyParty(r));
		System.out.println(gr.calGST(r));
		//System.out.println(gr.verifyParty(r));
		
	}

}
