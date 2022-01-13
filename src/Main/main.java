package Main;


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

import Entity.ConverAnswer;
import Entity.IncompletedAnswer;
import Entity.MultipleAnswer;
import Entity.Question;
import Entity.TypeQuestions;
import HandleFile.HandleFile;


public class main {
	

    
 
	public static void main(String args[]) throws IOException {

		Scanner scanner = new Scanner(System.in);
		HandleFile file = new HandleFile();
		StringBuilder urlRoot = new StringBuilder("D:\\hdt\\E-sys");
		//
		ConverAnswer conAns = new ConverAnswer();
		IncompletedAnswer incomAns = new IncompletedAnswer();
		MultipleAnswer mulAns = new MultipleAnswer();
		//
		List<ConverAnswer> listConAns = new ArrayList<ConverAnswer>();
		List<IncompletedAnswer> listIncomAns = new ArrayList<IncompletedAnswer>();
		
		
		
		
		
	
	}
}
