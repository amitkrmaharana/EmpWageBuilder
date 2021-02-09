public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int IS_FULL_TIME = 1;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int dailyWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			dailyWage = (wagePerHour * fullDayHour);
			System.out.println("Daily Wage of the Employee is: " +dailyWage);
		}
		else
			System.out.println("Daily Wage of the Employee is: " +dailyWage);
	}
}
