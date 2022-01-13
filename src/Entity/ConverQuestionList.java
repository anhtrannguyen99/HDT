package Entity;

import java.util.ArrayList;

public class ConverQuestionList {
	private ArrayList<ConverAnswer> converAnswerList;

	public ConverQuestionList() {
		super();
	}

	public ConverQuestionList(ArrayList<ConverAnswer> converAnswerList) {
		super();
		this.converAnswerList = converAnswerList;
	}

	public ArrayList<ConverAnswer> getConverAnswerList() {
		return converAnswerList;
	}

	public void setConverAnswerList(ArrayList<ConverAnswer> converAnswerList) {
		this.converAnswerList = converAnswerList;
	}
	
}
