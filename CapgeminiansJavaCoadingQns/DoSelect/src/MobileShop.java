import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile{
    // Write your code here..
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company, String model){
		Set<String>brand = mobiles.keySet();
		ArrayList<String> a1 = new ArrayList<>();
			if(brand.contains(company)){
				a1 = mobiles.get(company);
				a1.add(model);
				mobiles.put(company, a1);
			}else{
				a1.add(model);
				mobiles.put(company, a1);
			}
		return "model successfully added";
	}

	public ArrayList<String> getModels(String company){
		Set<String>brand = mobiles.keySet();
		if(brand.contains(company)){
			ArrayList<String>a1 = new ArrayList<>();
			a1 = mobiles.get(company);
			if(a1.size() == 0){
				return null;
			}
			return a1;
		}
		return null;
	}

	public String buyMobile(String company, String model){
		Set<String>brand = mobiles.keySet();
		if(brand.contains(company)){
			ArrayList<String> a1 = new ArrayList<>();
			a1 = mobiles.get(company);
			if(a1.contains(model)){
				a1.remove(a1.indexOf(model));
				mobiles.put(company, a1);
				return "mobile sold successfully";
			}else{
				return "item not available";
			}
		}else{
			return "item not available";
		}
	}
}

public class MobileShop {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Mobile obj = new Mobile();
		System.out.println(obj.addMobile("Oppo", "K3"));
		System.out.println(obj.getModels("Oppo"));
		System.out.println(obj.buyMobile("Oppo", "K3"));
	}
}

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//class Mobile{
//    // Write your code here..
//	HashMap<String,ArrayList<String>> mobiles = new HashMap<String,ArrayList<String>>();
//	ArrayList<String> model = new ArrayList<String>();
//
//	Set<String> companies = mobiles.keySet();
//	
//	public String addMobile(String company, String c_model) {
//		model.add(c_model);
//		mobiles.put(company, model);
//		return "model successfully added";
//	}
//	//public void getAll() {
//	//	for(String cmpny : companies) {
//	//		System.out.println(cmpny+" "+hashMap.get(cmpny));
//	//	}
////	}
//	public String buyMobile(String company, String model) {
//		if(mobiles.containsKey(company)) {
//			if(model.equals(mobiles.get(company))) {
//				mobiles.remove(company);
//				return "mobile sold successfully";
//			}else {
//				return "Model not found";
//			}
//		}else {
//			return "Company not found";
//		}
//	}
//	public ArrayList<String> getModels(String company) {
//		ArrayList<String> model = new ArrayList<String>();
//		if(mobiles.containsKey(company)) {
//			model=mobiles.get(company);
//			return model;
//		}else {
//			return null;
//		}
//	}
//}
//
//public class MobileShop {
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Mobile obj = new Mobile();
//		obj.addMobile("Oppo", "K3");
//		System.out.println(obj.getModels("Oppo"));
//		System.out.println(obj.buyMobile("Oppo", "K3"));
//	}
//}

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Set;
//
//public class MobileShop {
//
//	public static void main(String[] args) {
//		Mobile1 obj = new Mobile1();
//		obj.addMobile("Oppo", "K3");
//		System.out.println(obj.getModels("Oppo"));
//		System.out.println(obj.buyMobile("Oppo", "K3"));
//	}
//}
//
//class Mobile1{
//	HashMap<String, String> hashMap = new HashMap<>();
//	Set<String> companies = hashMap.keySet();
//	
//	public void addMobile(String company, String model) {
//		hashMap.put(company, model);
//		System.out.println("model successfully added");
//	}
//	public void getAll() {
//		for(String cmpny : companies) {
//			System.out.println(cmpny+" "+hashMap.get(cmpny));
//		}
//	}
//	public String buyMobile(String company, String model) {
//		if(hashMap.containsKey(company)) {
//			if(model == hashMap.get(company)) {
//				hashMap.remove(company);
//				return "mobile sold successfully";
//			}else {
//				return "Model not found";
//			}
//		}else {
//			return "Company not found";
//		}
//	}
//	public ArrayList<String> getModels(String company) {
//		ArrayList<String> model = new ArrayList<String>();
//		if(hashMap.containsKey(company)) {
//			model.add(hashMap.get(company));
//			return model;
//		}else {
//			System.out.println("Company not found");
//			return model;
//		}
//	}
//}