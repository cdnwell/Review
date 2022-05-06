package anonymous;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("µøπ∞¿Ã ∏‘¿Ã∏¶ ∏‘Ω¿¥œ¥Ÿ.");
			}
		};
		animal.eat();
		Animal human = new Animal() {
			public void eat() {
				System.out.println("ªÁ∂˜¿Ã π‰¿ª ∏‘Ω¿¥œ¥Ÿ.");
			}
		};
		
		human.eat();
		
	}

}
