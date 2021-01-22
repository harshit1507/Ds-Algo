import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("D:\\temp\\testFile3.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.print('c');
		pw.print(100);
		pw.println("My name is Harshit Agarwal");
		pw.println(true);
		pw.println(1002.3243);
		pw.flush();
		pw.close();
	}

}
