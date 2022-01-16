package Main;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


import Entity.ConverAnswer;
import Entity.ConverQuestion;
import Entity.ConverQuestionList;
import Entity.IncompleteQuestion;
import Entity.IncompleteQuestionList;
import Entity.IncompletedAnswer;
import Entity.Level;
import Entity.MultipleAnswer;
import Entity.MultipleQuestion;
import Entity.MultipleQuestionList;
import Entity.Question;
import Entity.QuestionList;
import Entity.Result;
import Entity.ResultList;
import Entity.TypeQuestion;
import Entity.TypeQuestions;
import HandleFile.HandleFile;


public class main {

 
	public static void main(final String args[]) throws IOException {

		Scanner scanner = new Scanner(System.in);
		HandleFile file = new HandleFile();
		String urlRoot = "D:\\hdt\\E-sys\\";
		//

		
		
		MultipleQuestion mulQues = new MultipleQuestion();
		ConverQuestion converQues = new ConverQuestion();
		
		IncompleteQuestion incompleQues = new IncompleteQuestion();
		int choose;
		
		ConverQuestionList listConverQuestion = new ConverQuestionList();
		IncompleteQuestionList listIncompleteQuestion = new IncompleteQuestionList();
		MultipleQuestionList listMulQuestion = new MultipleQuestionList();
		
		ResultList resultList = new ResultList();
		
		do {
			System.out.print("Choose: ");
			choose = scanner.nextInt(); 
		    
		   
		    switch(choose) {
				case 1: {
					StringBuilder url = new StringBuilder(urlRoot);
					url.append(TypeQuestion.MultipleChoice).toString();
					
					File folder = new File(url.toString());
					
					ArrayList<String> urls = file.listFilesForFolder(folder);
					
					for(String s : urls) {
						mulQues = file.readFileMul(s);
						listMulQuestion.add(mulQues);
					}
					
					for(MultipleQuestion m : listMulQuestion.getMultipleQuestionList()) {
						System.out.print("Chọn đáp án: ");
						Result result = new Result();
						result.setAnsCorrect(m.getAnsCorrect());
						result.setPoint(10);
						result.setChoose(scanner.nextLine());
						resultList.add(result);
					}
				}break;
				
				case 2: {
					StringBuilder url = new StringBuilder(urlRoot);
					url.append(TypeQuestion.Conservation).toString();
					url.append("\\");
					
					int level;
					System.out.print("level: ");
					level = scanner.nextInt();
					switch(level) {
						case 1: url.append(Level.Easy); break;
						case 2: url.append(Level.High); break;
					}
					
					File folder = new File(url.toString());

					ArrayList<String> urls = file.listFilesForFolder(folder);
				
					for(String s : urls) {
						converQues = file.readFile(s) ;
						listConverQuestion.add(converQues);
					}
					
					for(ConverQuestion m : listConverQuestion.getConverQuestionList()) {
						System.out.print("Chọn đáp án: ");
						Result result = new Result();
						result.setAnsCorrect(m.getAnsCorrect());
						result.setPoint(10);
						result.setChoose(scanner.nextLine());
						resultList.add(result);
					}

					}break;
					
				case 3: {
					StringBuilder url = new StringBuilder(urlRoot);
					url.append(TypeQuestion.Incomplete).toString();
					
					int level;
					System.out.print("level: ");
					level = scanner.nextInt();
					switch(level) {
						case 1: {
							url.append("\\"); 
							url.append(Level.Easy); 
							File folder = new File(url.toString());

							ArrayList<String> urls = file.listFilesForFolder(folder);

							for(String s : urls) {
								incompleQues = file.readFileIncomplete(url.toString());
								listIncompleteQuestion.add(incompleQues);
							}
							for(IncompleteQuestion m : listIncompleteQuestion.getIncompleteQuestionList()) {
								System.out.print("Chọn đáp án: ");
								Result result = new Result();
								result.setAnsCorrect(m.getAnsCorrect());
								result.setPoint(10);
								result.setChoose(scanner.nextLine());
								resultList.add(result);
							}
						}
						
						break;
						case 2: 
						{
							url.append("\\"); 
							url.append(Level.High); 
							File folder = new File(url.toString());
	
							ArrayList<String> urls = file.listFilesForFolder(folder);
	
							for(String s : urls) {
								incompleQues = file.readFileIncomplete(url.toString());
								listIncompleteQuestion.add(incompleQues);
							}
							for(IncompleteQuestion m : listIncompleteQuestion.getIncompleteQuestionList()) {
								System.out.print("Chọn đáp án: ");
								Result result = new Result();
								result.setAnsCorrect(m.getAnsCorrect());
								result.setPoint(10);
								result.setChoose(scanner.nextLine());
								resultList.add(result);
							}
						}break;
					}
				}break;
				
				case 4: {
					StringBuilder str = new StringBuilder("Ket Qua: \n");
					for(Result r : resultList.getResults()) {
						str.append(r.getChoose());
						str.append("\t");
						str.append(r.getAnsCorrect());
						str.append("\t");
						str.append(r.getPoint());
						str.append("\n");
						
					}
					
					StringBuilder url = new StringBuilder(urlRoot);
										
					file.writeFile(url.toString(), "test");
				}break;
				
					
				
		    }	
		    
		}while(choose!=0);
		

		
		
		
	
	}
}
