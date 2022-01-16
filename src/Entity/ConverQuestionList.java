package Entity;

import java.util.ArrayList;

public class ConverQuestionList {
	public ArrayList<ConverQuestion> converQuestionList = new ArrayList<ConverQuestion>();

	public void add(ConverQuestion a) {
		converQuestionList.add(a);
	}
	
	public ConverQuestionList() {
		super();
	}

	public ConverQuestionList(ArrayList<ConverQuestion> converQuestionList) {
		super();
		this.converQuestionList = converQuestionList;
	}

	public ArrayList<ConverQuestion> getConverQuestionList() {
		return converQuestionList;
	}

	public void setConverQuestionList(ArrayList<ConverQuestion> converQuestionList) {
		this.converQuestionList = converQuestionList;
	}
	
}
