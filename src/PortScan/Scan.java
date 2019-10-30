package PortScan;

import java.net.*;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Scan {

	public Scan() {

	}

	public void slowScan(String IP, long waitTimeInMilisec, int groupSize, int startPort, int endPort) {
		int corentPort = startPort;
		int end = startPort + groupSize;
		while (corentPort <= endPort) {
			while (corentPort < end) {
				if (corentPort > endPort) {
					break;
				}
				scan(IP, corentPort);
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

	public String scan(String IP, int port) {
		try {
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(IP, port), 50);
			socket.close();
			
			return ("Port " + port + " is open");
		} catch (Exception e) {
			return ("Port " + port + " is close");
		}
	}

	public boolean isValidIP(String IP) {
		if (IP.length() > 15 || IP.length() < 7) {
			return false;
		} else {
			String[] IPsplited = IP.split(Pattern.quote("."));
			if (IPsplited.length != 4) {
				return false;
			} else {
				try {
					for (int i = 0; i < IPsplited.length; i++) {
						int temp = Integer.parseInt(IPsplited[i]);
						if (temp < 0 || temp > 255) {
							return false;
						}
					}
				} catch (Exception e) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isValidPort(String Port) {
		if (Port.length() > 5) {
			return false;
		} else {
			try {
				int portNum = Integer.parseInt(Port);
				if (portNum < 0 || portNum > 65535) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public boolean isValidGrop(String groupSize, String maxPort, String minPort) {
		try {
			int groupSizeNum = Integer.parseInt(groupSize);
			int maxPortNum = Integer.parseInt(maxPort);
			int minPortNum = Integer.parseInt(minPort);

			if (groupSizeNum >= 0) {
				if (groupSizeNum < maxPortNum - minPortNum) {
					
					return true;
					
				} else {
					return false;
				}
				
			} else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isValidTime(String timeToWait) {
		try {
			long time = Long.parseLong(timeToWait);
			if(time > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}