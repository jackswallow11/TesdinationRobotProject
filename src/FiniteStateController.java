import java.util.Scanner;

public class FiniteStateController {
	

	
	Scanner myScanner = new Scanner(System.in); 
	String UserInput = myScanner.nextLine();
	
	String State0 = "start";
	String State1 = "d1";
	String State2 = "d2";
	String State3 = "d3";
	
	

	
	public void Start ()				
		
		{
		
		
			if(UserInput.contains(State0))
			{
								
				System.out.println("You are now in the starting position please input the destination you desire.");
					
			}
					
			else if(UserInput.contains(State1))		
			{
						
				System.out.println("Travelling to Destination 1...");		
				Destination1();
			}
					
			else if (UserInput.contains(State2))
					
			{
						
				System.out.println("Travelling to Destination 2...");					
				Destination2();
					
			}	
			else if (UserInput.contains(State3))			
			{
						
				System.out.println("Travelling to Destination 3...");	
				Destination3();		}
						
		}
							
		
	public void Destination1 ()		
		{
					
			if(UserInput.contains(State1))
					
			{
						
				System.out.println("You are now in the Destination 1 please input the destination you desire.");
				
			}
				
			else if(UserInput.contains(State0))
			{
					
				System.out.println("Travelling to Start Destination...");
				Start();			
			}
				
			else if (UserInput.contains(State2))				
			{
					
				System.out.println("Travelling to Destination 2...");
				Destination2();				
			}
				
			else if (UserInput.contains(State3))	
			{
					System.out.println("Travelling to Destination 3...");
					Destination3();
					
			}
				
			}
				
				
		public void Destination2 ()
				{
					if(UserInput.contains(State2))
					{
						System.out.println("You are now in the Destination 2 please input the destination you desire.");
				}
				else if(UserInput.contains(State0))
				{
					System.out.println("Travelling to Start Destination...");
					Start();
				}
				else if (UserInput.contains(State1))
				{
					System.out.println("Travelling to Destination 1...");
					Destination1();
				}
				else if (UserInput.contains(State3))
				{
					System.out.println("Travelling to Destination 3...");
						Destination3();
					}
				}
				
		public void Destination3 ()
				
		{
					
			if(UserInput.contains(State3))
					
			{
						
				System.out.println("You are now in the Destination 3 please input the destination you desire.");
				
			}
				
			else if(UserInput.contains(State0))
				{
					System.out.println("Travelling to Start Destination...");
					Start();
				}
				else if (UserInput.contains(State1))
				{
					System.out.println("Travelling to Destination 1...");
					Destination1();
				}
				else if (UserInput.contains(State2))
				{
					System.out.println("Travelling to Destination 2...");
							Destination2();
						}
					}
				
}

	
	
