/*java program to demonstrate the employee management system
 * By Gopika
 * Date of Start - 12-09-2019 
 * Current date  - 04-10-2019
 */
package employeedetails;
public class Main {
    //Driver code
    public static void main(String args[]) {
        getSizeOfArray();
        getOptions();
    }
    //to get the options from user to perform operations
    private static void getSizeOfArray() {
        System.out.println("Enter the size of an employee Array");
    }
    private static void getOptions() {
        EmployeeValidation employeeValidation = new EmployeeValidation();
        EmployeeMaintanance employeeMaintanance = new EmployeeMaintanance();
        EmployeeUpdation employeeUpdation = new EmployeeUpdation();
        int choice = 1, addEmployee = 0;
        while (choice == 1) {
            System.out.println("1.enter employee details \n2.search employee \n3.display \n4.delete\n5.Update ");
            int select = Employee.getOnlyInteger();
            switch (select) {
                case 1:
                    System.out.println("Enter the details of an employee");
                    if (select == 1)
                        addEmployee = 1;
                    employeeMaintanance.getDetails(addEmployee);
                    break;
                case 2:
                    System.out.println("Enter the emailid of the employee to display their details");
                    String referenceMail = Employee.getOnlyString();
                    // to search an employee
                    employeeValidation.search(referenceMail);
                    break;
                case 3:
                    System.out.println("Display the employee details");
                    // Print the employee details
                    employeeValidation.display();
                    break;
                case 4:
                    System.out.println("Enter employee id to fire him");
                    //delete employee
                    String employeeId = Employee.getOnlyString();
                    employeeMaintanance.delete(employeeId);
                    break;
                case 5:
                    //Update employee details
                    employeeUpdation.getOptionsForUpdation();
                    break;
                default:
                    System.out.println("Try once again!!!");
                    break;
            }
            System.out.println("Do you want to continue....If yes press 1 ");
            choice = Employee.getOnlyInteger();
        }
    }
}