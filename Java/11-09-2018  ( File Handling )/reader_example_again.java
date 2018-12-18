package java_acadview;

import java.io.*;

public class reader_example_again {

	public static void main(String[] args){
		try {
		Reader r1=new FileReader("C:/Users/Honey/Desktop/file_handling/file1.txt");
		int i=0;
		i=r1.read();
		while(i!=0)
		{
			System.out.print((char)i);
			i=r1.read();
		}r1.close();
		}
        catch(IOException e)
		{
        	System.out.println(e);
		}
	}

}
