package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractData {

	private Integer contractNumber;
	private Date initialDate;
	private Double contractValue;
	
	private List<Installments> inst = new ArrayList<>();
	
	public ContractData() {
	}
	
	public ContractData(Integer contractNumber, Date initialDate, Double contractValue) {
		this.contractNumber = contractNumber;
		this.initialDate = initialDate;
		this.contractValue = contractValue;
	}
	
	public Integer getContractNumber() {
		return contractNumber;
	}
	public Date getInitialDate() {
		return initialDate;
	}
	public Double getContractValue() {
		return contractValue;
	}
	
	public List<Installments> getInstallments() {
		return inst;
	}

	public void addInst(Installments installment) {
		inst.add(installment);
	}
	public void removeInst(Installments installment) {
		inst.remove(installment);
	}
	
	
	
}
