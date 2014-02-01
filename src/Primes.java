import java.util.ArrayList;

/*
 * http://projecteuler.net/problem=7
 * Sloppily done... don't care
 */

public class Primes {
	
	public static void main(String[] args) {
		int numberOfPrimes = 10000;
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		int pc = 3;  //Prime number candidates.  One is omitted.  Start with 3 to iterate by 2 later.
		primeNumbers.add(2); //Two is automatically included.
		while (primeNumbers.size() < numberOfPrimes) {
			boolean isPrime = true;
			while (isPrime) {
				ArrayList<Integer> pile = new ArrayList<Integer>();  //Pile of possible divisible numbers
				for (int i = 1; i <= pc; i++) {
					pile.add(i);
				}
				int j = 0;
				while (j <= (pc-1)) {
					if (pc % (j+1) != 0) {
						pile.remove(pile.size()-1);
						isPrime = false;
					}
					j++;
				}
				if (pile.size() < 3) {
					primeNumbers.add(pc);
				}
			}
			pc = pc+2;
		}
		
		 // USE THIS TO PRINT OUT ALL THE PRIMES
		for (int i = 0; i < primeNumbers.size(); i++) {
			System.out.println((i+1) + ": " + primeNumbers.get(i));
		}
		
		//System.out.println(primeNumbers.get(10000));
	}
	
}