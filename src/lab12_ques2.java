import java.util.*;

public class lab12_ques2
{
    public static void main(String[] args) throws MyException1
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your year");
        int year = sc.nextInt();
        System.out.println("Enter your id");
        String id = sc.next();

        student ob = new student(name,age,year,id);
        ob.check();
    }
}
class MyException1 extends Exception
{
    MyException1(String message)
    {
        super(message);
    }
}
class student
{
    String name;
    int age;
    int year;
    String id;
    public student(String name, int age, int year, String id)
    {
        this.name = name;
        this.age = age;
        this.year = year;
        this.id = id;
    }
    public void check() throws MyException1
    {
        if (!name.matches("[a-zA-Z]+"))
        {
            throw new MyException1("Special characters in name");
        }
        int idLength = id.length();
        String temp = id.substring(1,idLength-1);

        // System.out.println(temp);
        if (idLength != 6 || id.charAt(0) != 'f' || id.charAt(idLength-1) != 'U' || !temp.matches("[0-9]+"))
        {
            throw new MyException1("ID is wrong");
        }
    }
}
