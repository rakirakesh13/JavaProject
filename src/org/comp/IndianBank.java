package org.comp;

// Method OverRiding
public class IndianBank extends IciciBank {
	@Override
	public void savings() {
	System.out.println("500000");
	super.savings();
	}
	
	@Override
	public void loan() {
	System.out.println("6000000");
	super.loan();
	}
	
	@Override
	public void deposit() {
	System.out.println("8000000");
	super.deposit();
	}
	
	public static void main(String[] args) {
		IndianBank a = new IndianBank();
		a.savings();
		a.loan();
		a.deposit();
	}

}
