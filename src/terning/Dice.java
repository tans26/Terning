package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		return (int)(Math.ceil(Math.random()*6));
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<=n; i++) {
		    //Da den i den forkerte rollMultiple metode kører roll() metoden; så længe "i" er mindre end n, -
            //dette bliver rettet til at rollMultiple() metoden kører roll() metoden; så længe at "i" er mindre eller lig med n.
			System.out.print(roll() + " ");
		}		
	}
}
