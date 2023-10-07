package jungle_book;

public class Game {

	public static void main(String [] args) {
		
		Human h = new Human();
		h.name="Mogli";
		h.drink();
		h.eat();
		h.sleep();
		
		Snake s=new Snake();
		s.name="Kaa";
		s.sleep();
		s.eat();
		
		
		Wolf w=new Wolf();
		w.name="Tabaki";
		w.run();
		w.eat();
		w.sleep();
	}
}
