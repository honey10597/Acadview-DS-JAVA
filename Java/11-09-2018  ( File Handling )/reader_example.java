package java_acadview;
import java.io.*;
public class reader_example {

	public static void main(String[] args) {
		try {  
            Reader r = new FileReader("A.txt");  
            int data = r.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = r.read();  
            }  
            r.close();  
        } catch (Exception ex) {  
            System.out.println(ex); }
	}

}
