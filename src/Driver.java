
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Finch myfinch = new Finch();
		FiniteStateController fsm = new FiniteStateController();
		
		System.out.println("You are now in the starting position.");
		fsm.Start();
			
		
		
		
	}

}
