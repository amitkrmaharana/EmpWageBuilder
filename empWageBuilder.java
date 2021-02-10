public class EmpWageBuilder {


	public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int fullDayHour = 8;
		int partTimeHour = 4;
		int dailyWage;
		int monthlyWage = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		while (totalWorkingHours < 100 && totalWorkingDays < 20) {
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int)empCheck) {
				case IS_FULL_TIME:
					dailyWage = (WAGE_PER_HOUR * fullDayHour);
					monthlyWage += dailyWage;
					totalWorkingHours += fullDayHour;
					break;
				case IS_PART_TIME:
					dailyWage = (WAGE_PER_HOUR * partTimeHour);
		                        monthlyWage += dailyWage;
					totalWorkingHours += partTimeHour;
					break;
				default:
					dailyWage = 0;
					monthlyWage += dailyWage;
					break;
			}
			totalWorkingDays++;
		}
		System.out.println("Monthly Wage of the Employee is: " +monthlyWage);
		System.out.println("Total Working Hours are: " +totalWorkingHours);
		System.out.println("Total Working Days are: " +totalWorkingDays);
	}
}
