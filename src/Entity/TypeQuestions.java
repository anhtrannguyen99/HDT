package Entity;

public class TypeQuestions {
	int id;
	String type;
	String url;
	String muc;
	public TypeQuestions() {
	}
	
	public TypeQuestions(int id, String type, String url,String muc) {
		super();
		this.id = id;
		this.type = type;
		this.url = url;
		this.muc = muc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMuc() {
		return muc;
	}
	public void setMuc(String muc) {
		this.muc = muc;
	}
	
}
