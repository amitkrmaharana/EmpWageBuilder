import java.util.*;

interface IComputeEmpWage{
    public void addCompanyEmpWage(String company, int per_hour_wage, int numOfWorkingDays, int maxHoursPerMonth);
    public void calculateSalary();
    public int getTotalWage(String company);
}

class CompanyEmpWage {
    public String company;
    public int empRatePerHour;
    public int numOfWorkingDays;
    public int maxHoursPerMonth;
    public int totalEmpWage = 0;

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public String toString() {
        return "Total totalEmpWage for company " + company + " is : " + this.totalEmpWage;
    }
}
public class EmpWageBuilder  implements IComputeEmpWage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    
    private int numOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;

    public EmpWageBuilder () {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);

        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(company, companyEmpWage);
    }


    public void calculateSalary() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.calculateSalary(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    
    @Override
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }
    
    public int calculateSalary(CompanyEmpWage companyEmpWage) {
        int work_hours = 0, work_days = 0, daily_wage = 0, empHr;
        while (work_hours < companyEmpWage.maxHoursPerMonth && work_days < companyEmpWage.numOfWorkingDays) {
            work_days++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            int check = (int) empcheck;
            switch (check) {
                case IS_FULL_TIME:
                	empHr = 8;
                    work_hours += empHr;
                    daily_wage = empHr * companyEmpWage.empRatePerHour;
                    break;
                case IS_PART_TIME:
                	empHr = 4;
                    work_hours += empHr;
                    daily_wage = empHr * companyEmpWage.empRatePerHour;
                    break;
                default:
                    work_hours += 0;
            }
            System.out.println("Day" + work_days + " daily wage :" + daily_wage + " Total working hrs :" + work_hours);
            daily_wage = 0;
        }
        return companyEmpWage.totalEmpWage = work_hours * companyEmpWage.empRatePerHour;
    }

    
    public static void main(String[] args) {
    	IComputeEmpWage empWageBuilder = new EmpWageBuilder();
    	empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
    	empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
    	empWageBuilder.calculateSalary();
    	System.out.println("Total Wage for DMart " + empWageBuilder.getTotalWage("DMart"));

    }    
}
