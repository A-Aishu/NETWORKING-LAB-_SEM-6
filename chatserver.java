import java.net.*;
import java.io.*;
import java.util.*;
public class chatserver extends Thread
{
public static void main(String args[]) throws Exception
{
ServerSocket ssocket=new ServerSocket(4000);
Socket csocket=ssocket.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(csocket.getInputStream()));
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(csocket.getOutputStream(),true);
String s,t;
try
{
while(true)
{
System.out.print("Server :");
s=in.readLine();
out.println("Server : "+s);
System.out.println(br.readLine());
}
}
catch(IOException e)
{
System.out.println("Connection to cline is reset---");
}
}
}
