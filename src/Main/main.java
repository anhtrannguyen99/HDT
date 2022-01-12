package Main;

import java.sql.Connection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import HandleFile.HandleFile;


public class main {
	

    
 
	public static void main(String args[]) throws IOException {

		HandleFile file = new HandleFile();
		
//		file.readFile("D:\\hdt\\", "test");
		
		final File folder = new File("D:\\hdt\\E-sys");
		file.listFilesForFolder(folder);
		
		
		 
	 }
}
