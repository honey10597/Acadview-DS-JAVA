package java_acadview;
import java.io.*;
public class files2_assignment10 {

	public static void main(String[] args) 
	{
		File f1=new File("C:/Users/Honey/Desktop/file_handling/text.txt");
		File f2=new File("C:/Users/Honey/Desktop/file_handling/text2.txt"
				+ "");
		try
		{
			FileInputStream fin=new FileInputStream(f1);
		    FileOutputStream fout=new FileOutputStream(f2);
		    int i;
		    i=fin.read(); // reading the contnt of file and return type is int
		    while(i!=-1)
		    {
		    	System.out.println(i+" : "+(char)i);
		    	fout.write((char)i);// writing the content of file 1 in 2
		    	i=fin.read();
		    }
		    fin.close();  
		    fout.close();
		}
		
		    catch(IOException e)
		    {
		    	System.out.println(e);
		    }
		}

	}
