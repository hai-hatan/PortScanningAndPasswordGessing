package PasswordGessing;

public class GUIPW extends javax.swing.JFrame {

	PasswordGussingThread thread;
	
    public GUIPW() {
    	thread = new PasswordGussingThread();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        startPWG = new javax.swing.JButton();
        IPtext = new javax.swing.JTextField();
        portText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PWtext = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startPWG.setText("start password gussing");
        startPWG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPWGActionPerformed(evt);
            }
        });

        IPtext.setText("the IP of the target");
        IPtext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IPtextMouseClicked(evt);
            }
        });

        portText.setText("the open port of the target");
        portText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                portTextMouseClicked(evt);
            }
        });
        
        usernameText.setText("the user name of the target");
        usernameText.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextMouseClicked(evt);
            }
    });
        PWtext.setColumns(20);
        PWtext.setRows(5);
        jScrollPane1.setViewportView(PWtext);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(IPtext, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startPWG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(portText)
                    .addComponent(usernameText, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startPWG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IPtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    @SuppressWarnings("deprecation")
	private void startPWGActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	if(thread.isAlive()) {
    		thread.stop();
        	startPWG.setText("start password gussing");
    	}
    	
    	String IP=IPtext.getText();
    	String port = portText.getText();
    	Login log = new Login();
    	String username = usernameText.getText();
    	if (log.isValidIP(IP)) {
    		if(log.isValidPort(port)) {
    			if(!thread.isIni) {
    			startPWG.setText("stop password gussing");
    			thread.setGui(this);
    			thread.setIP(IP);
    			thread.setLog(log);
    			thread.setUser(username);
    			thread.setPort(port);
    			thread.setIni();
    			thread.start();
    			} else {
    				thread.resume();
    			}
    		} else {
        		PWtext.append("please enter a valid Port\n");

    		}
    	} else {
    		PWtext.append("please enter a valid IP addres\n");
    	}
    }                                        
                          

	private void IPtextMouseClicked(java.awt.event.MouseEvent evt) {                                    
        IPtext.setText("");
    }                                   

    private void portTextMouseClicked(java.awt.event.MouseEvent evt) {                                      
        portText.setText("");
    }                                             
    private void usernameTextMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	usernameText.setText("");
    }                                         

    public synchronized javax.swing.JTextArea getPWtext() {
  		return PWtext;
  	}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField IPtext;
    private javax.swing.JTextArea PWtext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField portText;
    private javax.swing.JButton startPWG;
    private javax.swing.JTextField usernameText;
}