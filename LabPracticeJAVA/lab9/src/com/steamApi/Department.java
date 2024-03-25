package com.steamApi;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private int managerId;
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getMangerId() {
		return managerId;
	}
	public void setMangerId(int mangerId) {
		this.managerId = mangerId;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", managerId=" + managerId + ", departmentName="
				+ departmentName + "]";
	}

	public Department(int departmentId, int managerId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.managerId = managerId;
		this.departmentName = departmentName;
	}

	

}
