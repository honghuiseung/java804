package sec06.exam02.myCompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyndai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	//ctrl+shift+O로 인포트
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
}