public class Nested_Classes
{
    public static void main(String args[])
    {
        outside out = new outside();
        outside.inside in = out.new inside();
        System.out.println(out.str);
        System.out.println(in.str);
        in.show();
    }
}
class outside
{
    String str ="This is outside";
    class inside
    {
        String str = "This is inside";
        public void show()
        {
            System.out.println("HELLO THERE!");
        }
    }
}
