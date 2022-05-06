package anonymous;

public class PoliceMain {

	public static void main(String[] args) {
		Gun gun = new Gun() {
			
			private int bullet = 10;
			
			public void shot() {
				if(bullet>0) {
					bullet--;
					System.out.println("Bang!");
				}else {
					reload();
				}
			}
			public void reload() {
				bullet=10;
				System.out.println("reload...");
			}
		};
		
		for(int i = 0; i<15; i++) gun.shot();
		Police police = new Police(gun);
		police.changeGun(new Gun() {
			private int bullet = 10;
			
			public void shot() {
				if(bullet>0) {
					bullet--;
					bullet--;
					System.out.println("Bang! Bang!");
				}else {
					reload();
				}
			}
			
			public void reload() {
				bullet=10;
				System.out.println("reload...");
			}
		});
			
		for(int i=0;i<7;i++)
			police.shot();
		
		
		
		
		
	}

}
