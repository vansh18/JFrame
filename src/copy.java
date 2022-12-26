class car
{
    String name;
    String model;
    int year;
    car(String name,String model,int year)
    {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    car(car x)
    {
        this.setName(x.name);
        this.setModel(x.model);
        this.setYear(x.year);
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
}
public class copy
{
    public static void main(String[] args)
    {
        car car1 = new car("BMW","q5",2022);

        car car2 = new car(car1); //Deep copy
        car2.year = 2023;

//        car car2 = car1; // Shallow copy

        System.out.println("Printing address of car1: " + car1);
        System.out.println("Printing address of car2: " + car2);
        System.out.println(" ");
        System.out.println(car1.getName() +" "+ car1.getModel() +" "+ car1.getYear());
        System.out.println(car2.getName() +" "+ car2.getModel() +" "+ car2.getYear());
    }
}