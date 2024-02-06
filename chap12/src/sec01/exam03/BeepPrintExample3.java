package sec01.exam03;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				//실행이 오래 걸리는 부분은 병렬로 처리하기 위해 쓰레드 사용
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
			
		});
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}

	}

}
