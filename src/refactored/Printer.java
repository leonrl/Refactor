package refactored;

public class Printer {
	public static void main(String[] args) {
		PrintConfiguration printConfiguration = new PrintConfiguration();
		int primes[] = PrimeGenerator.generate(printConfiguration);
		PrintPrimeNumbers.generateOutput(primes, printConfiguration);
	}
}