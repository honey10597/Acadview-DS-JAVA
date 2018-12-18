package java_acadview;
import java.io.*;
import java.lang.*;
public class ass9_files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:/Users/Honey/Desktop/file_handling/abc.txt");
		try{
			if(!f.exists())
		{
			f.createNewFile();
		}
		FileOutputStream fout=new FileOutputStream(f);
		FileInputStream fin=new FileInputStream(f);
		String s="hello world";
		char ch[]=s.toCharArray();
		int i=0;
		for(i=0;i<s.length();i++)
		{
			fout.write(ch[i]);
		}
		i=fin.read();
		while(i!=-1) 
		{
			System.out.println(i+" : "+(char)(i));
			i=fin.read();
		}
		fout.close();
		fin.close();
	}
	catch(IOException e)
	{
		System.out.println(e);
		
	}
	}
}
