package java_acadview;
import java.io.*;

public class file_handling_try {

	public static void main(String[] args) {
		File f=new File("C:/Users/Honey/Desktop/file_handling");
		//System.out.println(f.exists());
		//System.out.println(f.length());
		//System.out.println(f.getName());
		//System.out.println(f.canRead());
		//System.out.println(f.getParent());//give of location of folder in w/c file is placed 
		//System.out.println(f.getPath());//give full loaction
		//System.out.println(f.canWrite());
		System.out.println(f.isFile());
		//System.out.println(f.isDirectory());
	}

}
