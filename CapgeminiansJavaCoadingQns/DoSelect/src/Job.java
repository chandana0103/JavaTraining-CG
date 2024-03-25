import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// import java.util.Scanner;

class CompanyJobRepository {
	int age;
	String qualification;
	
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
		}else if((age >= 26) && (qualification.equals("M.S") || qualification.equals("PhD"))) {
			return "We have openings for senior developer";
		}else if((age >= 19 && age < 21) && !(list.contains(qualification))){
			throw new NotEligibleException("We do not have any job that matches your qualification");
		}else {
			return "Sorry we have no openigs for now";
		}
	}
}

public class Job {
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		try {
			// searchForJob(29, "M.S");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			String qual = sc.next();
			//sc.nextLine();
			System.out.println(searchForJob(age,qual));
			
		}catch (NotEligibleException e) {
			e.printStackTrace();
		}
	}

	public static String searchForJob(int age, String qual) throws NotEligibleException {
		if(age >= 200 || age <= 0) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		}else {
			String val = CompanyJobRepository.getJobPrediction(age, qual);
			// System.out.println(CompanyJobRepository.getJobPrediction(age, qual));
			return val;
		}
	}
}
//class NotEligibleException extends Exception {
//	public NotEligibleException (String msg) {
//		super(msg);
//	}
//}