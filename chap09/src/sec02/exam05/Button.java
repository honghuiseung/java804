package sec02.exam05;

public class Button {
	OnClickListener listener;
	
	void touch() {
		listener.onClick();
	}
	
	void setOnClickListener(OnClickListener listener){
		this.listener = listener;
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
