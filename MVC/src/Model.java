import java.util.ArrayList;


public class Model {
	
	int score;
	
	ArrayList<Observer> obsList = new ArrayList<Observer>(10);

	public void attach(Observer object) {
		obsList.add(object);
	}

	public void detach(Observer object){
		
	}

	public void setScore(int score) {
		this.score = this.score+score;
		this.mNotify();
	}
	
	public int getScore() {
		return score;
	}

	private void mNotify() {
		for (int i = 0; i < obsList.size(); i++) {
			obsList.get(i).Update();
		}
		
	}	
}
