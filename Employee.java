package labtest.superclass;

public class Employee {
    
    public String staffId;
    public String name;
    public String designation;
    public double basicSalary;
    public double totalSalary;

    public Employee(String staffId, String name, String designation, double basicSalary){
        
        this.staffId = staffId;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.totalSalary = totalSalary;  
        
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSlary) {
        this.basicSalary = basicSlary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }    
}
