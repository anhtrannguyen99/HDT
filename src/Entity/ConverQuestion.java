package Entity;


public class ConverQuestion extends Question{

	protected ConverQuestionSubList converQuestionSubList;

	public ConverQuestion() {
		super();
	}

	public ConverQuestion(ConverQuestionSubList converQuestionSubList) {
		super();
		this.converQuestionSubList = converQuestionSubList;
	}

	public ConverQuestionSubList getConverQuestionSubList() {
		return converQuestionSubList;
	}

	public void setConverQuestionSubList(ConverQuestionSubList converQuestionSubList) {
		this.converQuestionSubList = converQuestionSubList;
	}
	
	

	
}
