/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.foodrive.Donor;

import project.foodrive.Monitor.*;
import project.foodrive.Admin.*;
import Testing.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.border.EtchedBorder;
import project.foodrive.MyConnection;
import project.foodrive.Volunteer.Notification_panel;
import project.foodrive.Volunteer.Notification_record_panel;

/**
 *
 * @author abcd
 */
public class Donor_drive_RecordPanel extends javax.swing.JPanel {

    /**
     * Creates new form recordPanel
     */
    private int donor_id=-1;
    private int area_id=-1;
    private int drive_id=-1;
    Donor_drive_listing_view parent;
    private String drive_status="";
    private String drive_start_time="";
    
    
    public Donor_drive_RecordPanel() {
        initComponents();
    }
    
    public Donor_drive_RecordPanel(int donorid,int areaid,int driveid,Donor_drive_listing_view aThis) {
        initComponents();
        donor_id=donorid;
        area_id=areaid;
        drive_id=driveid;
        parent=aThis;
        multi_purpose_btn.setText("");
        multi_purpose_btn.setOpaque(false);
        multi_purpose_btn.setEnabled(false);
        load_details();
    }
    
    private Color recordPanMouseEnterColor = new Color(220,220,220);
    private Color recordPanMouseExitColor = new Color(255,255,255);

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JLabel();
        status_text = new javax.swing.JLabel();
        start_time_text = new javax.swing.JLabel();
        updateIcon = new javax.swing.JLabel();
        removeIcon = new javax.swing.JLabel();
        viewDetailsIcon = new javax.swing.JLabel();
        max_vol_text = new javax.swing.JLabel();
        multi_purpose_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(790, 40));
        setMinimumSize(new java.awt.Dimension(790, 40));
        setPreferredSize(new java.awt.Dimension(790, 40));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        id.setText("<id>");

        status_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        status_text.setText("status");

        start_time_text.setBackground(new java.awt.Color(204, 204, 204));
        start_time_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        start_time_text.setText("Start_time");

        updateIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil-edit-button-small.png"))); // NOI18N
        updateIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateIcon.setMaximumSize(new java.awt.Dimension(40, 40));
        updateIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        updateIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        updateIcon.setRequestFocusEnabled(false);
        updateIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateIconMouseExited(evt);
            }
        });

        removeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/removebtn-small.png"))); // NOI18N
        removeIcon.setMaximumSize(new java.awt.Dimension(40, 40));
        removeIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        removeIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        removeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeIconMouseExited(evt);
            }
        });

        viewDetailsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewDetailsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/details-small.png"))); // NOI18N
        viewDetailsIcon.setAlignmentY(1.0F);
        viewDetailsIcon.setMaximumSize(new java.awt.Dimension(40, 40));
        viewDetailsIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        viewDetailsIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        viewDetailsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDetailsIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDetailsIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDetailsIconMouseExited(evt);
            }
        });

        max_vol_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        max_vol_text.setText("max_volunteer");
        max_vol_text.setPreferredSize(new java.awt.Dimension(50, 18));

        multi_purpose_btn.setBackground(new java.awt.Color(102, 102, 255));
        multi_purpose_btn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        multi_purpose_btn.setForeground(new java.awt.Color(255, 255, 255));
        multi_purpose_btn.setText("Donate");
        multi_purpose_btn.setContentAreaFilled(false);
        multi_purpose_btn.setOpaque(true);
        multi_purpose_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi_purpose_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(status_text, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(start_time_text, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(max_vol_text, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(multi_purpose_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewDetailsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewDetailsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(removeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status_text)
                            .addComponent(start_time_text)
                            .addComponent(max_vol_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(multi_purpose_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        this.setBackground(recordPanMouseEnterColor);
        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
        this.setBorder(raisedBevelBorder);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.setBackground(recordPanMouseExitColor);
        Border raisedEtchedBorder = new EtchedBorder(EtchedBorder.RAISED);
        this.setBorder(raisedEtchedBorder);
    }//GEN-LAST:event_formMouseExited

    private void viewDetailsIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsIconMouseEntered
        // TODO add your handling code here:
        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
        this.viewDetailsIcon.setBorder(raisedBevelBorder); 
        formMouseEntered(evt);
    }//GEN-LAST:event_viewDetailsIconMouseEntered

    private void viewDetailsIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsIconMouseExited
        // TODO add your handling code here:
        this.viewDetailsIcon.setBorder(BorderFactory.createEmptyBorder());
        formMouseExited(evt);
    }//GEN-LAST:event_viewDetailsIconMouseExited

    private void updateIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateIconMouseEntered
        // TODO add your handling code here:
        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
        this.updateIcon.setBorder(raisedBevelBorder); 
        formMouseEntered(evt);
    }//GEN-LAST:event_updateIconMouseEntered

    private void updateIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateIconMouseExited
        // TODO add your handling code here:
        this.updateIcon.setBorder(BorderFactory.createEmptyBorder());
        formMouseExited(evt);
    }//GEN-LAST:event_updateIconMouseExited

    private void removeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIconMouseEntered
        // TODO add your handling code here:
        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
        this.removeIcon.setBorder(raisedBevelBorder); 
        formMouseEntered(evt);
    }//GEN-LAST:event_removeIconMouseEntered

    private void removeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIconMouseExited
        // TODO add your handling code here:
        this.removeIcon.setBorder(BorderFactory.createEmptyBorder());
        formMouseExited(evt);
    }//GEN-LAST:event_removeIconMouseExited

    private void viewDetailsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsIconMouseClicked
        // TODO add your handling code here:
        Donor_drive_details_frame vol_frame=new Donor_drive_details_frame(donor_id,drive_id,area_id);
        vol_frame.setVisible(true);
        
        //mainFrame.setFocusableWindowState(false);
        //JDialog dialog=new JDialog(vol_frame, "Volunteer Details", true);
        //dialog.setVisible(true);
    }//GEN-LAST:event_viewDetailsIconMouseClicked

    private void multi_purpose_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi_purpose_btnActionPerformed
        // TODO add your handling code here:
        if(multi_purpose_btn.getText().equals("Donate")){
            Donate_food_confirmation donateFrame=new Donate_food_confirmation(drive_id, donor_id, drive_start_time);
            donateFrame.show();
        }
    }//GEN-LAST:event_multi_purpose_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JLabel max_vol_text;
    private javax.swing.JButton multi_purpose_btn;
    private javax.swing.JLabel removeIcon;
    private javax.swing.JLabel start_time_text;
    private javax.swing.JLabel status_text;
    private javax.swing.JLabel updateIcon;
    private javax.swing.JLabel viewDetailsIcon;
    // End of variables declaration//GEN-END:variables

    
    
    private void load_details() {
        try {
            Connection c=null;
            MyConnection mo= new MyConnection();
            c=mo.getMyConnection();
            
            String query="SELECT * FROM drive WHERE drive_id=?;";
            
            PreparedStatement pst=c.prepareStatement(query);
            pst.setInt(1, drive_id);
            
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                this.id.setText(""+rs.getInt("drive_id"));
                
                drive_status=rs.getString("status");
                this.status_text.setText(drive_status);
                drive_start_time=rs.getString("start_time");
                this.start_time_text.setText(drive_start_time);
                if(rs.getString("max_volunteers")==null)
                {
                    this.max_vol_text.setText("-");
                }
                else{
                    this.max_vol_text.setText(rs.getString("max_volunteers"));
                }
                if(drive_status.equals("Initiated"))
                { 
                    multi_purpose_btn.setText("Donate");
                    multi_purpose_btn.setOpaque(true);
                    multi_purpose_btn.setEnabled(true);
                }
                else
                {
                    multi_purpose_btn.setText("");
                    multi_purpose_btn.setOpaque(false);
                    multi_purpose_btn.setEnabled(false);
                }
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Notification_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}