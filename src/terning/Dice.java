package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		return (int)(Math.random()*6) + 1; //Terning 1 sættes til at være 1-6                     // 1-6		
	}
	
	
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
