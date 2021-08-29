package Week3.day2;

public class Execution {

	public static void main(String[] args) {
		
		CalcIndividualsTax taxIndObj = new CalcIndividualsTax();
		taxIndObj.calcDeductions("Raja", 123123, 123123.23);
		taxIndObj.calcGrossIncome("JOHN", 1231231, 12312544);
		taxIndObj.calcNetIncome("Raja", 50000, 652310);
		taxIndObj.standardDecutions();
		
		CalcBusinessTax taxBusObj = new CalcBusinessTax();
		taxBusObj.calcDeductions("Raja", 1451, 3465231);
		taxBusObj.calcGrossIncome("John", 54123, 6546856);
		taxBusObj.calcNetIncome("Ram", 746513.01, 6846551.11);
		taxBusObj.businesswaiver();
		
	}

}
