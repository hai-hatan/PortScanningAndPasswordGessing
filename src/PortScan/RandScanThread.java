package PortScan;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RandScanThread extends Thread {
	String IP;
	int minPort;
	int maxPort;
	GUI gui;
	Scan s;

	public RandScanThread(String IP, String minPort, String maxPort, GUI gui, Scan s) {
		this.IP=IP;
		this.minPort = Integer.parseInt(minPort);
		this.maxPort = Integer.parseInt(maxPort);
		this.gui=gui;
		this.s=s;
	}
	@Override
	public void run() {
		Set<Integer> ports = new LinkedHashSet<Integer>();
		String output = "";
		int PortsNeeded = maxPort - minPort;

		while (ports.size() <= PortsNeeded) {
			int next = (int) (Math.random() * (PortsNeeded + 1)) + minPort;
			ports.add(next);
		}
		Iterator<Integer> itr = ports.iterator();
		
		while (itr.hasNext()) {
			String temp=s.scan(IP, itr.next());
			 output+=temp + "\n";
			 gui.getPortListRand().append(temp + "\n");
		}
	}
	
}
