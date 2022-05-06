package anonymous;

public class PoliceMain03 {

	public static void main(String[] args) {
		Gun gun = new Gun() {
			public void shot() {
				System.out.println("shot");
			}
			public void reload() {
				System.out.println("reload");
			}
		};
		
		Police police = new Police(gun);
		
		police.shot();
		
		police.changeGun(new Gun() {
			public void shot() {
				System.out.println("Bang");
			}
			public void reload() {
				System.out.println("reload...");
			}
		});
		
		police.shot();
		
	}

}
