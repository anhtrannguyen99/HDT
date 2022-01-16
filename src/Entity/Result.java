package Entity;

public class Result {
	private int id;
	private String choose;
	private int point;
	private String ansCorrect;
	
	
	public Result() {
		super();
	}
	public Result(int id, String choose, int point, String ansCorrect) {
		super();
		this.id = id;
		this.choose = choose;
		this.point = point;
		this.ansCorrect = ansCorrect;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
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
