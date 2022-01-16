package Entity;

import java.util.ArrayList;
import java.util.List;

public class QuestionList {
	public ArrayList<Question> listQuestion = new ArrayList<Question>();
	
	public void addQuestion(Question qes) {
		listQuestion.add(qes);
	}

	public ArrayList<Question> getListQuestion() {
		return listQuestion;
	}

	public void setListQuestion(ArrayList<Question> listQuestion) {
		this.listQuestion = listQuestion;
	}

	public QuestionList(ArrayList<Question> listQuestion) {
		super();
		this.listQuestion = listQuestion;
	}

	public QuestionList() {
		super();
	}
	
	
	
}
