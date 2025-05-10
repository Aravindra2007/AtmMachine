package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Atmoperationimpliment implements Atminterface {

	Atm my = new Atm();
	Map<Double,String> ministmt=new HashMap<>();
	public void viewbalance() {
		System.out.println(" View Balance : "+my.getBalance());
	}
	
	public void withdrawamount(double withdrawamount) {	
		if(withdrawamount%100==0) {
			if(withdrawamount<=my.getBalance()) {
				System.out.println(" Collect the Cash : "+withdrawamount);
				my.setBalance(my.getBalance()-withdrawamount);
				ministmt.put(withdrawamount,"amount withdrawn Successfully ");
				viewbalance();
			}
		}else {
			System.out.println(" enter the amount interms of 100 ");
		}
	}

	public void depositamount(double depositamount) {
		System.out.println(" Deposited amount : "+depositamount);
		my.setBalance(my.getBalance()+depositamount);
		ministmt.put(depositamount,"Amount Deposited Succesfully ");
		viewbalance();
	}
	
	public void ministatement() {
		Set<Double> set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
	}

}
