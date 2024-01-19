package verify.exam06;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		/*controller.setService(new Service());*/
		/*강제 형변환이라서 안됨*/
		//controller.service.login();
		
		controller.setService(new MemberService());
		controller.service.login();
		//그냥 자기자신
		
		controller.setService(new AService());
		controller.service.login();
		//자동형변환
	}

}
