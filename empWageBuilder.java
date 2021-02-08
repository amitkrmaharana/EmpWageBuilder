public class empWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHour = 4;
		int dailyWage;
		int monthlyWage = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		while (totalWorkingHours < 100 && totalWorkingDays < 20) {
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int)empCheck) {
				case 1:
					dailyWage = (wagePerHour * fullDayHour);
					monthlyWage+=dailyWage;
					totalWorkingHours+=fullDayHour;
					break;
				case 2:
					dailyWage = (wagePerHour * partTimeHour);
		                        monthlyWage+=dailyWage;
					totalWorkingHours+=partTimeHour;
					break;
				default:
					dailyWage = 0;
					monthlyWage+=dailyWage;
					break;
			}
			totalWorkingDays++;
		}
		System.out.println("Monthly Wage of the Employee is: " +monthlyWage);
		System.out.println("Total Working Hours are: " +totalWorkingHours);
		System.out.println("Total Working Days are: " +totalWorkingDays);
	}
}
