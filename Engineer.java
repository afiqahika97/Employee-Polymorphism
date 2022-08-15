package labtest.subclasses;
import labtest.superclass.Employee;

public class Engineer extends Employee {

    public double claim;
    
    public Engineer(String staffId, String name, String designation, double basicSalary, double claim ){
        super(staffId, name, designation, basicSalary);
        this.claim = claim;
    }
      
    public double getClaim() {
        return claim;
    }

    public void setClaim(double claim) {
        this.claim = claim;
    }
    
    public double getCalculateSalary(){
        //double totalSalary = 0;
        totalSalary = super.getBasicSalary() + claim;
        return totalSalary;
    }
    
    public String toString(){
        return ("\nStaff ID :\t" +super.getStaffId()+ 
                "\nName :\t\t" +super.getName()+ 
                "\nDesignation :\t" +super.getDesignation() + 
                "\nBasic Salary :\t" +super.getBasicSalary()+ 
                "\nClaim :\t\t" +claim+ 
                "\nTotal Salary :\t"+getCalculateSalary()+"\n" );
    }
    
}
