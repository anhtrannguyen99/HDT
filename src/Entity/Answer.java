package Entity;

public class Answer{
	private String ansA;
	private String ansB;
	private String ansC;
	private String ansD;
	private String ansCorrect;
	private int idQuest;
	

	public Answer() {
		super();
	}
	
	
	public Answer(String ansA, String ansB, String ansC, String ansD, String ansCorrect, int idQuest) {
		super();
		this.ansA = ansA;
		this.ansB = ansB;
		this.ansC = ansC;
		this.ansD = ansD;
		this.ansCorrect = ansCorrect;
		this.idQuest = idQuest;
	}


	public int getIdQuest() {
		return idQuest;
	}


	public void setIdQuest(int idQuest) {
		this.idQuest = idQuest;
	}


	public String getAnsCorrect() {
		return ansCorrect;
	}


	public void setAnsCorrect(String ansCorrect) {
		this.ansCorrect = ansCorrect;
	}


	public String getAnsA() {
		return ansA;
	}
	public void setAnsA(String ansA) {
		this.ansA = ansA;
	}
	public String getAnsB() {
		return ansB;
	}
	public void setAnsB(String ansB) {
		this.ansB = ansB;
	}
	public String getAnsC() {
		return ansC;
	}
	public void setAnsC(String ansC) {
		this.ansC = ansC;
	}
	public String getAnsD() {
		return ansD;
	}
	public void setAnsD(String ansD) {
		this.ansD = ansD;
	}
	
	
	

}
