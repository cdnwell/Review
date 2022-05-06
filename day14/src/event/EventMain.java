package event;

public class EventMain {

	public static void main(String[] args) {
		Button button1 = new Button("버튼1");
		Button button2 = new Button("버튼2");
		
		button1.onClick();
		button1.setOnClickListenr(new View.OnClickListener(){
			public void onClick(View view) {
				System.out.println(view.name+ " 클릭 이벤트");
			}
		});
		button1.onClick();
		
		button2.onClick();
		button2.setOnClickListenr(new ClickEvent());
		button2.onClick();
		
		
	}

}
