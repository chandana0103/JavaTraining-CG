package com.cg.assignment3;

import java.util.ArrayList;
import java.util.List;

public class StringMethods {
//sp1 is the complete data and arr is the missing data
	public ArrayList<Character> getMissing(ArrayList<Character> sp1,ArrayList<Character> arr){
		for(int i=1;i<sp1.size();i++) {
			if(sp1.get(i)!=arr.get(i)) {
				arr.add(i, sp1.get(i));
				break;
			}
		}
		
		return arr;
	}
	
	public int checkSubString(int subString,String s1,String s2) {
		
		
		return 0;
	}
	
	public List<String> checkMatch(List<String> match,List<String> str){
		
		
		return null;
	}
	
	public static void main(String[] args) {
		StringMethods strM=new StringMethods();
		
		ArrayList<Character> arr=new ArrayList<Character>();
		arr.add('p');
		arr.add('q');
		arr.add('s');
		
		ArrayList<Character> sp1=new ArrayList<Character>();
		sp1.add('p');
		sp1.add('q');
		sp1.add('r');
		sp1.add('s');

		
		System.out.println(strM.getMissing(sp1, arr));
		
	}

}
