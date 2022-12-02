package Filemerge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindMaxOccurrenceOfWordDemo {
	
	static void getWords(String fileName, Map<String,Integer> words) throws FileNotFoundException{
		Scanner file = new Scanner(new File(fileName));
		while(file.hasNext()) {
			String word = file.next();
			Integer count = words.get(word);
			if (count !=null) {
				count ++;
			}
			else
				count =1 ;
			words.put(word, count);
		}
		file.close();
	}
	static int getMaxOccurrence(Map<String, Integer>words) {
		int max = 1 ;
		for (Entry<String, Integer> word:words.entrySet()) {
			if (word.getValue() == max) {
				max = word.getValue();
			}
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String,Integer> words = new HashMap <String,Integer>();
		getWords("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\Page5.txt", words);
		int max = getMaxOccurrence(words);
		PrintWriter out = new PrintWriter("F:\\IT VEDANT\\MITHI SOFTWARE TECHNOLOGIES PVT LTD\\New folder\\final.txt");
		
		for(Entry<String,Integer> word:words.entrySet()) {
			if(word.getValue() == max) {
				System.out.println(word);
				out.print(word);
				out.close();
				
			}
		}

	}

}
