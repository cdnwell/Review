package event;

public class EventMain {

	public static void main(String[] args) {
		Button button1 = new Button("��ư1");
		Button button2 = new Button("��ư2");
		
		button1.onClick();
		button1.setOnClickListenr(new View.OnClickListener(){
			public void onClick(View view) {
				System.out.println(view.name + "님이 클릭하셨습니다.");
			}
		});
		button1.onClick();
		
		button2.onClick();
		button2.setOnClickListenr(new ClickEvent());
		button2.onClick();
		
		
	}

}
