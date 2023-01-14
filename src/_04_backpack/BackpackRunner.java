package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		
		Backpack backpack = new Backpack();
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		
		backpack.putInBackpack(pencil);
		pencil.write("Answer: Biggie Cheese was a stronk and powerful boi. He had 3 biceps and 1 foot, yet he still conquered Europe. His favorite snack was baguette.");
		backpack.putInBackpack(ruler);
		ruler.measure();
		backpack.putInBackpack(textbook); 
		textbook.read();
		backpack.packAndCheck();
	}
}
