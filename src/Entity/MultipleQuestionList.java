package Entity;

import java.util.ArrayList;

public class MultipleQuestionList {
	public ArrayList<MultipleQuestion> multipleQuestionList = new ArrayList<MultipleQuestion>();
	
	public void add (MultipleQuestion multipleQuestion) {
		multipleQuestionList.add(multipleQuestion);
	}
	

	public MultipleQuestionList() {
		super();
	}

	public MultipleQuestionList(ArrayList<MultipleQuestion> multipleQuestionList) {
		super();
		this.multipleQuestionList = multipleQuestionList;
	}

	public ArrayList<MultipleQuestion> getMultipleQuestionList() {
		return multipleQuestionList;
	}

	public void setMultipleQuestionList(ArrayList<MultipleQuestion> multipleQuestionList) {
		this.multipleQuestionList = multipleQuestionList;
	}
	
	
}
