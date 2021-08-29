package Week3.day2;

public interface TaxCalculation {
	
	/**
	 * 
	 * @param name - Name of the Tax payer
	 * @param HRA - House Rent Allowance
	 * @param LTA - Leave Travel Allowance
	 */
	void calcDeductions(String name, double HRA, double LTA);
	
	/**
	 * 
	 * @param name - Name of the Taxpayer
	 * @param netIncome - Net Income of the Taxpayer
	 * @param deductions - Deductions of the Taxpayer
	 */
	void calcGrossIncome(String name, double netIncome, double deductions);
	
	/**
	 *
	 * @return - returns the tax slab in which the Taxpayer falls 
	 */
	public int taxSlab();
	
	/**
	 * 
	 * @return - public the Taxpayable for the Taxpayer
	 */
	
	public double CalcTaxandPublishValue();

}
