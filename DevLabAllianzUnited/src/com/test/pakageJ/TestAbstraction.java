package com.test.pakageJ;

public class TestAbstraction {
	
	public static void main(String[] args) {
		
		
		
		Club club = new ManchesterUnited();
		club.Player();
		club.noOfGoals();
		
	}

}

abstract class Club
{
	abstract void Player(); 
	
	void noOfGoals()
	{
		System.out.println("20 goals for this year");
	}
}

class ManchesterUnited extends Club
{

	@Override
	void Player() {
		System.out.println("Cristiano Ronaldo");
		
	}
	
	class PSG extends Club
	{

		@Override
		void Player() {
			System.out.println("Neymar Junior");
			
		}
	}
}


