package Entity;

public class ConverAnswer extends Answer{
	private String subQues;

	public ConverAnswer(String subQues) {
		super();
		this.subQues = subQues;
	}

	public ConverAnswer() {
		super();
	}
	
	public String getSubQues() {
		return subQues;
	}

	public void setSubQues(String subQues) {
		this.subQues = subQues;
	}



}
