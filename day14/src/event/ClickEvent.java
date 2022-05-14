package event;

public class ClickEvent implements View.OnClickListener{

	@Override
	public void onClick(View view) {
		System.out.println(view.name + "님이 클릭하셨습니다.");
	}

}
