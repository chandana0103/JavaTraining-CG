import java.util.Arrays;
import java.util.List;

public class JobAgency{

	public static void main(String[] args) throws NotEligibleException {
		searchForJob(26, "PhD");
	}

	public static void searchForJob(int age, String qual) throws NotEligibleException {
		CompanyJobRepository1 job1 = new CompanyJobRepository1();
		if(age >= 200 || age <= 0) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		}else {
			System.out.println(job1.getJobPrediction(age, qual));
		}
	}
}

class CompanyJobRepository1{
	private int age;
	private String qualification;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public static String getJobPrediction(int age, String qualification) throws NotEligibleException {
		String[] strArr = {"B.E", "M.S", "PhD"};
		List<String> list = Arrays.asList(strArr);
		
		if(age < 19) {
			throw new NotEligibleException("You are underage for any job");
		}else if((age >= 21 && age < 26) && (qualification == "B.E")) {
			return "We have openings for junior developer";
		}else if((age >= 26) && (qualification == "M.S" || qualification == "PhD")) {
			return "We have openings for senior developer";
		}else if((age >= 19 && age < 21) && !(list.contains(qualification))){
			throw new NotEligibleException("We do not have any job that matches your qualification");
		}else {
			return "Sorry we have no openigs for now";
		}
	}
}

class NotEligibleException extends Exception {
	public NotEligibleException (String msg) {
		super(msg);
	}
}

