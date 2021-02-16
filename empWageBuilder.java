public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmpWageBuilder(String company, int wagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
    	this.company = company;
    	this.wagePerHour = wagePerHour;
    	this.numOfWorkingDays = numOfWorkingDays;
    	this.maxHoursPerMonth = maxHoursPerMonth;
    }

    private int computeEmpWage() {
        int dailyWage = 0, monthlyWage = 0, totalWorkingHours = 0, totalWorkingDays = 0, empHr = 0;
        while (totalWorkingHours < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int)empCheck) {
                    case IS_FULL_TIME:
                    		empHr = 8;
                            break;
                    case IS_PART_TIME:
                    		empHr = 4;
                            break;
                    default:
                    		empHr = 0;
            }
            totalWorkingHours += empHr;
            dailyWage = (wagePerHour * empHr);
            monthlyWage += dailyWage;
            totalWorkingDays++;
        }
        return monthlyWage;
    }

    public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
    	EmpWageBuilder dMart = new EmpWageBuilder("DMart", 20, 13, 50);
	EmpWageBuilder reliance = new EmpWageBuilder("RELIANCE", 23, 15, 70);
	EmpWageBuilder tataMotors = new EmpWageBuilder("TATA MOTORS", 18, 19, 130);
	System.out.println("The total monthly Wage of the Employee of the company " + dMart.company + " is " + dMart.computeEmpWage());
	System.out.println("The total monthly Wage of the Employee of the company " + reliance.company + " is " + reliance.computeEmpWage());
	System.out.println("The total monthly Wage of the Employee of the company " + tataMotors.company + " is " + tataMotors.computeEmpWage());
    }

}
