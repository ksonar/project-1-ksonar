package Amazon;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonStreamParser;
import com.google.gson.stream.JsonReader;

public class AmazonSearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(args.length != 4) {
			System.out.println("java usage : -reviews <review_file_name> -qa <qa_file_name>");
		}
		long sTime = System.currentTimeMillis();
		String reviewFile = args[1];
		String qaFile = args[3];
		Processing p = new Processing(reviewFile, qaFile);
		
		System.out.println("Processing done.....\n");
		
		p.findAsin("B000C12GH2");
		long eTime = System.currentTimeMillis();
		System.out.println("\n\nTotal exec time : " + (eTime-sTime)/1000);
		//userInput();
		
		
		//Processing p = new Processing(reviewFile, qaFile);

	}
	
	public static void userInput() {
		System.out.println("Enter operation!! : ");
		Scanner sc = new Scanner(System.in);
		String input;
		while ( !(input = sc.nextLine()).equals("exit") ) {
			System.out.println("INPUT : "+input);
		}
		System.exit(1);
	}

}