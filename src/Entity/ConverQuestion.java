package Entity;


public class ConverQuestion extends Question{

	private ConverQuestionList converAnswerList;

	public ConverQuestion() {
		super();
	}

	public ConverQuestion(ConverQuestionList converAnswerList) {
		super();
		this.converAnswerList = converAnswerList;
	}

	public ConverQuestionList getConverAnswerList() {
		return converAnswerList;
	}

	public void setConverAnswerList(ConverQuestionList converAnswerList) {
		this.converAnswerList = converAnswerList;
	}
	
	

	
}
