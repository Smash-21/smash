import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

class IshaPrimeClient 
{
    public static void main(String args[])   
    {
        try
        {
            Socket cs = new Socket("LocalHost", 8420); 
            
            BufferedReader infu = new BufferedReader(new InputStreamReader(System.in)); 

            System.out.println("Enter a number : ");

            int a = Integer.parseInt(infu.readLine());  

            DataOutputStream out = new DataOutputStream(cs.getOutputStream());   

            out.writeInt(a);

            DataInputStream in = new DataInputStream(cs.getInputStream()); 
            
            System.out.println(in.readUTF());
            
            cs.close();          }
        catch(Exception e)
        {
            System.out.println(e.toString()); 
        }
    }
}