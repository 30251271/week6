package problem04;

class Employee {
	double salary;
	
	Employee(double salary) {
		this.salary = salary;
	}
	
	double calculate() {
		return salary;
	}
	
	double calculate(boolean yearly) {
		return yearly ? salary * 12 : salary;
	}
	
}



public class problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
