import java.io.*;
import java.io.File;
import java.io.IOException;
class Reader
{
   public static void main(String[] args)throws IOException 
   {
     File f=new File("C:\\devraj\\juile\\ab.txt");
     f.createNewFile();
     System.out.println(f.exists());
     FileReader r=new FileReader(f);
     int i;
     i=r.read();
     while(i!=-1)
    {
       System.out.print((char)i);
       i=r.read();
     }
     System.out.println();
     System.out.println("Path of file is:"+f.getAbsolutePath());
    }
      
}