package Week3.day2;

public interface IncomeCalculation {
	
	/**
	 * 
	 * @param name - Name of the tax payer
	 * @param income1 - net income through source 1
	 * @param income2 - net income through source 2
	 */
	void calcNetIncome(String name, double income1, double income2);

}
