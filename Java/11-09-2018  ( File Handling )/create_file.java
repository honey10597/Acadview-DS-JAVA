package java_acadview;
import java.io.*;

public class create_file {

	public static void main(String[] args) {
		File f=new File("C:/Users/Honey/Desktop/file_handling/text.txt");
		if(!f.exists())
		{
			try
			{
				{
					f.createNewFile();
			       System.out.println("file created");
			    }
			}
		    catch(IOException e)
		    {
			     System.out.println(e);
		    }
		}
	}

}
