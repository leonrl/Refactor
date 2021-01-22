package refactored;

public class PrimeGenerator {
	private static int[] primes;

	public static int[] generate(PrintConfiguration printConfiguration) {
		primes = new int[printConfiguration.getMAX_NUM_PRIMES() + 1];
		final int ORDMAX = 30;
		int nextNumber;
		int currentPrimeNumber;
		boolean isPrime;
		int ordinal;
		int square;
		int N = 0;
		int squares[] = new int[ORDMAX + 1];
		nextNumber = 1;
		currentPrimeNumber = 1;
		primes[1] = 2;
		ordinal = 2;
		square = 9;
		while (currentPrimeNumber < printConfiguration.getMAX_NUM_PRIMES()) {
			do {
				nextNumber += 2;
				if (nextNumber == square) {
					ordinal++;
					square = primes[ordinal] * primes[ordinal];
					squares[ordinal - 1] = nextNumber;
				}
				N = 2;
				isPrime = true;
				while (N < ordinal && isPrime) {
					while (squares[N] < nextNumber)
						squares[N] += primes[N] + primes[N];
					if (squares[N] == nextNumber)
						isPrime = false;

					N++;
				}
			} while (!isPrime);
			currentPrimeNumber++;
			primes[currentPrimeNumber] = nextNumber;
		}
		return primes;
	}

}
