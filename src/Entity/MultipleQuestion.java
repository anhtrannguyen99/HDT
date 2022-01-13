package Entity;

public class MultipleQuestion extends Question {
	private MultipleAnswer multipleAnswer ;
	

	public MultipleQuestion() {
		super();
	}

	public MultipleQuestion(MultipleAnswer multipleAnswer) {
		super();
		this.multipleAnswer = multipleAnswer;
	}

	public MultipleAnswer getMultipleAnswer() {
		return multipleAnswer;
	}

	public void setMultipleAnswer(MultipleAnswer multipleAnswer) {
		this.multipleAnswer = multipleAnswer;
	}
	
	
	
}
