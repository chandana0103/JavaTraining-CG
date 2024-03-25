package com.cg.eis.comparator;

import java.util.Comparator;
import java.util.Map.Entry;

import com.cg.eis.bean.Employee;

public class InsuranceSchemeComparator implements Comparator<Entry<Integer, Employee>> {

	@Override
	public int compare(Entry<Integer, Employee> e1, Entry<Integer, Employee> e2) {
		String s1=e1.getValue().getInsuranceScheme();
		String s2=e2.getValue().getInsuranceScheme();
		return s1.compareTo(s2);
	}

}
