package Entity;

import java.util.ArrayList;

public class IncompleteQuestionList {
	public ArrayList<IncompleteQuestion> incompleteQuestionList = new ArrayList<IncompleteQuestion>();

	public void add(IncompleteQuestion incompleteQuestion) {
		incompleteQuestionList.add(incompleteQuestion);
	}
	public IncompleteQuestionList(ArrayList<IncompleteQuestion> incompleteQuestionList) {
		super();
		this.incompleteQuestionList = incompleteQuestionList;
	}

	public IncompleteQuestionList() {
		super();
	}

	public ArrayList<IncompleteQuestion> getIncompleteQuestionList() {
		return incompleteQuestionList;
	}

	public void setIncompleteQuestionList(ArrayList<IncompleteQuestion> incompleteQuestionList) {
		this.incompleteQuestionList = incompleteQuestionList;
	}
	
	

}
