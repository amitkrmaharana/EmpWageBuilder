public class empWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int dailyWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		switch ((int)empCheck) {
			case 1:
				dailyWage = (wagePerHour * fullDayHour);
				System.out.println("Daily Wage of the Employee is: " +dailyWage);
				break;
			case 2:
				dailyWage = (wagePerHour * partTimeHour);
	                        System.out.println("Daily Wage of the Employee is: " +dailyWage);
				break;
			default:
				System.out.println("Daily Wage of the Employee is: " +dailyWage);
				break;
		}
	}
}
