package Filemerge;
import java.io.*;
import java.util.Scanner;

public class ReadNSearchFile {
	
	private static Scanner x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page5.txt";
		String str2 = str.replaceAll("and\r\n"
				+ "or\r\n"
				+ "&\r\n"
				+ "of\r\n"
				+ "to\r\n"
				+ "is\r\n"
				+ "the\r\n"
				+ "a\r\n"
				+ "are\r\n"
				+ "in\r\n"
				+ "", " ");
		System.out.println();
		
		

	}

}
