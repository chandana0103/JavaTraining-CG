package com.cg.assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

class Student{
	String name;
	Integer id;
	int score;
	String scholarShipScheme;
	
	public Student(String name, Integer id, int score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
		if(score>=95 && score<=100) {
			scholarShipScheme="A";
		}
		if(score>=90 && score<95) {
			scholarShipScheme="B";
		}
		if(score<90) {
			scholarShipScheme="no scheme";
		}
		
	}
	
	@Override
	public String toString() {
		return "Student {name=" + name + ", id=" + id + ", score=" + score + ", ScholarShipScheme=" + scholarShipScheme
				+ "}";
	}
	
}

class StudentClassImpl{
	static HashMap<Integer, Student> hm=new HashMap<Integer, Student>();
	
	public void addStudent(Student std) {
		hm.put(std.id, std);
	}
	
	public ArrayList<Student> showStudentDetails(String scholarShipScheme){
		ArrayList<Student> sList=new ArrayList<Student>();
		Set<Integer> keys=hm.keySet();
		for (Integer k : keys) {
			Student s=hm.get(k);
			if(s.scholarShipScheme.equals(scholarShipScheme)) {
				sList.add(s);
			}
		}
		
		return sList;
	}
	
	public boolean deleteStudent(int id) {
		Student s=hm.remove(id);
		if(s!=null) {
			return true;
		}else {
			return false;
		}
	}
}

public class ScholarShipScheme {

	public static void main(String[] args) {
		StudentClassImpl std=new StudentClassImpl();
		std.addStudent(new Student("Jen", 103, 93));
		std.addStudent(new Student("Jenny", 104, 85));
		std.addStudent(new Student("Jennifer", 105, 96));
		System.out.println(std.showStudentDetails("no scheme"));
		System.out.println(std.deleteStudent(106));
	}

}
