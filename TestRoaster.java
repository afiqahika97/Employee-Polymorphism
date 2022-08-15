package labtest.manipulator.main;
import labtest.manipulator.Roaster;
import labtest.superclass.Employee;
//import java.util.ArrayList;


public class TestRoaster {
   public static void main (String args[]){ 
    Roaster roaster = new Roaster();
        
        roaster.makeRoaster();
        System.out.println("####################################################");
        System.out.println("File of arraylist : "+roaster.getRoaster().size());
        System.out.println("####################################################\n");
        
        System.out.println("####################################################");
        Employee T002 = roaster.getEmployeeByName("Lim");
        System.out.println(T002.getStaffId() + " " 
                + " " + T002.getName() 
                + " " + T002.getDesignation() 
                + " " + T002.getBasicSalary()
                + " " + T002.toString());
        System.out.println("####################################################\n");
        
        System.out.println("####################################################");
        Employee E002 = roaster.getEmployeeByStaffId("E002");
        System.out.println( E002.getName() 
                + " " + E002.getDesignation() 
                + " " + E002.getBasicSalary()
                + " " + E002.toString());
        System.out.println("####################################################\n");

        System.out.println("####################################################");
        System.out.println(roaster.getEngineer());
        System.out.println("####################################################\n");
        
        System.out.println("####################################################");
        System.out.println(roaster.getTechnician());
        System.out.println("####################################################");
}
}
