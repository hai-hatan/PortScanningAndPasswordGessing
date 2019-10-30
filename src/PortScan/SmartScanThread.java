package PortScan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SmartScanThread extends Thread {
	File socetList;
	GUI gui;
	String IP;
	Scan s;
	
	 public SmartScanThread(String IP, GUI gui, Scan s) {
		 
	 socetList = new File("commenPorts.txt");
	 this.IP=IP;
	 this.gui=gui;
	 this.s=s;
	}
	 
	//neet to output txt with all the ports
	@Override
	public void run() {// using a txt file by MIT from: https:web.mit.edu/rhel-doc/4/RH-DOCS/rhel-sg-en-4/ch-ports.html
		try {
			BufferedReader br = new BufferedReader(new FileReader(socetList));
			String correntSocet;
			String Output = "";
			while ((correntSocet = br.readLine()) != null) {
				int correntSocetNum = Integer.parseInt(correntSocet);
				String scanerAns = s.scan(IP, correntSocetNum);
				Output += scanerAns + "\n";
				gui.getPortListSmart().append(scanerAns + "\n");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
