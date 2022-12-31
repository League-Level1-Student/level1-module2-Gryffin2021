package _01_sea_creature;

public class SeaRunner {
public static void main(String[] args) {
	SeaCreature sponge = new SeaCreature("spongebob");
	sponge.eat();
	sponge.laugh();
	SeaCreature star = new SeaCreature("patrick");
	star.getName();
	System.out.println(star.getName());
	star.eat();
	star.laugh();
	SeaCreature squib = new SeaCreature("squidward");
	squib.getName();
	System.out.println(star.getName());
	squib.eat();
	squib.laugh();
}
}
