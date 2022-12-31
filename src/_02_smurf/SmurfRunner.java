package _02_smurf;

import _01_sea_creature.SeaCreature;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		handy.getName();
		System.out.println(handy.getName());
		handy.eat();
		
		Smurf oldsmurf = new Smurf("Papa");
		
		oldsmurf.getName();
		System.out.println(oldsmurf.getName());
		
		System.out.println("My hat color is " + oldsmurf.getHatColor() + ".");
		 
		System.out.println("I am " + oldsmurf.isGirlOrBoy());
		
		Smurf smur = new Smurf("Smurfette");
		
		smur.getName();
		System.out.println(smur.getName());
		
		System.out.println("My hat color is " + smur.getHatColor() + ".");
		 
		System.out.println("I am " + smur.isGirlOrBoy());
	}
}
