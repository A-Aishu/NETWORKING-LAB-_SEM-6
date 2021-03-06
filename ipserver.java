import java.net.*;
import java.io.*;
import java.util.*;

class ipserver
{
public static void main(String args[])
{
ServerSocket ss;
Socket s;
DataInputStream dis;
String inet;
try
{
ss=new ServerSocket(8020);
while(true)
{
s=ss.accept();
dis=new DataInputStream(s.getInputStream());
inet=dis.readLine();
System.out.println("the client system address is: "+inet);
}
}
catch(IOException e)
{
System.out.println("the exception is:"+e);
}
}
}



  