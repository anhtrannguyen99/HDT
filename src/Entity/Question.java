package Entity;

public abstract class Question {

	private int id;
	private String question;
	private int point;
	private String ansCorrect;
	private String url;
	private TypeQuestion type;
	private Level level;

	
	public Question() {
		super();
	}

	public Question(int id, String question, int point, String ansCorrect, String url, TypeQuestion type, Level level) {
		super();
		this.id = id;
		this.question = question;
		this.point = point;
		this.ansCorrect = ansCorrect;
		this.url = url;
		this.type = type;
		this.level = level;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public TypeQuestion getType() {
		return type;
	}

	public void setType(TypeQuestion type) {
		this.type = type;
	}

	
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
