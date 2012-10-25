
public class View extends Observer {
	
	Model myModel;
	Controller ctlr;
	
	public View(Model model) {
		myModel = model;
		
		myModel.attach(this);
	}

	public void setCtlr(Controller ctlr) {
		this.ctlr = ctlr;
	}

	private void display() {
		System.out.println("THE SCORE IN VIEW: "+ myModel.getScore());
		
	}

	@Override
	public void Update() {
		display();
		
	}
}
