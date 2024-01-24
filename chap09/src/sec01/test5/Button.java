package sec01.test5;

public class Button {
	OnClickListener listener;
	
	void touch() {
		listener.onClick();
	}
	
	void setOnClickListener(OnClickListener listener){
		this.listener = listener;
	}
	
	static interface OnClickListener {
		void onClick();
	}
}
