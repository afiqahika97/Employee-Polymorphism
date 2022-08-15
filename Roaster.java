package labtest.manipulator;
import java.util.ArrayList;
import java.util.HashMap;
import labtest.superclass.Employee;
import labtest.subclasses.Engineer;
import labtest.subclasses.Technician;

//import labtest.superclass.Employee;

public class Roaster {

    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void makeRoaster(){
    
        Employee E001 = new Engineer("E001", "Simon", "Engineer 1", 4000.00, 500.00);
        Employee E002 = new Engineer("E002", "Rajesh", "Engineer 2", 3000.00, 1500.00);
        Employee E003 = new Engineer("E003", "Saad", "Engineer 1", 4000.00, 700.00);
        Employee T001 = new Technician("T001", "Farid", "Technician 1", 1500.00, 7);
        Employee T002 = new Technician("T002", "Lim", "Technician 1", 1500.00, 12);
        Employee T003 = new Technician("T003", "Raju", "Technician 2", 1000.00, 14.5);
        
        E001.getTotalSalary();
        E002.getTotalSalary();
        E003.getTotalSalary();
        T001.getTotalSalary();
        T002.getTotalSalary();
        T003.getTotalSalary();
        
        employees.add(E001);
        employees.add(E002);
        employees.add(E003);
        employees.add(T001);
        employees.add(T002);
        employees.add(T003);
          
     
    }

    public ArrayList<Employee> getRoaster(){
        return employees;
    }
    
    public HashMap<String, Employee> getEmployeeMap(){
        HashMap<String, Employee> empMap = new HashMap<String, Employee>();
        
        for(Employee e: employees){
            empMap.put(e.getStaffId(), e);
        }
        return empMap;
    }
    
    public Employee getEmployeeByName(String name){
        Employee employee = null;
        for(Employee e: employees)
        {
            if(e.getName().equals(name))
                employee = e;
        }
        return employee;
    }
    
    public Employee getEmployeeByStaffId(String staffId){
        Employee employee = null;
        for(Employee e: employees)
        {
            if(e.getStaffId().equals(staffId))
                employee = e;
        }
        return employee;
    }
    
    public ArrayList<Engineer> getEngineer(){
        ArrayList <Engineer> engineer = new ArrayList<Engineer>();
        for(Employee emp: employees){
            if(emp instanceof Engineer){
                engineer.add((Engineer) emp);
            }
        }
        return engineer;
    }
    
    public ArrayList<Technician> getTechnician(){
        ArrayList <Technician> technician = new ArrayList<Technician>();
        for(Employee emp: employees){
            if(emp instanceof Technician){
                technician.add((Technician) emp);
            }
        }
        return technician;
    }
    

}
