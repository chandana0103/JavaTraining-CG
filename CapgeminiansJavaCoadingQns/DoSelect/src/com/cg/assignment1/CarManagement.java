package com.cg.assignment1;

import java.util.ArrayList;

class Car{
	private String model;
	private float price;
	private String company;
	public Car(String model, float price, String company) {
		super();
		this.model = model;
		this.price = price;
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}

class ShowRoom{
	ArrayList<Car> carList=new ArrayList<Car>();
	public ArrayList<String> uniqueCompany(){
		ArrayList<String> sList=new ArrayList<String>();
		for (Car car : carList) {
			String companyName=car.getCompany();
			if(!sList.contains(companyName)) {
				sList.add(companyName);
			}
		}
		
		return sList;
	}
	
	public float averageByCompany(String company) {
		float total=0.0f;
		float avg;
		int count=0;
		for (Car car : carList) {
			if(car.getCompany().equals(company)) {
				total+=car.getPrice();
				count++;
			}
		}
		avg=total/count;
		
		return avg;
		
	}
}

public class CarManagement {
	
	public static void main(String[] args) {
		ShowRoom obj=new ShowRoom();
		obj.carList.add(new Car("XUV500", 100000,"Mahindra"));
		obj.carList.add(new Car("Swift Dezire", 200000,"Maruti"));
		obj.carList.add(new Car("Swift", 500000,"Maruti"));
		System.out.println(obj.uniqueCompany());
		System.out.println(obj.averageByCompany("Maruti"));
	}

}
