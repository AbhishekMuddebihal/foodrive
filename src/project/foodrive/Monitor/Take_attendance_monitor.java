/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.foodrive.Monitor;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.foodrive.MyConnection;
import project.foodrive.Volunteer.Notification_panel;

/**
 *
 * @author abcd
 */
public class Take_attendance_monitor extends javax.swing.JFrame {

    /**
     * Creates new form Volunteer_details_frame
     */
    private int area_id;
    private int drive_id;
    Drive_listing_view parent;
    public Vector attendence_vector=new Vector(50, 10);
    
    public Take_attendance_monitor() {
        initComponents();
    }
    
    public Take_attendance_monitor(int driveid,int areaid,Drive_listing_view parentv) {
        initComponents();
        parent=parentv;
        area_id=areaid;
        drive_id=driveid;
        load_volunteers("");
    }

   
    
     private void setColorToAllSearchEle(Color c){
        jPanel3.setBackground(c);
        tfSearch.setBackground(c);
    }

    private Color mouseExitedColor = new Color(240,240,240);
    private Color mouseEnteredColor = new Color(190,190,190);
    private Color mouseClickedColor = new Color(215,219,227);
    private Color passiveFontColor = new Color(51,51,51);
    private Color activeFontColor = new Color(51,51,51);
    //private int selected_option_from_left=0;
    private Color searchMouseEnterColor = new Color(220,220,220);
    private Color searchMouseExitColor = new Color(240,240,240);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        records_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        total_req_count = new javax.swing.JLabel();
        vol_count = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        submit_btn = new javax.swing.JButton();
        total_req_count1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 550));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(850, 550));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(850, 550));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 530));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Attendance");

        jScrollPane2.setMaximumSize(new java.awt.Dimension(790, 32767));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(790, 300));

        records_panel.setBackground(new java.awt.Color(255, 255, 255));
        records_panel.setMaximumSize(new java.awt.Dimension(800, 32767));
        records_panel.setLayout(new javax.swing.BoxLayout(records_panel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(records_panel);

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        tfSearch.setBackground(new java.awt.Color(240, 240, 240));
        tfSearch.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(153, 153, 153));
        tfSearch.setText("Search");
        tfSearch.setBorder(null);
        tfSearch.setSelectionColor(new java.awt.Color(102, 102, 102));
        tfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfSearchMousePressed(evt);
            }
        });
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSearchKeyTyped(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search1.png"))); // NOI18N
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFocusable(false);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 51, 255));
        jLabel3.setMaximumSize(new java.awt.Dimension(0, 2));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        total_req_count.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        total_req_count.setText("Total Requested Volunteer : ");

        vol_count.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        vol_count.setText("count");

        jButton4.setBackground(new java.awt.Color(67, 134, 250));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.setToolTipText("");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setMaximumSize(new java.awt.Dimension(51, 25));
        jButton4.setMinimumSize(new java.awt.Dimension(51, 25));
        jButton4.setOpaque(true);
        jButton4.setPreferredSize(new java.awt.Dimension(51, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        submit_btn.setBackground(new java.awt.Color(67, 134, 250));
        submit_btn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        submit_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn.setText("Submit");
        submit_btn.setContentAreaFilled(false);
        submit_btn.setMaximumSize(new java.awt.Dimension(51, 30));
        submit_btn.setMinimumSize(new java.awt.Dimension(51, 30));
        submit_btn.setOpaque(true);
        submit_btn.setPreferredSize(new java.awt.Dimension(51, 30));
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        total_req_count1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        total_req_count1.setForeground(new java.awt.Color(0, 0, 204));
        total_req_count1.setText("** Click on Present/Absent to toggle attendance.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(total_req_count1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(total_req_count)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vol_count)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(total_req_count1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(total_req_count)
                        .addComponent(vol_count)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void tfSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseEntered
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseEnterColor);
    }//GEN-LAST:event_tfSearchMouseEntered

    private void tfSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseExited
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseExitColor);
    }//GEN-LAST:event_tfSearchMouseExited

    private void tfSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMousePressed
        // TODO add your handling code here:
        tfSearch.setCaretPosition(0);
    }//GEN-LAST:event_tfSearchMousePressed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        // TODO add your handling code here:
        if(tfSearch.getForeground()!=Color.BLACK)
        {
            if(tfSearch.getText().equals("Search"))
            { tfSearch.setText("");
            }

        }
        tfSearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_tfSearchKeyPressed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        // TODO add your handling code here:
        if(tfSearch.getText().isEmpty()==true)
        {
            tfSearch.setText("Search");
            tfSearch.setCaretPosition(0);
            tfSearch.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_tfSearchKeyReleased

    private void tfSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyTyped
        String search_text=tfSearch.getText();
        if(evt.getKeyChar()==java.awt.event.KeyEvent.VK_BACK_SPACE)
        {
            System.out.println("Im in BACKSPACE");
            
        }
        else
        {
            search_text=search_text+evt.getKeyChar();
            
        }
        System.out.println(evt.getKeyChar());
        System.out.println(search_text+" "+search_text.length());
        load_volunteers(search_text);
    }//GEN-LAST:event_tfSearchKeyTyped

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseEnterColor);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseExitColor);
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseEnterColor);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseExitColor);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.revalidate();
        records_panel.repaint();
    }//GEN-LAST:event_jPanel1ComponentShown

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        int optionSelected=JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning..!", JOptionPane.YES_NO_OPTION);
        if(optionSelected==JOptionPane.YES_OPTION){
        
            System.out.println("Vectorr size "+attendence_vector.size());
            int size=attendence_vector.size();
            for(int i=0;i<size;i++)
            {
                try {
                    int present_member=(int) attendence_vector.elementAt(i);
                    Connection c=null;
                    MyConnection mo= new MyConnection();
                    c=mo.getMyConnection();
                    String query="UPDATE attendance SET attendance_flag =3,datetime=NOW() WHERE member_id = ? and drive_id = ?;";

                    PreparedStatement pst=c.prepareStatement(query);
                    pst.setInt(1, present_member);
                    pst.setInt(2, drive_id);
                    pst.executeUpdate();
                       c.close();

                } catch (SQLException ex) {
                    Logger.getLogger(Take_attendance_monitor.class.getName()).log(Level.SEVERE, null, ex);
                }



            }

            JOptionPane.showMessageDialog(null, "Attendance is marked..!");
            parent.refresh();
            this.dispose();
        }
    }//GEN-LAST:event_submit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Take_attendance_monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Take_attendance_monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Take_attendance_monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Take_attendance_monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Take_attendance_monitor().setVisible(true);
            }
        });
    }

    private void load_volunteers(String searchstr)
    {
        try {
            Connection c=null;
            MyConnection mo= new MyConnection();
            c=mo.getMyConnection();
            
            String query="SELECT m.member_id,a.drive_id " +
                        "FROM attendance a " +
                        "JOIN member m " +
                        "ON a.member_id=m.member_id " +
                        "WHERE a.drive_id=? " +    
                        "AND CONCAT_WS(',',m.fname,m.lname,m.gender,a.member_id) LIKE '%"+searchstr+"%' " +
                        "AND a.attendance_flag<>3;";
            
            PreparedStatement pst=c.prepareStatement(query);
            pst.setInt(1, drive_id);
            ResultSet rs=pst.executeQuery();
            records_panel.removeAll();
            int count=0;
            while(rs.next()){
                
                records_panel.add(new Attendance_RecordPanel(drive_id, rs.getInt("member_id"),this));
                records_panel.revalidate();
                records_panel.repaint();
                count+=1;
            }
            vol_count.setText(""+count);
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Monitor_Notification_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel records_panel;
    private javax.swing.JButton submit_btn;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JLabel total_req_count;
    private javax.swing.JLabel total_req_count1;
    private javax.swing.JLabel vol_count;
    // End of variables declaration//GEN-END:variables
}
