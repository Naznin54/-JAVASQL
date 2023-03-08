package arr;
import java.io.FileOutputStream;

public class FileOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("D:\\test.txt");
			fout.write(70);
			fout.close();
			System.out.println("Sucess");
		}
		catch(Exception e) 
		{System.out.println(e);
		}
	}
}
	