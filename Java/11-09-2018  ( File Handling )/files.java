import java.io.*;
public class files {
  public static void main(String[] args) {
    /*File f=new File("C:/Users/Honey/Desktop/file_handling/text_file.txt");
    System.out.println(f.exists());
    System.out.println(f.getName());
    System.out.println(f.length());
    System.out.println(f.canRead());
    System.out.println(f.canWrite());
    System.out.println(f.getPath());
    System.out.println(f.getParent());
    System.out.println(f.isFile());
    System.out.println(f.isDirectory());
	*/
	File f=new File("C:/Users/Honey/Desktop/file_handling");
	for(String s:f.list())// to check the file in a file
	{
		System.out.println(s);
	}
  }
}