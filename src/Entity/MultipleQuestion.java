package Entity;

public class MultipleQuestion extends Question {
	private MultipleAnswer multipleAnswer ;
	private String note;

	public MultipleQuestion() {
		super();
	}

	public MultipleQuestion(MultipleAnswer multipleAnswer, String note) {
		super();
		this.multipleAnswer = multipleAnswer;
	}

	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public MultipleAnswer getMultipleAnswer() {
		return multipleAnswer;
	}

	public void setMultipleAnswer(MultipleAnswer multipleAnswer) {
		this.multipleAnswer = multipleAnswer;
	}
	
	
	
}
