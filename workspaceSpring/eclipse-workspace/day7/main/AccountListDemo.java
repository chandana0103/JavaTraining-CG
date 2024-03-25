package com.day7.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.day7.bean.Account;

public class AccountListDemo {

	public static void main(String[] args) {
		
		Account account1 = new Account(1111,"acone",580000);
		Account account2 = new Account(2222,"actwo",90000);
		Account account3 = new Account(3333,"acthree",80000);
		Account account4 = new Account(4444,"acfour",180000);
		Account account5 = new Account(5555,"acfive",60000);
		
		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);
		
		Iterator<Account> i = accounts.iterator();
		while(i.hasNext()) {
			Account account = i.next();
			System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance());
		}
		
		System.out.println("******************Searching Account************************");
		
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number");
		int accno = sc.nextInt();
		
		sc.close();
		
		Iterator<Account> i2 = accounts.iterator();
		
		boolean flag  = false;
		
		while(i2.hasNext()) {
			Account account = i2.next();
			if(accno == account.getAccno()) {
				System.out.println(account.getName()+ "  "+account.getBalance());
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("A/c not existing with accno: "+accno);
		}
		
		System.out.println("*******************Total Balance of All accounts**********************");
		

	}

}
