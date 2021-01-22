package refactored;

public class PrintPrimeNumbers {

	public static void generateOutput(int primes[], PrintConfiguration printConfiguration) {
		int pageNumber = 1;
		int pageOffset = 1;
		int rowOffset;
		int currentColumnNum;
		while (pageOffset <= printConfiguration.getMAX_NUM_PRIMES()) {
			System.out.print("The First ");
			System.out.print(Integer.toString(printConfiguration.getMAX_NUM_PRIMES()));
			System.out.print(" Prime Numbers === Page ");
			System.out.print(Integer.toString(pageNumber));
			System.out.println("\n");
			for (rowOffset = pageOffset; rowOffset <= pageOffset +  printConfiguration.getROWS_PER_PAGE() - 1; rowOffset++) {
				for (currentColumnNum = 0; currentColumnNum <= printConfiguration.getCOLS_PER_PAGE() - 1; currentColumnNum++) {
					if (rowOffset + currentColumnNum * printConfiguration.getROWS_PER_PAGE() <= printConfiguration.getMAX_NUM_PRIMES()) {
						System.out.printf("%10d", primes[rowOffset + currentColumnNum * printConfiguration.getROWS_PER_PAGE()]);
					}
				}
			System.out.println();
			}
			System.out.println("\f");
			pageNumber++;
			pageOffset += printConfiguration.getROWS_PER_PAGE() * printConfiguration.getCOLS_PER_PAGE();
		}
	}

}
