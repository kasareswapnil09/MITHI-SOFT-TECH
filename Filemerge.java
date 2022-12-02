package Filemerge;
import java.io.*;

public class Filemerge {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1 = new FileInputStream("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page1.txt");
		FileInputStream f2 = new FileInputStream("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page2.txt");
		//FileInputStream f3 = new FileInputStream("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page3.txt");
		FileOutputStream fout = new FileOutputStream("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page4.txt");
		SequenceInputStream comb = new SequenceInputStream(f1,f2);
		
		int j;
		while((j=comb.read())!= -1)
		{
			fout.write(j);
		}
		comb.close();
		f1.close();
		f2.close();
		//f3.close();
		fout.close();

	}

}
