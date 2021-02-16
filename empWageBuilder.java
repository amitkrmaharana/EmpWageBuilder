import java.util.ArrayList;
import java.util.Scanner;

class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
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
		return "Total Employee wage for Company: " +company+" is " +totalEmpWage;
	}
}

public class EmpWageBuilder {
    public static final int PRESENT_FULL_TIME = 2;
    public static final int PRESENT_PART_TIME = 1;
    public static final int IS_FULL_TIME = 8;
    public static final int IS_PART_TIME = 4;

//    private int numOfCompany = 0;
    private ArrayList<CompanyEmpWage> companyEmpWageArray;

    public EmpWageBuilder() {
        companyEmpWageArray = new ArrayList<CompanyEmpWage>();
    }

    private void addCompanyEmpWage(String company, int per_hour_wage, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray.add(new CompanyEmpWage(company, per_hour_wage, numOfWorkingDays, maxHoursPerMonth));
//        numOfCompany++;
    }

    private void calculatetotalEmpWage() {
        for (int i = 0; i < companyEmpWageArray.size(); i++) {
            companyEmpWageArray.get(i).setTotalEmpWage(this.calculatetotalEmpWage(companyEmpWageArray.get(i)));
            System.out.println(companyEmpWageArray.get(i));
        }
    }

    private int calculatetotalEmpWage(CompanyEmpWage companyEmpWage) {
        int work_hours = 0, work_days = 0;
        while (work_hours < companyEmpWage.maxHoursPerMonth && work_days < companyEmpWage.numOfWorkingDays) {
            work_days++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            int check = (int) empcheck;
            switch (check) {
                case PRESENT_FULL_TIME:
                    work_hours += IS_FULL_TIME;
                    break;
                case PRESENT_PART_TIME:
                    work_hours += IS_PART_TIME;
                    break;
                default:
                    work_hours += 0;
            }
            System.out.println("Day" + work_days + " Total working hrs " + work_hours);
        }
        return companyEmpWage.totalEmpWage = work_hours * companyEmpWage.empRatePerHour;
    }

    public ArrayList getCompanydetails() {
        ArrayList details = new ArrayList();
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the company name");
        details.add(obj.nextLine());
        System.out.println("enter the per hour wage");
        details.add(obj.nextInt());
        System.out.println("enter the max work days");
        details.add(obj.nextInt());
        System.out.println("enter the max work hours");
        details.add(obj.nextInt());
        System.out.println(details);
        return details;
    }

    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        ArrayList company1details = empWageBuilder.getCompanydetails();
        empWageBuilder.addCompanyEmpWage((String) company1details.get(0), (Integer) company1details.get(1),
                (Integer) company1details.get(2),(Integer) company1details.get(3));
        ArrayList company2details = empWageBuilder.getCompanydetails();
        empWageBuilder.addCompanyEmpWage((String) company2details.get(0), (Integer) company2details.get(1),
                (Integer) company2details.get(2),(Integer) company2details.get(3));
        empWageBuilder.calculatetotalEmpWage();
    }
}