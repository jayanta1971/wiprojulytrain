package com.wipro.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		 
		String inputFileName="d://java_logo.jpg";
		String outputFileName="d://javalogo_new.jpg";
		
		try {
			FileInputStream fi= new FileInputStream(inputFileName);
			FileOutputStream fo=new FileOutputStream(outputFileName);
			byte[] buffer= new byte[1024];
			int byteRead=0;
			
			try {
				while((byteRead=fi.read(buffer))!=-1)
				{
					fo.write(buffer, 0, byteRead);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
