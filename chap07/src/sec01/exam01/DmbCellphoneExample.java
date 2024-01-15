package sec01.exam01;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		DmbCellphone dmbCellPhone = new DmbCellphone("wkqkvhs","검정",10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("모델: " + dmbCellPhone.model);
		
		System.out.println("채널: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아 반갑습니다~");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
