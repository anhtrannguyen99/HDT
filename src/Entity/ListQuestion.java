package Entity;

import java.util.ArrayList;
import java.util.List;

public class ListQuestion {
	List<Question> listQuestion = new ArrayList<Question>();
	
	public void addQuestion(Question qes) {
		listQuestion.add(qes);
	}
	
	
}
