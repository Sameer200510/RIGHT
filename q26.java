import java.util.Scanner;
class MyCalculator 
{
    public int power(int n, int p) 
    {
        if (n < 0 || p < 0) 
        {
            System.out.println("Error: n and p must be non-negative");
            return 0;
        }
        if (n == 0 && p == 0) 
        {
            System.out.println("Error: n and p cannot both be zero");
            return 0;
        }
        return (int) Math.pow(n, p);
    }
}
public class q26 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MyCalculator calc = new MyCalculator();
        while (true) 
        {
            System.out.print("Enter base number: ");
            int n = sc.nextInt();
            System.out.print("Enter power: ");
            int p = sc.nextInt();
            int result = calc.power(n, p);
            System.out.println("Result: " + result);
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) 
            {
                break;
            }
        }
        sc.close();
    }

}