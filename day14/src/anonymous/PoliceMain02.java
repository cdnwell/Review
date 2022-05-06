package anonymous;

public class PoliceMain02 {

	public static void main(String[] args) {
		Gun gun = new Gun() {
			public void shot() {
				System.out.println("Bang!");
			}
			public void reload() {
				System.out.println("reload...");
			}
		};
		
		gun.shot();
		gun.shot();
		
		Police police =new Police(gun);
		police.changeGun(new Gun() {
			public void shot() {
				System.out.println("BangBang!");
			}
			public void reload() {
				System.out.println("reload...");
			}
		});
		
		police.shot();
		police.shot();
	}

}
