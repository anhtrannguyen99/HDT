package Entity;

import java.util.ArrayList;

public class ResultList {
	public ArrayList<Result> results = new ArrayList<Result>();
	
	public void add(Result result) {
		results.add(result);
		}

	public ResultList() {
		super();
	}

	public ResultList(ArrayList<Result> results) {
		super();
		this.results = results;
	}

	public ArrayList<Result> getResults() {
		return results;
	}

	public void setResults(ArrayList<Result> results) {
		this.results = results;
	}
	
	

}
