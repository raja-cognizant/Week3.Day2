package Week3.day2;

public class CalcIndividualsTax implements TaxCalculation, IncomeCalculation  {

	public void calcDeductions(String name, double HRA, double LTA) {
		System.out.println("The tax payer name is " + name);
		double deductions = HRA + LTA;
		System.out.println("Total deductions are :" + deductions);
		
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println("The tax payer name is " + name);
		double taxableIncome = netIncome - deductions;
		System.out.println("Total Taxable income of the individual is :" + taxableIncome);
	}

	public int taxSlab() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double CalcTaxandPublishValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void calcNetIncome(String name, double income1, double income2) {
		System.out.println("The tax payer name is " + name);
		double netIncome = income1 + income2;
		System.out.println("Total Taxable income of the individual is :" + netIncome);
		
	}
	
	public void standardDecutions() {
		System.out.println("This is an independent implementation of the Individual Class");
	}

}
