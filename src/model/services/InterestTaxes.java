package model.services;

public interface InterestTaxes {
	
	double paymentFee(double amount);
	double interestTaxes(double amount, int number);
	
}
