package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installments {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dueDate;
	private Double amount;
	
	public Installments() {
	}
	public Installments(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount() {
		this.amount = amount;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
 	}
	
}
