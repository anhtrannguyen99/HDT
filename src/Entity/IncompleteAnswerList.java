package Entity;

import java.util.ArrayList;

public class IncompleteAnswerList {
	private ArrayList<IncompletedAnswer> incompletedAnswerList;

	public void add (IncompletedAnswer answer) {
		incompletedAnswerList.add(answer);
	}
	public IncompleteAnswerList() {
		super();
	}

	public IncompleteAnswerList(ArrayList<IncompletedAnswer> incompletedAnswerList) {
		super();
		this.incompletedAnswerList = incompletedAnswerList;
	}

	public ArrayList<IncompletedAnswer> getIncompletedAnswerList() {
		return incompletedAnswerList;
	}

	public void setIncompletedAnswerList(ArrayList<IncompletedAnswer> incompletedAnswerList) {
		this.incompletedAnswerList = incompletedAnswerList;
	}

	

}
