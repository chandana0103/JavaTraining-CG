import java.util.*;

class ArrayListOps {
	public static ArrayList<Integer>  makeArrayListInt(int n){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add(0);
		}
		return list;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		ArrayList<Integer> revlist = new ArrayList<Integer>();
		for(int i=list.size()-1;i>=0;i--){
             revlist.add(list.get(i));
		}
		return revlist;
	}

	public  ArrayList<Integer> changeList(ArrayList<Integer> list, int m,int n){
		Collections.replaceAll(list,m,n);
		return list;
	}   
}

public class ArrayListQues{
	public static void main(String[] args) {
		ArrayListOps obj = new ArrayListOps();
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
		System.out.println(obj.makeArrayListInt(5));
		list = obj.reverseList(list);
		System.out.println(list);
		System.out.println(obj.changeList(list,28,20));
	}
}

//import java.util.*;
//class ArrayListOps {
//   public ArrayList<Integer> makeArrayList(int n)
//	{
//		ArrayList<Integer> al= new ArrayList<Integer>();
//		for(int i=1;i<=n;i++) {
//			al.add(0);
//		}
//		return al;
//	}
//
//	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
//	{
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		int size=list.size();
//		for(int i=size-1;i>=0;i--) {
//			al.add(list.get(i));
//		}	
//		return al;
//	}
//
//	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
//	{
//		while(list.indexOf(m)!=-1) {
//			int index=list.indexOf(m);
//			list.remove(index);
//			list.add(index,n);
//		}
//		return list;
//	}
//}
//
//public class ArrayListQues{
//	public static void main(String[] args) {
//		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
//		ArrayListOps ao= new ArrayListOps();
//		System.out.println(ao.makeArrayList(4));
//		list=ao.reverseList(list);
//		System.out.println(list);
//		System.out.println(ao.changeList(list, 28, 20));
//	}
//}
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ArrayListQues {
//	static List<Integer> list2 = new ArrayList<Integer>();
//	public static void main(String[] args) {
//		int n = 4;
//		int q = 28;
//		int t = 20;
//		
//		List<Integer>list = null;
//		if(n == 4) {
//			list = putting(n);
//			System.out.println(list);
//			System.out.println(list2);
//			System.out.println(makeChanges(list2, q, t));
//		}else {
//			list = putting(n);
//			System.out.println(list);
//			list = reverseList(list);
//			System.out.println(list);
//			System.out.println(makeChanges(list, q, t));
//		}
//	}
//
//	public static List<Integer> makeChanges(List<Integer> list, int q, int t) {
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i) == q) {
//				list.set(i, t);
//			}
//		}
//		return list;
//	}
//
//	public static List<Integer> reverseList(List<Integer> list) {
////		int j = 0;
//		ArrayList<Integer> revArrayList = new ArrayList<Integer>();
//		for(int i = list.size()-1; i >= 0; i--) {
//			revArrayList.add(list.get(i));
//		}
//		return revArrayList;
//	}
//
//	public static List<Integer> putting(int n) {
//		List<Integer> list = new ArrayList<Integer>();
//		
//		if(n == 4) {
//			list.add(0);
//			list.add(0);
//			list.add(0);      
//			list.add(0);
//			Integer a[] = new Integer[] {12, 10, 28, 33, 25, 10};
//			list2 = Arrays.asList(a);
//		}else if(n != 4) {
//			Integer a[] = new Integer[] {10, 20, 30, 40, 50};
//			list = Arrays.asList(a);
//		}
//		return list;
//	}
//}