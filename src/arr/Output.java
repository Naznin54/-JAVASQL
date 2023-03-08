package arr;
import java.io.FileOutputStream;


public class Output {
	public static void main(String[] args) {
	try {
		FileOutputStream fout=new FileOutputStream("D://test.txt");
		fout.write(70);
		fout.close();
		System.out.println("success");
	
	}
	catch(Exception e) 
	{System.out.println(e);
	}
}
}

