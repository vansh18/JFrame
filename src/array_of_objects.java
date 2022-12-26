import java.util.*;
class Student
{
    public int r, m1,m2,m3;
    public double avg;
    Student(int r, int m1,int m2, int m3)
    {
        this.r = r;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void cal_avg()
    {
        avg=(m1+m2+m3)/3;
        System.out.println("\n Avg is: "+avg);
    }
}
// Elements of the array are objects of a class Student.
public class array_of_objects
{
    public static void main (String[] args)
    {
        int size, i;
        int id,m1,m2,m3, ind;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter no of students");
        size=sc.nextInt();
        // declares an Array of integers.
        Student[] arr=new Student[size];
        for(i=0;i<size;i++)
        {
            System.out.println("\n Enter id, m1, m2, m3 of "+(i+1)+" student");
            id=sc.nextInt();
            m1=sc.nextInt();
            m2=sc.nextInt();
            m3=sc.nextInt();
            arr[i] = new Student(id,m1,m2,m3);
            arr[i].cal_avg();
        }
        ind=highest(arr);
        System.out.println("\n Highest scorer id is : "+arr[ind].r);
        System.out.println("\n Highest scorer avg is : "+arr[ind].avg);
    } // main
    static int highest(Student[] s)
    {
        double high=s[0].avg;
        int j,index=0;
        for(j=1;j<s.length;j++)
        {
            if(high<s[j].avg)
            {
                high=s[j].avg;
                index=j;
            }
        }
        return index;
    }
} //class
