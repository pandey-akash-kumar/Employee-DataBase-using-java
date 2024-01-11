import java.util.Scanner;

public class EmployeeServicesImp implements EmployeeServices{
    Employee[] arr;
    Scanner sc= new Scanner(System.in);
    @Override
    public void createEmployeedb(int size) {
        arr=new Employee[size];
        System.out.println("DataBase Created Sucessfully ");
    }

    @Override
    public void availableindex() {
        for( int i=0; i<arr.length;i++){
            if(arr[i]==null){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    @Override
    public void addemployee(int index) {
        if(index>arr.length-1){
            System.out.println("Invalid Index");
        }
        else if(arr[index]!=null){
            System.out.println("Index Already have Data");
        }
       else{
            System.out.println("Enter Employee ID");
            int eid= sc.nextInt();
            System.out.println("Enter Employee Name");
            String name = sc.next();
            System.out.println("Enter Employee Salary");
            Double sal=sc.nextDouble();
            System.out.println("Enter Employee Designation");
            String deg= sc.next();
            Employee e= new Employee(eid,name,sal,deg);
            arr[index]=e;
            System.out.println("Employee Details Added Sucessfully");
        }

    }
    @Override
    public void displayAllEmp() {
        System.out.println("Details of all Employes are: ");
        int c=0;
        for(Employee a: arr){
            if(a!=null){
                System.out.println(a);
                c++;
            }
        }
        if(c==0) {
            System.out.println("Database id Empty");
        }
    }
    @Override
    public void getEmpByid(int id) {
        int c=0;
           for(Employee e: arr){
               if(e!=null){
                   if(e.getId()==id){
                       System.out.println(e);
                       c++; break;
                   }
               }
           }
           if(c==0){
               System.out.println("Employee ID is Not Found");
           }
    }
    @Override
    public void deleatdetails(int eid) {
        int c=0;
        for(int i=0; i<arr.length;i++){
                if(arr[i].getId()==eid){
                    arr[i]=null;
                    System.out.println("Detail is Delete Sucessfully");
                    c++;
                    break;
                }
            }
        if(c==0){
            System.out.println("Employee ID not Found");
        }
        }

    @Override
    public void updateDetails(int empid) {
        int c=0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]!=null){
            if(arr[i].getId()==empid){
                System.out.println("1. For Salary Updatation\n2. For Designation Updatation");
                System.out.println("3. For Both salary and Designation ");
                c++;
                int choose=sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Enter Salary");
                        double sal = sc.nextDouble();
                        arr[i].setSal(sal);
                        System.out.println("Updatation Sucessfully");
                        break;
                    case 2:
                        System.out.println("Enter Designation");
                        String deg = sc.next();
                        arr[i].setDesg(deg);
                        System.out.println("Updatation Sucessfully");
                        break;
                    case 3:
                        System.out.println("Enter Salary");
                        Double s = sc.nextDouble();
                        System.out.println("Enter Designation");
                        String d = sc.next();
                        arr[i].setSal(s);
                        arr[i].setDesg(d);
                        System.out.println("Updatation Sucessfully");
                        break;
                }

                }
            }
        }
        if(c==0){
            System.out.println("ID Not Found");
        }
    }
}


