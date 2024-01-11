import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        EmployeeServices e= new EmployeeServicesImp();
        System.out.println("=====Welocme to Employee DataBase=====");
        while(true){
            System.out.println("=====Menu=====");
            System.out.println("1. Create Employee Database \n2. Check Avilable Index");
            System.out.println("3. Add Employee Details \n4. Display All Employee Details");
            System.out.println("5. Get Employee Details By ID \n6. Delete Employee Details by ID");
            System.out.println("7. Update Enployee Details by ID \n8. EXIT");
            System.out.println("Enter Your Option");
            int option = s1.nextInt();
            switch (option){
                case 1: System.out.println("Enter Size of DataBase");
                        int size= s1.nextInt();
                        e.createEmployeedb(size); break;
                case 2: System.out.print("Avilable Index are: ");
                    e.availableindex(); break;
                case 3: System.out.println("Add Employee Details");
                        System.out.println("Enter Index Number");
                        int index= s1.nextInt();
                            e.addemployee(index);
                            break;
                case 4: e.displayAllEmp(); break;
                case 5: System.out.println("Enter Enployee ID");
                         int id=s1.nextInt();
                         e.getEmpByid(id);
                                  break;
                case 6: System.out.println("Enter Employee ID for Delete");
                          int eid=s1.nextInt();
                          e.deleatdetails(eid);
                          break;
                case 7:  System.out.println("Enter Employee ID for Update");
                            int empid=s1.nextInt();
                            e.updateDetails(empid);
                            break;
                case 8: System.out.println("=====Thank You=====");
                        System.exit(0); break;
                default: System.out.println("Invalid Option");
            }

        }
    }
}
