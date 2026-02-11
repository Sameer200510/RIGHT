import java.util.Scanner;
class InvalidNameException extends Exception 
{
    public InvalidNameException(String msg) 
    {
        super(msg);
    }
}






class InvalidEmployeeIdException extends Exception 
{
    public InvalidEmployeeIdException(String msg) 
    {
        super(msg);
    }
}
class InvalidDeptIdException extends Exception 
{
    public InvalidDeptIdException(String msg) 
    {
        super(msg);
    }
}
class Employee 
{
    int empId, deptId;
    String name;
    public void inputDetails() throws InvalidNameException, InvalidEmployeeIdException, InvalidDeptIdException 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Employee ID (2001 - 5001): ");
        empId = sc.nextInt();
        if (empId < 2001 || empId > 5001) 
        {
            throw new InvalidEmployeeIdException(" Employee ID must be in range 2001 to 5001.");
        }

        sc.nextLine(); 
        System.out.print(" Enter Name: ");
        name = sc.nextLine();
        if (name.isEmpty() || !Character.isUpperCase(name.charAt(0))) 
        {
            throw new InvalidNameException(" Name must start with a capital letter.");
        }

        System.out.print(" Enter Department ID (1 - 5): ");
        deptId = sc.nextInt();
        if (deptId < 1 || deptId > 5) 
        {
            throw new InvalidDeptIdException(" Department ID must be between 1 and 5.");
        }
    }
    public void showDetails() 
    {
        System.out.println(" Employee Info Successfully Captured:");
        System.out.println(" ID        : " + empId);
        System.out.println(" Name      : " + name);
        System.out.println(" Dept Code : " + deptId);
    }
}

public class q25 
{
    public static void main(String[] args) 
    {
        Employee e = new Employee();
        try 
        {
            e.inputDetails();
            e.showDetails();
        } catch (Exception ex) {
            System.out.println(" Error" + ex.getMessage());
        }
    }
}

