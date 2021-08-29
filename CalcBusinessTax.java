package Week3.day2;

public class CalcBusinessTax implements TaxCalculation, IncomeCalculation {

	public void calcDeductions(String name, double HRA, double LTA) {
		System.out.println("Calculating deductions from Business class");
		
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println("Calculating Grossincome from Business class");
		
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
		System.out.println("Calculating netincome from Business class");
	}
	
	public void businesswaiver() {
		System.out.println("This is an independent implementation of the Business Class");

	}

}
