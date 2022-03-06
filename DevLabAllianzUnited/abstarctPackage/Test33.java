package com.test.abstarctPackage;

	 class Bank {
	 
	    void check()
	    {
	       // System.out.println("eat() method of base class");
	        System.out.println("Bank Class.");
	    }
	}
	 
	class Loan extends Bank {
	 
	    void check()
	    {
	        //System.out.println("eat() method of derived class");
	        System.out.println("loan class");
	    }
	}
	 
	class Test33 {
	 
	    public static void main(String args[])
	    {
	        Bank d1 = new Bank();
	        d1.check();
	        Loan a1 = new Loan();
	        a1.check();
	         Bank bank = new Loan();
	        bank.check();
	        Loan loan = (Loan) new Bank();
	        loan.check();
	        
	    }
	}

