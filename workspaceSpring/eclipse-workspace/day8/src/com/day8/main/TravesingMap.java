package com.day8.main;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.day8.bean.Account;

public class TravesingMap {

	public static void main(String[] args) {
		
		Account account1 = new Account(1002,"acone",580000);
		Account account2 = new Account(1005,"actwo",90000);
		Account account3 = new Account(1001,"acthree",80000);
		Account account4 = new Account(1003,"acfour",180000);
		Account account5 = new Account(1008,"acfive",60000);
		Account account6 = new Account(1008,"acfive",60000);
		
		Map<Integer,Account> accounts = new HashMap<>();
		
		accounts.put(1001,account3);
		accounts.put(1008,account5);
		accounts.put(1005,account2);
		accounts.put(1002,account1);
		accounts.put(1003,account4);
		
		//convert map into set view
		
		Set<Map.Entry<Integer, Account>> set = accounts.entrySet();
		
		Iterator<Map.Entry<Integer,Account>> i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry<Integer,Account> entry = i.next();
			Integer k = entry.getKey();
			Account v = entry.getValue();
			System.out.println(k);
			System.out.println(v.getAccno()+" "+v.getName()+" "+v.getBalance());
			System.out.println("*****");
		}

	}

}
