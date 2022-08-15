package labtest.subclasses;
import labtest.superclass.Employee;

public class Technician extends Employee{
    
    final double OTCHARGE = 10.00;
    double hourOT;
    
    public Technician(String staffId, String name, String designation, double basicSalary, double hourOT ){
        super(staffId, name, designation, basicSalary);
        this.hourOT = hourOT;
    }
    
    public double getHourOT() {
        return hourOT;
    }

    public void setHourOT(double hourOT) {
        this.hourOT = hourOT;
    }
    
    public double getCalculateSalary(){
        //double totalSalary = 0;
        totalSalary = super.getBasicSalary()+ hourOT * OTCHARGE;
        return totalSalary;
    }
    
    @Override
    public String toString(){
        return ("\nStaff ID :\t" +super.getStaffId()+ 
                "\nName :\t\t" +super.getName()+ 
                "\nDesignation :\t" +super.getDesignation() + 
                "\nBasic Salary :\t" +super.getBasicSalary()+ 
                "\nHour OT :\t" +hourOT+ 
                "\nTotal Salary :\t"+getCalculateSalary()+"\n" );
    }
}
