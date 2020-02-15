package lv.kristina.paysystem;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
	

	//izmantojam interface,kas ir abstrakta klase
		public List <Payee> payees;
		
		public PaymentSystem(){
			payees = new ArrayList<Payee>();	
		}
		
		public void addPayee(Payee payee){
			if(!payees.contains(payee)){
				payees.add(payee);
			}
		}
		public void processPayments(){
			for(Payee payee : payees){
				Double grossPayment = payee.grossPayment();
				
				System.out.println("Paying to "+ payee.name());
				System.out.println("Grosst "+String.format("%1.2f",grossPayment));
				System.out.println("Transfered to Account: "+payee.bankAccount() );
			}
		}
	}
