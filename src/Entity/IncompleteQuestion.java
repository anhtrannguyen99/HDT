package Entity;

public class IncompleteQuestion extends Question{
	public IncompleteAnswerList answerList;

	
	public IncompleteQuestion() {
		super();
	}

	public IncompleteQuestion(IncompleteAnswerList answerList) {
		super();
		this.answerList = answerList;
	}

	public IncompleteAnswerList getAnswerList() {
		return answerList;
	}

	public void setAnswerList(IncompleteAnswerList answerList) {
		this.answerList = answerList;
	}
	
	
	
	
	
}
