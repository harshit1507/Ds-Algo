import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\temp\\testFile.txt");
		File file1 = new File("D:\\temp\\testFile1.harshit");
		FileWriter fw = new FileWriter(file,true); // create file if doesn't exist
		FileWriter fw1 = new FileWriter(file1,true);
		String name = "My name is Harshit Agarwal";
		fw.write(name);
		fw.write("\n");
		fw.write(110);
		fw.write("\n");
		fw.write('h');
		fw.write("\n");
		
		String name1 = "My name is Harshit Agarwal";
		fw1.write(name1);
		fw1.write("\n");
		fw1.write(110);
		fw1.write("\n");
		fw1.write('h');
		fw1.write("\n");
		fw1.flush();
		fw1.close();
		
		
		char ch[] = {'a','b','c','d'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();  // sometime data not written properly so use flush to empty file writer stream into file
		fw.close();
		
		
		FileReader fr = new FileReader(file);	// reads char by char and returns -1 at EOF
		FileReader fr1 = new FileReader(file1);
		int ele = fr1.read();
		while(ele!=-1)
		{
			System.out.print((char)ele);
			ele = fr1.read();
		}
		fr1.close();
		
		
//		char chr[] = new char[(int)file.length()];
//		fr.read(chr);
//		for(char c : chr)
//			System.out.print(c);
//		
		fr.close();
	}

}
