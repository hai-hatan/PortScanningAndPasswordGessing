package PortScan;

public class SlowScanThread extends Thread {

	String IP;
	int minPort;
	int maxPort;
	int groupSize;
	long waitTimeInMilisec;
	GUI gui;
	Scan s;

	public SlowScanThread(String IP, String minPort, String maxPort, String groupSize, GUI gui, Scan s,
			String waitTimeInMilisec) {
		this.IP = IP;
		this.minPort = Integer.parseInt(minPort);
		this.maxPort = Integer.parseInt(maxPort);
		this.groupSize = Integer.parseInt(groupSize);
		this.waitTimeInMilisec = Long.parseLong(waitTimeInMilisec);
		this.gui = gui;
		this.s = s;
	}

	public void run() {
		String output = "";
		int corentPort = minPort;
		int end = minPort + groupSize;
		while (corentPort <= maxPort) {
			while (corentPort < end) {
				if (corentPort > maxPort) {
					break;
				}
				String temp = s.scan(IP, corentPort);
				output += temp + "\n";
				gui.getPortListSlow().append(temp + "\n");
				corentPort++;
			}
			end = corentPort + groupSize;
			try {
				Thread.sleep(waitTimeInMilisec);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
