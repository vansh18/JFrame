import java.util.Scanner;
class MyException extends Exception
{
  MyException(String message)
  {
   super(message);
  }
}
public class lab12_ques1
{
    static void check(int x,int y) throws MyException
    {
        if (min < 0 || max < 0 || min >= max )
        {
            throw new MyException("Error");
        }
    }
    static int min;
    static int max;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        min = sc.nextInt();
        System.out.println("Enter the end number: ");
        max = sc.nextInt();
        try
        {
            check(min,max);
            for (int i = min; i <= max; i++)
            {
                if (isPrime(i))
                {
                    System.out.print(i + " ");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("\nProgram ended");
        }
    }
    public static boolean isPrime(int num)
    {
        if (num < 2)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
