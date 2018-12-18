package java_acadview;
import java.io.*;
/// creatin a file and adding data in file and reading data
public class files_hand {

	public static void main(String[] args) throws IOException{
		File f=new File("C:/Users/Honey/Desktop/file_handling/file1.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileOutputStream fout=new FileOutputStream(f);
		String s="this is data of file1";
		char ch[]=s.toCharArray();
		int i=0;
		for(i=0;i<s.length();i++)
		{
			fout.write(ch[i]);
		}
		fout.close();
		FileInputStream fin=new FileInputStream(f);
		i=fin.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			
			i=fin.read();
		}
	}

}
