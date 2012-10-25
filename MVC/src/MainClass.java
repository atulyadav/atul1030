
public class MainClass 
{
	public static void main(String[] args) 
	{
		Model model = new Model();
		View view1 = new View(model);
		Controller ctlr = new Controller(model,view1);		
		ctlr.handle(50);		
		ctlr.handle(60);
	}

}
