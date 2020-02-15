package lv.kristina.employee;



public class SalaryEmployee extends Employee {
	

	
	
	public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
		super(name, bankAccount, grossWage );
	}

	
	
	public Double grossPayment() {
		return grossWage + doCurrentBonus();
	}



	@Override
	public void giveBonus(Double percentage) {
	currentBonus += grossWage* (percentage/100.00);
		
	}
	
	

}
