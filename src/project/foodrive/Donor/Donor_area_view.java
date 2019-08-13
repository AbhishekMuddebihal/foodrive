/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.foodrive.Donor;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.foodrive.MyConnection;
import project.foodrive.Volunteer.Notification_panel;
import project.foodrive.Volunteer.Notification_record_panel;

/**
 *
 * @author INTEL COREi3
 */
public class Donor_area_view extends javax.swing.JPanel {

    /**
     * Creates new form Donor_profile_view
     */
    private int donor_id=1;
    private int area_id=1;
    public Donor_area_view(){
        initComponents();
        
    }
    public Donor_area_view(int donorid,int areaid){
        donor_id=donorid;
        area_id=areaid;
        initComponents();
        load_donor();
    }
    private void load_donor(){
        System.out.println("here donor");
        try {
            System.out.println("here 0");
            Connection c=null;
            MyConnection mo= new MyConnection();
            c=mo.getMyConnection();
            System.out.println("connected");
            String query="SELECT * FROM donor WHERE donor_id=?;";

            
            PreparedStatement pst=c.prepareStatement(query);
            pst.setInt(1,donor_id);
            ResultSet rs=pst.executeQuery();
             
            while(rs.next()){
               
               this.get_address_line.setText(rs.getString("address_line1"));
               this.get_city.setText(rs.getString("city"));
               this.get_state.setText(rs.getString("state"));
               this.get_country.setText(rs.getString("country"));
               this.get_area_id.setText(""+rs.getInt("area_id"));
               this.get_name.setText(rs.getString("donor_name"));
              
            }
            
            String query1="SELECT area_name,creation_date FROM area WHERE area_id=?;";
            PreparedStatement pst1=c.prepareStatement(query1);
            pst1.setInt(1,area_id);
            ResultSet rs1=pst1.executeQuery();
            
            while(rs1.next()){
                this.get_area.setText(rs1.getString("area_name"));
                this.get_creation_date.setText(rs1.getString("creation_date"));   
            }
            
            
            
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Notification_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile = new javax.swing.JLabel();
        get_name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        get_address_line = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        get_country = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        get_state = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        get_city = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        get_area_id = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        get_creation_date = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        get_area = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(850, 550));

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/area.png"))); // NOI18N
        profile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        get_name.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        get_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        get_name.setText("Address Line");
        get_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Address Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14)))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(539, 180));

        get_address_line.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        get_address_line.setText("Gujrath Colony");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Address Line");

        get_country.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        get_country.setText("India");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Country");

        get_state.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        get_state.setText("jLabel10");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("State");

        get_city.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        get_city.setText("jLabel11");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("City");

        get_area_id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        get_area_id.setText("jLabel12");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Area_id");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Creation Date");

        get_creation_date.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        get_creation_date.setText("jLabel11");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Areaa");

        get_area.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        get_area.setText("jLabel12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(get_address_line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(get_country, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(get_state, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(get_city, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(get_area_id, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(get_creation_date, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(get_area, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(289, 289, 289))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(get_area_id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(get_area, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(get_address_line))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(get_country))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(get_state))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(get_city))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(get_creation_date))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 156, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(profile)
                .addContainerGap(360, Short.MAX_VALUE))
            .addComponent(get_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile)
                .addGap(18, 18, 18)
                .addComponent(get_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel get_address_line;
    private javax.swing.JLabel get_area;
    private javax.swing.JLabel get_area_id;
    private javax.swing.JLabel get_city;
    private javax.swing.JLabel get_country;
    private javax.swing.JLabel get_creation_date;
    private javax.swing.JLabel get_name;
    private javax.swing.JLabel get_state;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}