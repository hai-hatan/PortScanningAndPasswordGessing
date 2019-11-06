package PasswordGessing;


import java.util.regex.Pattern;
import com.jcraft.jsch.*;


public class Login {

       public boolean sshConnect(String user,String host ,String password ,int port) {

        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            session.setPassword(password);
            System.out.println(password);
            session.setConfig("StrictHostKeyChecking", "no");
            System.out.println("Establishing Connection...");
            session.connect(50);
            System.out.println("Connection established.");
            System.out.println("Crating SFTP Channel.");
            ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
            sftpChannel.connect();
            System.out.println("SFTP Channel created.");
            session.disconnect();

        } catch ( Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
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
}
