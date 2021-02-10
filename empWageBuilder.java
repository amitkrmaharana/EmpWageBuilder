public class EmpWageBuilder {


	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_TIME_HOUR = 4;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int dailyWage = 0;
		int monthlyWage = 0;
		for (int i=1;i<=20;i++) {
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int)empCheck) {
				case IS_FULL_TIME:
					dailyWage = (WAGE_PER_HOUR * FULL_DAY_HOUR);
					monthlyWage += dailyWage;
					break;
				case IS_PART_TIME:
					dailyWage = (WAGE_PER_HOUR * PART_TIME_HOUR);
		                        monthlyWage += dailyWage;
					break;
				default:
					dailyWage = 0;
					monthlyWage += dailyWage;
			}
		}
		System.out.println("Monthly Wage of the Employee is: " +monthlyWage);
	}
}
