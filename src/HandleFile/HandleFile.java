package HandleFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Entity.ConverAnswer;
import Entity.ConverQuestion;
import Entity.ConverQuestionList;
import Entity.ConverQuestionSubList;
import Entity.IncompleteAnswerList;
import Entity.IncompleteQuestion;
import Entity.IncompletedAnswer;
import Entity.Level;
import Entity.MultipleAnswer;
import Entity.MultipleAnswerList;
import Entity.MultipleQuestion;
import Entity.Question;
import Entity.QuestionList;
import Entity.TypeQuestions;

public class HandleFile {
	
	public ConverQuestion readFile(String url) throws IOException {
		
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        ArrayList<String> s = new ArrayList<String>();
        ConverQuestion test = new ConverQuestion();
        ConverQuestionSubList list = new ConverQuestionSubList();
        String a = "";
        boolean isques = true;
        
        try {
            fileInputStream = new FileInputStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            while (line != null) {
                s.add(line);
                
                if(!line.equals("")) {
                	if(line.equals("/")) {
                    	test.setQuestion(a);
                    	isques = false;
                        line = bufferedReader.readLine();

                    }
                    
                    if(isques && !line.equals("/")) {
                    	a+=line + "\n" ;
                    }else {
                    	ConverAnswer ca = new ConverAnswer();
                    	ca.setSubQues(line);
                        ca.setAnsA(bufferedReader.readLine());
                    	ca.setAnsB(bufferedReader.readLine());
                    	ca.setAnsC(bufferedReader.readLine());
                    	ca.setAnsD(bufferedReader.readLine());
                    	bufferedReader.readLine();
                    	ca.setAnsCorrect(bufferedReader.readLine());
                    	bufferedReader.readLine();
                    	
                    	list.add(ca);
                    }
                
                }
        
                line = bufferedReader.readLine();
            }
            
            test.setConverQuestionSubList(list);
        } catch (FileNotFoundException ex) {
        
        	System.err.println("Messeager error: " + ex);
        	
        } finally {
            bufferedReader.close();
            fileInputStream.close();
        }
		
		return test;
		
	}
	

	public MultipleQuestion readFileMul(String url) throws IOException {
		
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        ArrayList<String> s = new ArrayList<String>();
        MultipleQuestion test = new MultipleQuestion();
        MultipleAnswerList list = new MultipleAnswerList();
        String a = "";
        boolean isques = true;
        
        try {
            fileInputStream = new FileInputStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            MultipleAnswer answer = new MultipleAnswer();

            while (line != null) {
                s.add(line);
                if(!line.equals("")) {
                    test.setQuestion(line);
                    answer.setAnsA(bufferedReader.readLine());
                    answer.setAnsB(bufferedReader.readLine());
                    answer.setAnsC(bufferedReader.readLine());
                    answer.setAnsD(bufferedReader.readLine());
                    bufferedReader.readLine();
                    answer.setAnsCorrect(bufferedReader.readLine());
                    
                    test.setMultipleAnswer(answer);
                    test.setNote(bufferedReader.readLine());
                }
          
                line = bufferedReader.readLine();
            }
            
            test.setMultipleAnswer(answer);
            
        } catch (FileNotFoundException ex) {
        
        	System.err.println("Messeager error: " + ex);
        	
        } finally {
            bufferedReader.close();
            fileInputStream.close();
        }
		
		return test;
		
	}
	
	public IncompleteQuestion readFileIncomplete(String url) throws IOException {
		
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        ArrayList<String> s = new ArrayList<String>();
        IncompleteQuestion test = new IncompleteQuestion();
        IncompleteAnswerList list = new IncompleteAnswerList();
        String a = "";
        boolean isques = true;
        
        try {
            fileInputStream = new FileInputStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            while (line != null) {
                s.add(line);
                
                if(!line.equals("")) {

                	if(line.equals("/")) {
                    	test.setQuestion(a);
                    	isques = false;
                        line = bufferedReader.readLine();

                    }
                    
                    if(isques && !line.equals("/")) {
                    	a+=line + "\n" ;
                    }else {
                    	IncompletedAnswer ca = new IncompletedAnswer();
//                    	ca.setSubQues(line);
                        ca.setAnsA(bufferedReader.readLine());
                    	ca.setAnsB(bufferedReader.readLine());
                    	ca.setAnsC(bufferedReader.readLine());
                    	ca.setAnsD(bufferedReader.readLine());
                    	bufferedReader.readLine();
                    	ca.setAnsCorrect(bufferedReader.readLine());
                    	bufferedReader.readLine();
                    	
                    	list.add(ca);
                    }
                	
                }
        
                line = bufferedReader.readLine();
            }
            
            test.setAnswerList(list);
        } catch (FileNotFoundException ex) {
        
        	System.err.println("Messeager error: " + ex);
        	
        } finally {
            bufferedReader.close();
            fileInputStream.close();
        }
		
		return test;
		
	}
	
	
	
	public String writeFile(String url, String nameFile) throws IOException {
		 FileWriter writer = new FileWriter("D:\\hdt\\" + nameFile + ".txt");
	        BufferedWriter buffer = new BufferedWriter(writer);
	        buffer.write("Welcome to java.");
	        buffer.close();
	        System.out.println("Success...");
	        return "";
	}
	
	String name="";
	String muc = "";
	int count=1;
//	ArrayList<TypeQuestions> s = new ArrayList<TypeQuestions>();

	public ArrayList<String> listFilesForFolder(final File folder) {
		ArrayList<String> s = new ArrayList<String>();
		for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	           listFilesForFolder(fileEntry);
	        } else 
	        {
	        	s.add(fileEntry.getPath());
	        }
	    }
	    return s;
	    
	}
	
}
