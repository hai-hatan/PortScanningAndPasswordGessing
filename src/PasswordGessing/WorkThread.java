package PasswordGessing;


public class WorkThread extends Thread {
	GUIPW gui;
	
	public WorkThread(GUIPW gui) {
		this.gui = gui;
	}
	
	@Override
	public synchronized void run() {
		
		while (true) {
				try {
				gui.getPWtext().setText("working...");
				Thread.sleep(500);
				gui.getPWtext().setText("working..");
				Thread.sleep(500);
				gui.getPWtext().setText("working.");
				Thread.sleep(500);
				gui.getPWtext().setText("working..");
				Thread.sleep(500);
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}
}
