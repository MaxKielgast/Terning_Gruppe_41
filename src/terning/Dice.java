package terning;
//illuminati is real :P
public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		float d1=(float)Math.random();     // 0-1
		float d2=d1*5;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		return d3 + 1;                     // 1-6		
	}

	public void rollMultiple(int n) {
		int MarkWasHere = 69;
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
