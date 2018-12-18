import java.io.*;
class files_try
{
	public static void main(String xxx[])
	{
		File f=new File("D:\DCIM");
		try
		{
			FileOutputStream fout=new FileOutputStream(f);
			String s="hello world!";
			char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++)
			{
				fout.write(ch[i]);
			}
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}