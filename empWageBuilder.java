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

    public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
            EmpWageBuilder dMart = new EmpWageBuilder("DMart", 20, 13, 50);
            int dailyWage = 0, monthlyWage = 0, totalWorkingHours = 0, totalWorkingDays = 0, empHr = 0;
            while (totalWorkingHours < dMart.maxHoursPerMonth && totalWorkingDays < dMart.numOfWorkingDays) {
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
                dailyWage = (dMart.wagePerHour * empHr);
                monthlyWage += dailyWage;
                totalWorkingDays++;
            }
            System.out.println("Monthly Wage of a "+dMart.company+" Employee is : " +monthlyWage);
            System.out.println("Total Working Hours are: " +totalWorkingHours);
            System.out.println("Total Working Days are: " +totalWorkingDays);
    }
}

