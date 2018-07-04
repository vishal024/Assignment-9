import java.io.File;
class Reader
{
   public static void main(String[] args)
   {
     fileReader fi=new fileReader("C:/File/vishal/new/abc.txt");
     int i;
     while((i=fi.read())!=-1)
      {
          System.out.print("content of file is:"+(char)i);
    }
}
}