/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PortScan;

/**
 *
 * @author DJHAI
 */
public class GUI extends javax.swing.JFrame {

	/**
	 * Creates new form GUI
	 */
	public GUI() {

		initComponents();

	}

	public javax.swing.JTextArea getPortListRand() {
		return portListRand;
	}

	public javax.swing.JTextArea getPortListSlow() {
		return portListSlow;
	}

	public javax.swing.JTextArea getPortListSmart() {
		return portListSmart;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		smartScanTab = new javax.swing.JPanel();
		startButtonSmart = new javax.swing.JButton();
		IPtextSmart = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		portListSmart = new javax.swing.JTextArea();
		slowScanTab = new javax.swing.JPanel();
		IPtextSlow = new javax.swing.JTextField();
		groupSizeText = new javax.swing.JTextField();
		startPortSlow = new javax.swing.JTextField();
		endPortSlow = new javax.swing.JTextField();
		StartButtomSlow = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		portListSlow = new javax.swing.JTextArea();
		timetoWait = new javax.swing.JTextField();
		randomScan = new javax.swing.JPanel();
		IPtextRandom = new javax.swing.JTextField();
		endPortRand = new javax.swing.JTextField();
		startPortRand = new javax.swing.JTextField();
		startScanRand = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		portListRand = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		startButtonSmart.setText("start scan");
		startButtonSmart.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startButtonSmartActionPerformed(evt);
			}
		});

		IPtextSmart.setText("IP to scan");

		IPtextSmart.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				IPtextSmartMouseClicked(evt);
			}
		});

		portListSmart.setColumns(20);
		portListSmart.setRows(5);
		jScrollPane1.setViewportView(portListSmart);

		javax.swing.GroupLayout smartScanTabLayout = new javax.swing.GroupLayout(smartScanTab);
		smartScanTab.setLayout(smartScanTabLayout);
		smartScanTabLayout.setHorizontalGroup(smartScanTabLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(smartScanTabLayout.createSequentialGroup().addContainerGap()
						.addGroup(smartScanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
								.addComponent(startButtonSmart, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(IPtextSmart))
						.addContainerGap()));
		smartScanTabLayout.setVerticalGroup(smartScanTabLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(smartScanTabLayout.createSequentialGroup().addContainerGap().addComponent(startButtonSmart)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(IPtextSmart, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
						.addContainerGap()));

		jTabbedPane1.addTab("smart scan", smartScanTab);

		IPtextSlow.setText("IP to scan");

		IPtextSlow.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				IPtextSlowMouseClicked(evt);
			}
		});

		groupSizeText.setText("group size");

		groupSizeText.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				groupSizeTextMouseClicked(evt);
			}
		});

		startPortSlow.setText("start scan from port");
		startPortSlow.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				startPortSlowMouseClicked(evt);
			}
		});

		endPortSlow.setText("end scan at port");

		endPortSlow.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				endPortSlowMouseClicked(evt);
			}
		});

		StartButtomSlow.setText("start scan");
		StartButtomSlow.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				StartButtomSlowActionPerformed(evt);
			}
		});

		portListSlow.setColumns(20);
		portListSlow.setRows(5);
		jScrollPane2.setViewportView(portListSlow);

		timetoWait.setText("time to wait between scan groups in milliseconds");

		timetoWait.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				timetoWaitMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout slowScanTabLayout = new javax.swing.GroupLayout(slowScanTab);
		slowScanTab.setLayout(slowScanTabLayout);
		slowScanTabLayout.setHorizontalGroup(slowScanTabLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(slowScanTabLayout.createSequentialGroup().addContainerGap().addGroup(slowScanTabLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(StartButtomSlow, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								slowScanTabLayout.createSequentialGroup()
										.addGroup(slowScanTabLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(IPtextSlow).addComponent(groupSizeText,
														javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(slowScanTabLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(endPortSlow).addComponent(startPortSlow,
														javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
						.addComponent(timetoWait)).addContainerGap()));
		slowScanTabLayout.setVerticalGroup(slowScanTabLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(slowScanTabLayout.createSequentialGroup().addContainerGap()
						.addGroup(slowScanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(IPtextSlow, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(startPortSlow, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(slowScanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(groupSizeText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(endPortSlow, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(timetoWait, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(StartButtomSlow)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
						.addContainerGap()));

		jTabbedPane1.addTab("slow scan", slowScanTab);

		IPtextRandom.setText("IP to scan");
		IPtextRandom.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				IPtextRandomMouseClicked(evt);
			}
		});

		endPortRand.setText("maximom port to scan");

		startPortRand.setText("minimom port to scan from");

		startScanRand.setText("start scan");
		startScanRand.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startScanRandActionPerformed(evt);
			}
		});

		portListRand.setColumns(20);
		portListRand.setRows(5);
		jScrollPane3.setViewportView(portListRand);

		javax.swing.GroupLayout randomScanLayout = new javax.swing.GroupLayout(randomScan);
		randomScan.setLayout(randomScanLayout);
		randomScanLayout.setHorizontalGroup(randomScanLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, randomScanLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(randomScanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jScrollPane3)
								.addComponent(startScanRand, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(IPtextRandom, javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										randomScanLayout.createSequentialGroup()
												.addComponent(startPortRand, javax.swing.GroupLayout.PREFERRED_SIZE,
														143, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(endPortRand, javax.swing.GroupLayout.PREFERRED_SIZE, 139,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		randomScanLayout.setVerticalGroup(randomScanLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(randomScanLayout.createSequentialGroup().addContainerGap()
						.addComponent(IPtextRandom, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(randomScanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(endPortRand, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(startPortRand, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(startScanRand)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
						.addContainerGap()));

		jTabbedPane1.addTab("random scan", randomScan);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jTabbedPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void startButtonSmartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_startButtonSmartActionPerformed
		Scan temp = new Scan();
		String IP = IPtextSmart.getText();
		if (temp.isValidIP(IP)) {
			SmartScanThread thread = new SmartScanThread(IP, this, temp);
			thread.start();// start scan
		} else {
			portListSmart.append("please enter a valid IP addres\n");
		}
	}// GEN-LAST:event_startButtonSmartActionPerformed

	private void startScanRandActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_startScanRandActionPerformed
		Scan temp = new Scan();
		String IP = IPtextRandom.getText();
		String minPort = startPortRand.getText();
		String maxPort = endPortRand.getText();
		if (temp.isValidIP(IP)) {
			if (temp.isValidPort(minPort)) {
				if (temp.isValidPort(maxPort)) {
					if (Integer.parseInt(minPort) <= Integer.parseInt(maxPort)) {
						RandScanThread thread = new RandScanThread(IP, minPort, maxPort, this, temp);
						thread.start();// start scan
					} else {
						portListRand.append("the maxsimum port need to be bigger than\n" + "the minimum port\n");
					}
				} else {
					portListRand.append("please enter a valid maximum port\n");
				}
			} else {
				portListRand.append("please enter a valid minimum port\n");
			}

		} else {
			portListRand.append("please enter a valid IP addres\n");
		}
	}// GEN-LAST:event_startScanRandActionPerformed

	private void StartButtomSlowActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_StartButtomSlowActionPerformed
		Scan temp = new Scan();
		String IP = IPtextSlow.getText();
		String minPort = startPortSlow.getText();
		String maxPort = endPortSlow.getText();
		String groupSize = groupSizeText.getText();
		String waitTime = timetoWait.getText();
		
		if (temp.isValidIP(IP)) {
			if (temp.isValidPort(minPort)) {
				if (temp.isValidPort(maxPort)) {
					if (Integer.parseInt(minPort) <= Integer.parseInt(maxPort)) {
						if(temp.isValidGrop(groupSize, maxPort, minPort)) {
							if(temp.isValidTime(waitTime)) {
								SlowScanThread thread = new SlowScanThread(IP, minPort, maxPort, groupSize, this, temp, waitTime);
								thread.start();
							} else {
								portListSlow.append("please enter a valid wait time\n");
							}
							
						} else {
							portListSlow.append("please enter a valid group size\n");
						}
					} else {
						portListSlow.append("the maxsimum port need to be bigger than\n" + "the minimum port\n");
					}
				} else {
					portListSlow.append("please enter a valid maximum port\n");
				}
			} else {
				portListSlow.append("please enter a valid minimum port\n");
			}

		} else {
			portListSlow.append("please enter a valid IP addres\n");
		}	
	}// GEN-LAST:event_StartButtomSlowActionPerformed

	private void timetoWaitMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_timetoWaitMouseClicked
		timetoWait.setText("");
	}// GEN-LAST:event_timetoWaitMouseClicked

	private void IPtextSmartMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_IPtextSmartMouseClicked
		IPtextSmart.setText("");
	}// GEN-LAST:event_IPtextSmartMouseClicked

	private void IPtextSlowMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_IPtextSlowMouseClicked
		IPtextSlow.setText("");
	}// GEN-LAST:event_IPtextSlowMouseClicked

	private void groupSizeTextMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_groupSizeMouseClicked
		groupSizeText.setText("");
	}// GEN-LAST:event_groupSizeMouseClicked

	private void startPortSlowMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_startPortSlowMouseClicked
		startPortSlow.setText("");
	}// GEN-LAST:event_startPortSlowMouseClicked

	private void endPortSlowMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_endPortSlowMouseClicked
		endPortSlow.setText("");
	}// GEN-LAST:event_endPortSlowMouseClicked

	private void IPtextRandomMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_IPtextRandomMouseClicked
		IPtextRandom.setText("");
	}// GEN-LAST:event_IPtextRandomMouseClicked

	private void startPortRandMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_startPortRandMouseClicked
		startPortRand.setText("");
	}// GEN-LAST:event_startPortRandMouseClicked

	private void endPortRandMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_endPortRandMouseClicked
		endPortRand.setText("");
	}// GEN-LAST:event_endPortRandMouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField IPtextRandom;
	private javax.swing.JTextField IPtextSlow;
	private javax.swing.JTextField IPtextSmart;
	private javax.swing.JButton StartButtomSlow;
	private javax.swing.JTextField endPortRand;
	private javax.swing.JTextField endPortSlow;
	private javax.swing.JTextField timetoWait;
	private javax.swing.JTextField groupSizeText;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextArea portListRand;
	private javax.swing.JTextArea portListSlow;
	private javax.swing.JTextArea portListSmart;
	private javax.swing.JPanel randomScan;
	private javax.swing.JPanel slowScanTab;
	private javax.swing.JPanel smartScanTab;
	private javax.swing.JButton startButtonSmart;
	private javax.swing.JTextField startPortRand;
	private javax.swing.JTextField startPortSlow;
	private javax.swing.JButton startScanRand;
	// End of variables declaration//GEN-END:variables
}
