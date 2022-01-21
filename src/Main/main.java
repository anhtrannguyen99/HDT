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
import Entity.ConverQuestionSubList;
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
		
		
		MultipleQuestion mulQues = new MultipleQuestion();
		ConverQuestion converQues = new ConverQuestion();
		
		IncompleteQuestion incompleQues = new IncompleteQuestion();
		int choose;
		int choseQuyen;
		
		ConverQuestionList listConverQuestion = new ConverQuestionList();
		IncompleteQuestionList listIncompleteQuestion = new IncompleteQuestionList();
		MultipleQuestionList listMulQuestion = new MultipleQuestionList();
		
		ResultList resultList = new ResultList();
	
		StringBuilder que = new StringBuilder("");
		do {
			
			
		//admin
		System.out.print("Choose quyen: ");
		choseQuyen = scanner.nextInt(); 
		switch(choseQuyen) {
		case 1: {
			System.out.print("Chon: ");
			int chon = scanner.nextInt(); 

			switch(chon) {
			case 1: {
				StringBuilder url = new StringBuilder(urlRoot + "\\MultipleChoice\\");
				
				File folder = new File(url.toString());

				ArrayList<String> urls = file.listFilesForFolder(folder);

				System.out.println("Nhap cau hoi: ");
				ArrayList<String> ques = new ArrayList<String>();
				ques.add(scanner.nextLine());
				System.out.print("A: ");
				ques.add("A." + scanner.nextLine());
				System.out.print("B: ");
				ques.add("B." + scanner.nextLine());
				System.out.print("C: ");
				ques.add("C." + scanner.nextLine());
				System.out.print("D: ");
				ques.add("D." + scanner.nextLine());
				ques.add("Correct");
				System.out.print("Dap an dung: ");
				ques.add(scanner.nextLine());
				System.out.print("Giai thich: ");
				ques.add(scanner.nextLine());
				file.writeFileQuestion(url.toString(), "MC"+urls.size() , ques);
			}	break;
			case 2: {
				StringBuilder url = new StringBuilder(urlRoot + "\\Conservation\\");
				System.out.print("Nhap level: ");
				int level = scanner.nextInt();
				scanner.nextLine();
				switch(level) {
				case 1: url.append("Easy\\"); break;
				case 2: url.append("High\\"); break;
				}
				File folder = new File(url.toString());

				ArrayList<String> urls = file.listFilesForFolder(folder);
				
				scanner.nextLine();
				System.out.println("Doan van: ");
				ArrayList<String> ques = new ArrayList<String>();
				ques.add(scanner.nextLine());
				System.out.print("Muon them bao nhieu cau hoi? ");
				int count = scanner.nextInt();
				for(int i=0; i<count; i++) {
					System.out.print("Cau hoi: " + i+1);
					ques.add("A." + scanner.nextLine());
					System.out.print("A: ");
					ques.add("A." + scanner.nextLine());
					System.out.print("B: ");
					ques.add("B." + scanner.nextLine());
					System.out.print("C: ");
					ques.add("C." + scanner.nextLine());
					System.out.print("D: ");
					ques.add("D." + scanner.nextLine());
					ques.add("Correct");
					System.out.print("Dap an dung: ");
					ques.add(scanner.nextLine());
				}
				
				file.writeFileQuestion(url.toString(), "CONVER"+urls.size() , ques);
			}break;
			
			case 3:
				{
					StringBuilder url = new StringBuilder(urlRoot + "\\Incomplete\\");
					File folder = new File(url.toString());
					
					System.out.print("Nhap level: ");
					int level = scanner.nextInt();
					scanner.nextLine();
					switch(level) {
					case 1: url.append("Easy\\"); break;
					case 2: url.append("High\\"); break;
					}
					ArrayList<String> urls = file.listFilesForFolder(folder);
					
					scanner.nextLine();
					System.out.println("Doan van: ");
					ArrayList<String> ques = new ArrayList<String>();
					ques.add(scanner.nextLine());
					System.out.print("Muon them bao nhieu cau hoi? ");
					int count = scanner.nextInt();
					for(int i=0; i<count; i++) {
						System.out.println("Cau hoi: " + i+1);
						System.out.print("A: ");
						ques.add("A." + scanner.nextLine());
						System.out.print("B: ");
						ques.add("B." + scanner.nextLine());
						System.out.print("C: ");
						ques.add("C." + scanner.nextLine());
						System.out.print("D: ");
						ques.add("D." + scanner.nextLine());
						ques.add("Correct");
						System.out.print("Dap an dung: ");
						ques.add(scanner.nextLine());
					}
					
					file.writeFileQuestion(url.toString(), "CONVER"+urls.size() , ques);
				}break;
			}
			}break;
			
		case 2: {
			/////user
				System.out.print("Choose: ");
				choose = scanner.nextInt(); 
				    
				   
				    switch(choose) {
						case 1: {
							StringBuilder url = new StringBuilder(urlRoot);
							url.append(TypeQuestion.MultipleChoice).toString();
							
							File folder = new File(url.toString());
							
							ArrayList<String> urls = file.listFilesForFolder(folder);
							
							for(String s : urls) {
								mulQues = new MultipleQuestion();
								mulQues = file.readFileMul(s);
								listMulQuestion.add(mulQues);
							}
							scanner.nextLine();

							for(MultipleQuestion m : listMulQuestion.getMultipleQuestionList()) {

								System.out.println(m.getQuestion());
								System.out.println(m.getMultipleAnswer().getAnsA());
								System.out.println(m.getMultipleAnswer().getAnsB());
								System.out.println(m.getMultipleAnswer().getAnsC());
								System.out.println(m.getMultipleAnswer().getAnsD());

								System.out.print("Chọn đáp án: ");
								Result result = new Result();
								result.setAnsCorrect(m.getMultipleAnswer().getAnsCorrect());
								result.setPoint(10);
								result.setChoose(scanner.nextLine());
								System.out.println("Dap an dung: " + m.getMultipleAnswer().getAnsCorrect());
								System.out.println("Giai thich: " + m.getNote());
								if(!result.getChoose().equals(result.getAnsCorrect())) {
									result.setPoint(0);
								}
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
								converQues = new ConverQuestion();
								converQues = file.readFile(s) ;
								listConverQuestion.add(converQues);
							}
							scanner.nextLine();

							for(ConverQuestion m : listConverQuestion.getConverQuestionList()) {
								System.out.println(m.getQuestion());
								for(ConverAnswer qsub : m.getConverQuestionSubList().getConverQuestionList()) {
									System.out.println("\n");

									System.out.println(qsub.getSubQues());
									System.out.println(qsub.getAnsA());
									System.out.println(qsub.getAnsB());
									System.out.println(qsub.getAnsC());	
									System.out.println(qsub.getAnsD());	
									System.out.print("Chọn đáp án: ");
									Result result = new Result();
									result.setAnsCorrect(qsub.getAnsCorrect());
									result.setPoint(10);
									result.setChoose(scanner.nextLine());
									System.out.println("Dap an dung: " + qsub.getAnsCorrect());
									if(!result.getChoose().equals(result.getAnsCorrect())) {
										result.setPoint(0);
									}
									resultList.add(result);
								}
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
										incompleQues = new IncompleteQuestion();

										incompleQues = file.readFileIncomplete(s);
										listIncompleteQuestion.add(incompleQues);
									}
									scanner.nextLine();

									for(IncompleteQuestion m : listIncompleteQuestion.getIncompleteQuestionList()) {
										System.out.println(m.getQuestion());
										System.out.println("\n");

										for(IncompletedAnswer qsub : m.getAnswerList().getIncompletedAnswerList()) {
											System.out.println("\n");

											System.out.println(qsub.getAnsA());
											System.out.println(qsub.getAnsB());
											System.out.println(qsub.getAnsC());	
											System.out.println(qsub.getAnsD());	
											System.out.print("Chọn đáp án: ");
											

											Result result = new Result();
											result.setAnsCorrect(qsub.getAnsCorrect());
											result.setPoint(10);
											result.setChoose(scanner.nextLine());
											System.out.println("Dap an dung: " + qsub.getAnsCorrect());
											if(!result.getChoose().equals(result.getAnsCorrect())) {
												result.setPoint(0);
											}
											resultList.add(result);
										}

									}
								}
								
								break;
								case 2: 
								{
									url.append("\\"); 
									url.append(Level.High); 
									File folder = new File(url.toString());

									ArrayList<String> urls = file.listFilesForFolder(folder);
									scanner.nextLine();

									for(String s : urls) {
										incompleQues = new IncompleteQuestion();
										incompleQues = file.readFileIncomplete(s.toString());
										listIncompleteQuestion.add(incompleQues);
									}
									for(IncompleteQuestion m : listIncompleteQuestion.getIncompleteQuestionList()) {
										System.out.println(m.getQuestion());
										for(IncompletedAnswer qsub : m.getAnswerList().getIncompletedAnswerList()) {
											System.out.println("\n");

											System.out.println(qsub.getAnsA());
											System.out.println(qsub.getAnsB());
											System.out.println(qsub.getAnsC());	
											System.out.println(qsub.getAnsD());	
											System.out.print("Chọn đáp án: ");
											

											Result result = new Result();
											result.setAnsCorrect(qsub.getAnsCorrect());
											result.setPoint(10);
											result.setChoose(scanner.nextLine());
											System.out.println("Dap an dung: " + qsub.getAnsCorrect());
											if(!result.getChoose().equals(result.getAnsCorrect())) {
												result.setPoint(0);
											}
											resultList.add(result);
										}
									}
								}break;
							}
						}break;
						
						case 4: {
							StringBuilder str = new StringBuilder("Ket Qua: \n");
							int point = 0;
							for(Result r : resultList.getResults()) {
								str.append(r.getChoose());
								str.append("\t");
								str.append(r.getAnsCorrect());
								str.append("\t");
								str.append(r.getPoint());
								str.append("\n");
								point+=r.getPoint();
							}
							str.append("================\n");
							str.append("Tong diem: " + point);

							StringBuilder url = new StringBuilder(urlRoot);
							System.out.println(str);		
							file.writeFile(url.toString(), "test", resultList);
						}break;
						
							
						
				    }	
					}break;
			
			}
		
		
		
		
	
	
		
		    
		
		

		}while(choseQuyen!=0);
		
		
	
	}
}
