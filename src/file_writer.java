import java.io.FileWriter;
import java.io.IOException;

public class file_writer
{
    public static void main(String args[])
    {
        try
        {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("This is my file \nand this is a test \nThis is test no. 2\n");
            writer.append("This is append");
            writer.close();
            System.out.println("File succesfully written!");
        }
        catch (IOException e)
        {
//           e.printStackTrace();
            System.out.println("Error face: " + e);
        }
    }
}
