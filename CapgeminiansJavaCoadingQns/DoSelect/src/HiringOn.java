import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class HiringOn {
	public static void main(String[] args) throws Exception{
		List<Candidate> list = new ArrayList<Candidate>();
		list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
		
		Implementation implement = new Implementation();
		System.out.println(implement.getCount(list));
		System.out.println(implement.getAverageAge(list));
		System.out.println(implement.countCandidatesDepartmentWise(list));
//		Optional<Candidate> op = implement.getYoungestCandidateDetails(list);
//		System.out.println(op);
		System.out.println(implement.getYoungestCandidateDetails(list));
	}
}

class Candidate{
	private String name;
	private int id;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	public Candidate(int id, String string, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.name = string;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ",name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
}

class Implementation{
	//Count number of males and females.
	Map<String, Long> getCount(List<Candidate> list){
		long countMale = 0;
		long countFemale = 0;
		Map<String, Long> map = new HashMap<String, Long>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getGender() == "Male") {
				countMale++;
			}else {
				countFemale++;
			}
		}
		
		if(countMale > 0 && countFemale > 0) {
			map.put("Male", countMale);
			map.put("Female", countFemale);
		}else if(countMale > 0) {
			map.put("Male", countMale);
		}else if(countFemale > 0) {
			map.put("Female", countMale);
		}
		return map;
	}
	
	//Get average age 
	Map<String, Double> getAverageAge(List<Candidate> list){
		int countMale = 0;
		int countFemale = 0;
		double totalAgeMale = 0.0;
		double totalAgeFemale = 0.0;
		double averageAgeOfMale = 0.0;
		double averageAgeOfFemale = 0.0;
		
		Map<String, Double> map = new HashMap<String, Double>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getGender() == "Male") {
				countMale++;
				totalAgeMale += list.get(i).getAge();
				averageAgeOfMale = totalAgeMale / countMale;
				map.put("Male", averageAgeOfMale);
			}else {
				countFemale++;
				totalAgeFemale += list.get(i).getAge();
				averageAgeOfFemale = totalAgeFemale / countFemale;
				map.put("Female", averageAgeOfFemale);
			}
		}		
		return map;
	}
	
	//Count candidates department wise
	Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list){
		String department;
		int countDepartment = 0;
		Map<String, Long> map = new HashMap<String, Long>();
		
		for(int i = 0; i < list.size(); i++) {
			department = list.get(i).getDepartment();
			for(int j = 0; j < list.size(); j++) {
				if(department == list.get(j).getDepartment()) {
					countDepartment++;
					map.put(department, (long) countDepartment);
				}
			}
			countDepartment = 0;
			department = "";
		}
		return map;
	}
	
	//Get youngest candidate details
	Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list) {
		int min = 0;
		int pos = 0;
		
		for(int i = 0; i < list.size(); i++) {
			min = list.get(i).getAge();
			for(int j = 0; j < list.size(); j++) {
				if(min > list.get(j).getAge()) {
					min = list.get(j).getAge();
					pos = j;
				}
			}
		}
		
		Optional<Candidate> op = Optional.of(list.get(pos));
		return op;
	}
}

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//public class HiringOn {
//	public static void main(String[] args) throws Exception{
//		List<Candidate> list = new ArrayList<Candidate>();
//		list.add(new Candidate(111, "Pritam", 33, "Male", "Maths", 2021, 25000.0));
//		list.add(new Candidate(112, "Raj", 32, "Male", "Physics", 2021, 25000.0));
//		list.add(new Candidate(144, "Sneha", 29, "Female", "Biology", 2020, 22000.0));
//		list.add(new Candidate(145, "Rajani", 28, "Female", "Chemistry", 2020, 22000.0));
//		
//		Implementation implement = new Implementation();
//		System.out.println(implement.getCount(list));
//		System.out.println(implement.getAverageAge(list));
//		System.out.println(implement.countCandidatesDepartmentWise(list));
//		System.out.println(implement.getYoungestCandidateDetails(list));
//	}
//}
//
//class Candidate{
//	private String name;
//	private int id;
//	private int age;
//	private String gender;
//	private String department;
//	private int yearOfJoining;
//	private double salary;
//	
//	public Candidate(int id, String string, int age, String gender, String department, int yearOfJoining, double salary) {
//		super();
//		this.name = string;
//		this.id = id;
//		this.age = age;
//		this.gender = gender;
//		this.department = department;
//		this.yearOfJoining = yearOfJoining;
//		this.salary = salary;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//
//	public int getYearOfJoining() {
//		return yearOfJoining;
//	}
//
//	public void setYearOfJoining(int yearOfJoining) {
//		this.yearOfJoining = yearOfJoining;
//	}
//
//	public double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ",name=" + name + ", age=" + age + ", gender=" + gender + ", department="
//				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
//	}
//}
//
//class Implementation{
//	//Count number of males and females.
//	Map<String, Long> getCount(List<Candidate> list){
//		long countMale = 0;
//		long countFemale = 0;
//		Map<String, Long> map = new HashMap<String, Long>();
//		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getGender() == "Male") {
//				countMale++;
//			}else {
//				countFemale++;
//			}
//		}
//		map.put("Male", countMale);
//		map.put("Female", countFemale);
//		return map;
//	}
//	
//	//Get average age 
//	Map<String, Double> getAverageAge(List<Candidate> list){
//		int countMale = 0;
//		int countFemale = 0;
//		double totalAgeMale = 0.0;
//		double totalAgeFemale = 0.0;
//		double averageAgeOfMale = 0.0;
//		double averageAgeOfFemale = 0.0;
//		Map<String, Double> map = new HashMap<String, Double>();
//		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getGender() == "Male") {
//				countMale++;
//				totalAgeMale += list.get(i).getAge();
//			}else {
//				countFemale++;
//				totalAgeFemale += list.get(i).getAge();
//			}
//		}
//		averageAgeOfMale = totalAgeMale / countMale;
//		averageAgeOfFemale = totalAgeFemale / countFemale;		
//		map.put("Male", averageAgeOfMale);
//		map.put("Female", averageAgeOfFemale);
//
//		return map;
//	}
//	
//	//Count candidates department wise
//	Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list){
//		String department;
//		int countDepartment = 0;
//		Map<String, Long> map = new HashMap<String, Long>();
//		
//		for(int i = 0; i < list.size(); i++) {
//			department = list.get(i).getDepartment();
//			for(int j = 0; j < list.size(); j++) {
//				if(department == list.get(j).getDepartment()) {
//					countDepartment++;
//				}
//			}
//			map.put(department, (long) countDepartment);
//			countDepartment = 0;
//			department = null;
//		}
//		return map;
//	}
//	
//	//Get youngest candidate details
//	Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list) {
//		int min = 0;
//		int pos = 0;
//		
//		for(int i = 0; i < list.size(); i++) {
//			min = list.get(i).getAge();
//			for(int j = 0; j < list.size(); j++) {
//				if(min > list.get(j).getAge()) {
//					min = list.get(j).getAge();
//					pos = j;
//				}
//			}
//		}
//		
//		System.out.println("Optional["+list.get(pos).toString()+"]");
//		return null;
//	}
//}