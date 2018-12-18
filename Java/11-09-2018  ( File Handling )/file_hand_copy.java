package java_acadview;
import java.io.*;
public class file_hand_copy {

	public static void main(String[] args) throws IOException{
		
		File f=new File("C:/Users/Honey/Desktop/file_handling/file2.txt");
		
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileOutputStream fout=new FileOutputStream(f);
		String s="this data is from file2";
		char ch[]=s.toCharArray();
		int i=0;
		for(i=0;i<s.length();i++)
		{
			fout.write(ch[i]);
		}
				fout.close();
				File fn=new File("C:/Users/Honey/Desktop/file_handling/file30.txt");
				FileInputStream fin=new FileInputStream(f);
				i=fin.read();
				String s1="";
				while(i!=-1)
				{
					s1=s1+(char)i;
					i=fin.read();
				}
				
				fin.close();
				
				FileOutputStream fo2=new FileOutputStream(fn);
				char chn[]=s1.toCharArray();
				for(i=0;i<s1.length();i++)
				{
					fo2.write(chn[i]);
				}
				fo2.close();

	}

}
