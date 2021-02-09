public class empWageBuilder {


	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int fullDayHour = 8;
		int partTimeHour = 4;
		int dailyWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		switch ((int)empCheck) {
			case IS_FULL_TIME:
				dailyWage = (WAGE_PER_HOUR * fullDayHour);
				System.out.println("Daily Wage of the Employee is: " +dailyWage);
				break;
			case IS_PART_TIME:
				dailyWage = (WAGE_PER_HOUR * partTimeHour);
	                        System.out.println("Daily Wage of the Employee is: " +dailyWage);
				break;
			default:
				System.out.println("Daily Wage of the Employee is: " +dailyWage);
				break;
		}
	}
}
