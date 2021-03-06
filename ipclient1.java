import java.net.*;
import java.io.*;

class ipclient1 {
    public static void main(String args[]) {
        Socket soc;
        PrintStream ps;
        try
        {
            InetAddress ia=InetAddress.getLocalHost();
            soc=new Socket(ia, 8020);
            ps=new PrintStream(soc.getOutputStream());
            ps.println(ia);
        }
        catch(IOException e) {
            System.out.println("the exception is:"+e);
        }
    }
}
