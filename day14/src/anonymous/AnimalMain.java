package anonymous;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("������ ���̸� �Խ��ϴ�.");
			}
		};
		animal.eat();
		Animal human = new Animal() {
			public void eat() {
				System.out.println("����� ���� �Խ��ϴ�.");
			}
		};
		
		human.eat();
		
	}

}
