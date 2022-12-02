package Filemerge;
import java.io.*;
public class Filemerge2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f3 = new FileInputStream("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page3.txt");
		FileInputStream f4 = new FileInputStream("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page4.txt");
		FileOutputStream fout2 = new FileOutputStream("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page5.txt");
		SequenceInputStream comb1 = new SequenceInputStream(f3,f4);
		
		int j;
		while((j=comb1.read())!= -1)
		{
			fout2.write(j);
		}
		comb1.close();
		f3.close();
		f4.close();
		fout2.close();


	}

}
