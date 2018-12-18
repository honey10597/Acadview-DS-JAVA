import java.io.*;
public class ass9
{
	public static void main(String x[]) throws IOException
	{
		File f= new File("C:/Users/Honey/Desktop/file_handling/new.txt");
		
		
			if(!f.exists())
			{
				f.createNewFile();
			}
			FileInputStream fin=new FileInputStream(f);
		FileOutputStream fout=new FileOutputStream(f);
			int i=0;
			String s="hello world";
			char ch[]=s.toCharArray();
			for(i=0;i<s.length();i++)
			{
				fout.write(ch[i]);
			}
			fout.close();
			i=fin.read();
			while(i!=-1)
			{
				System.out.println(i+" : "+(char)i);
				i=fin.read();
			}
			fin.close();
	}
}

			