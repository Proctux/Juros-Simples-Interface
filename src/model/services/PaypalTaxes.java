package model.services;

public class PaypalTaxes implements InterestTaxes{

	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}
	
	
	@Override
	public double interestTaxes(double amount, int number) {
		
		return amount * 0.01 * number;
	}
	
}
