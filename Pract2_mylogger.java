import java.io.*; 
import java.util.logging.*; 
public class Pract2_mylogger
{
public static void main(String args[])
{
Logger l=Logger.getLogger(mylogger.class.getName());
 FileHandler fh;
try
{
fh=new FileHandler("c:/Users/Jyoti/mylogfile.log",true); l.addHandler(fh);
l.setLevel(Level.ALL);
 SimpleFormatter sf=new SimpleFormatter(); 
fh.setFormatter(sf);
l.info("My first log");
}
catch(SecurityException e)
{
e.printStackTrace();
}
 
catch(IOException e)
{
e.printStackTrace();
}
l.info("Hi How r u?");
}
}









