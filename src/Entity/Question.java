package Entity;

public class Question {

	private int id;
	private String question;
	private int point;
	private String ansCorrect;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getAnsCorrect() {
		return ansCorrect;
	}
	public void setAnsCorrect(String ansCorrect) {
		this.ansCorrect = ansCorrect;
	}
	
	
}
