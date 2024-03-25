class Person {
 String name;
 double age;
 public String getName() {
   return name;
 }
 public void setName(String name) {
   this.name=name;
 }
 public double getAge() {
  return age;
 } 
 public void setAge(double age) {
   this.age = age;
  }
}
   
class Account {
  long accNum;
  double balance;
  Person accHolder;
  public long getAccNum() {
   return accNum;
  }
  public void setAccNum(int accNum) {
   this.accNum = accNum;
  }
  public double getBalance() {
   return balance;
  }
  public void setBalance(double balance) {
   this.balance = balance;
  }
  public Person getAccHolder() {
  return accHolder;
  } 
  public void setAccHolder(Person accHolder) {
   this.accHolder = accHolder;
  }
  public void deposit(double addamount) {
   balance = balance + addamount;
  }
  public void withdraw(double drawamount) {
   balance = balance - drawamount;
  }
}
public class Lab4 {
	public static void main(String[] args) {
		Person p1 = new Person("Smith ", 21);
		Person p2 = new Person("Kathy ", 26);
		Account acc1 = new Account(1111, 2000, p1);
		Account acc2 = new Account(2222, 3000, p2);
		acc1.deposit(2000);
		// acc1.getBalance();
		System.out.println("Smith's account balance is Rs " + acc1.getBalance()); // 4000
		acc2.withdraw(2000);
		// acc2.getBalance();
		System.out.println("Kathy's account balance is Rs " + acc2.getBalance()); // 1000
		CurrentAccount c = new CurrentAccount();
		SavingAccount s = new SavingAccount();
		c.deposit(2000);
		s.deposit(2000);
		doWithdrawal(c); // withdraw succeed
		doWithdrawal(s); // withdraw failed
	}
	public static void doWithdrawal(Account acc) {
		boolean result = acc.withdraw(1000.00);
		if (result) {
			System.out.println("Withdraw succeed");
		} else {
			System.out.println("Withdraw failed");
		}

	}

}  