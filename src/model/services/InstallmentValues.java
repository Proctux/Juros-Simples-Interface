package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.ContractData;
import model.entities.Installments;

public class InstallmentValues {

	private InterestTaxes interestTaxes;
	
	public InstallmentValues() {
	}
	public InstallmentValues(InterestTaxes interestTaxes){
		this.interestTaxes = interestTaxes;
	}
	
	public void processContract(ContractData contract, int months) {
		double basicValues = contract.getContractValue() / months;
		
		for(int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getInitialDate(), i);
			double updatedQuota = basicValues + interestTaxes.interestTaxes(basicValues, i);
			double fullQuota = updatedQuota + interestTaxes.paymentFee(updatedQuota);
			contract.addInst(new Installments(date, fullQuota));
		}
		
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	
}
