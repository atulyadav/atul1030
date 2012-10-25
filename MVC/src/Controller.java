
public class Controller extends Observer {
	View view;
	Model myModel;
	
	private void display() {
		System.out.println("THE SCORE IN Controller: "+ myModel.getScore());
		
	}

	@Override
	public void Update() {
		display();
		
	}

	public Controller(Model model, View view2) 
	{
		view = view2;
		myModel =  model;
		
		myModel.attach(this);
	}

	public void handle(int num)
	{
		myModel.setScore(num);
	}
	
	
}
