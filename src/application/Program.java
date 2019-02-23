package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ContractData;
import model.entities.Installments;
import model.services.InstallmentValues;
import model.services.PaypalTaxes;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer contractNumber = sc.nextInt();
		System.out.print("Date (DD/MM/YYYY): ");
		sc.nextLine();
		Date initialDate = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double contractValue = sc.nextDouble();
		
		ContractData cd = new ContractData(contractNumber, initialDate, contractValue);
		Installments inst = new Installments(initialDate, contractValue);
		
		System.out.print("Enter the number of installments: ");
		Integer n = sc.nextInt();
		
		InstallmentValues iv = new InstallmentValues(new PaypalTaxes());
		
		iv.processContract(cd, n);
		
		System.out.println("Installments:");
		for(Installments x : cd.getInstallments()) {
			System.out.println(x);
		}
		

		
		
		
		sc.close();
	}

}
