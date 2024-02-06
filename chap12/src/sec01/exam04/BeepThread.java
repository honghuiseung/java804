package sec01.exam04;

import java.awt.Toolkit;

public class BeepThread extends Thread {

	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}

	}

}
