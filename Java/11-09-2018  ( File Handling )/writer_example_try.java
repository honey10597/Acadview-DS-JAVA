package java_acadview;
import java.io.*;
public class writer_example_try {

	public static void main(String[] args) throws IOException{
		Writer w=new FileWriter("C:/Users/Honey/Desktop/file_handling/file1.txt");
		String s="hello world ";
		w.write(s);
		w.close();
	}

}
