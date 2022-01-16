package Entity;

import java.util.ArrayList;

public class ConverQuestionSubList {
	public ArrayList<ConverAnswer> converAnswerList = new ArrayList<ConverAnswer>();

	public void add(ConverAnswer a) {
		converAnswerList.add(a);
	}
	
	public ConverQuestionSubList() {
		super();
	}

	public ConverQuestionSubList(ArrayList<ConverAnswer> converAnswerList) {
		super();
		this.converAnswerList = converAnswerList;
	}

	public ArrayList<ConverAnswer> getConverQuestionList() {
		return converAnswerList;
	}

	public void setConverQuestionList(ArrayList<ConverAnswer> converAnswerList) {
		this.converAnswerList = converAnswerList;
	}
}
