/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Abdelrahman Khaled
 */
public class DeterministicInputScreen extends javax.swing.JFrame {

    /**
     * Creates new form M_M_1InputScreen
     */
    public DeterministicInputScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        interArrivalTimeLabel = new javax.swing.JLabel();
        interArrivalTimeInput = new javax.swing.JTextField();
        serviceTimeLabel = new javax.swing.JLabel();
        serviceTimeInput = new javax.swing.JTextField();
        systemCapacityLabel = new javax.swing.JLabel();
        systemCapacityInput = new javax.swing.JTextField();
        mLabel = new javax.swing.JLabel();
        mInput = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(50, 50, 50));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("D / D / 1 / (K - 1) / FCFS");

        interArrivalTimeLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        interArrivalTimeLabel.setForeground(new java.awt.Color(130, 0, 0));
        interArrivalTimeLabel.setText("Inter Arrival Time");

        interArrivalTimeInput.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        interArrivalTimeInput.setForeground(new java.awt.Color(50, 50, 50));
        interArrivalTimeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interArrivalTimeInputActionPerformed(evt);
            }
        });

        serviceTimeLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        serviceTimeLabel.setForeground(new java.awt.Color(130, 0, 0));
        serviceTimeLabel.setText("Service Time");

        serviceTimeInput.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        serviceTimeInput.setForeground(new java.awt.Color(50, 50, 50));

        systemCapacityLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        systemCapacityLabel.setForeground(new java.awt.Color(130, 0, 0));
        systemCapacityLabel.setText("System Capacity");

        systemCapacityInput.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        systemCapacityInput.setForeground(new java.awt.Color(50, 50, 50));

        mLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        mLabel.setForeground(new java.awt.Color(130, 0, 0));
        mLabel.setText("M");

        mInput.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        mInput.setForeground(new java.awt.Color(50, 50, 50));
        mInput.setText("0");

        enter.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        enter.setForeground(new java.awt.Color(0, 0, 130));
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 130));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(systemCapacityLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(interArrivalTimeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serviceTimeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(systemCapacityInput)
                            .addComponent(mInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(serviceTimeInput)
                            .addComponent(interArrivalTimeInput, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interArrivalTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interArrivalTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemCapacityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(systemCapacityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void interArrivalTimeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interArrivalTimeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interArrivalTimeInputActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        boolean[] flag = new boolean[4];
        double interArrivalTime = 0, serviceTime = 0;
        int systemCapacity = 0, M = 0;
        try
        {
            String input = interArrivalTimeInput.getText().replaceAll(" ", "");
            if(input.split("/").length <= 2)
            {
                if(input.split("/").length == 1)
                {
                    interArrivalTime = Double.parseDouble(input);
                    flag[0] = true;
                }
                else
                {
                    double p1, p2;
                    p1 = Double.parseDouble(input.split("/")[0]);
                    p2 = Double.parseDouble(input.split("/")[1]);
                    if(p2 == 0)
                        interArrivalTimeInput.setText("error");
                    else
                    {
                        interArrivalTime = p1 / p2;
                        flag[0] = true;
                    }
                }
            }
            else
                interArrivalTimeInput.setText("error");
        } catch(Exception e) {
            interArrivalTimeInput.setText("error");
        }
        try
        {
            String input = serviceTimeInput.getText().replaceAll(" ", "");
            if(input.split("/").length <= 2)
            {
                if(input.split("/").length == 1)
                {
                    serviceTime = Double.parseDouble(input);
                    flag[1] = true;
                }
                else
                {
                    double p1, p2;
                    p1 = Double.parseDouble(input.split("/")[0]);
                    p2 = Double.parseDouble(input.split("/")[1]);
                    if(p2 == 0)
                        serviceTimeInput.setText("error");
                    else
                    {
                        serviceTime = p1 / p2;
                        flag[1] = true;
                    }
                }
            }
            else
                serviceTimeInput.setText("error");
        } catch(Exception e) {
            serviceTimeInput.setText("error");
        }
        try
        {
            String input = systemCapacityInput.getText().replaceAll(" ", "");
            systemCapacity = Integer.parseInt(input);
            flag[2] = true;
        } catch(Exception e) {
            systemCapacityInput.setText("error");
        }
        try
        {
            String input = mInput.getText().replaceAll(" ", "");
            M = Integer.parseInt(input);
            flag[3] = true;
        } catch(Exception e) {
            mInput.setText("error");
        }
        if(flag[0] && flag[1] && flag[2] && flag[3])
        {
            DeterministicOutputScreen screen = new DeterministicOutputScreen(new DeterministicQS(systemCapacity, interArrivalTime, serviceTime, M));
            screen.setLocationRelativeTo(null);
            screen.setVisible(true);
            this.setVisible(false);
        }
        else if(flag[0] && flag[1] && flag[2])
        {
            DeterministicOutputScreen screen = new DeterministicOutputScreen(new DeterministicQS(systemCapacity, interArrivalTime, serviceTime));
            screen.setLocationRelativeTo(null);
            screen.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_enterActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        StartScreen screen = new StartScreen();
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(DeterministicInputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeterministicInputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeterministicInputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeterministicInputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeterministicInputScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton enter;
    private javax.swing.JTextField interArrivalTimeInput;
    private javax.swing.JLabel interArrivalTimeLabel;
    private java.util.List list1;
    private javax.swing.JTextField mInput;
    private javax.swing.JLabel mLabel;
    private javax.swing.JTextField serviceTimeInput;
    private javax.swing.JLabel serviceTimeLabel;
    private javax.swing.JTextField systemCapacityInput;
    private javax.swing.JLabel systemCapacityLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
