package com.gui;


import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.toedter.calendar.*;

import static java.lang.Integer.parseInt;


public class reservaPanel extends JPanel {
    private JPanel headerPanel;
    private JPanel mainPanel;
    private JLabel noBookingLabel;
    private JLabel nameLabel;
    private JLabel nikLabel;
    private JLabel timeLabel;
    private JLabel phoneNumberLabel;
    private JLabel roomNoLabel;
    private JLabel classLabel;
    private JLabel dateInLabel;
    private JLabel dateOutLabel;
    private JLabel guestLabel;
    private JLabel totalPrice;
    private JTextField nobooktf;
    private JTextField nametf;
    private JComboBox classCB;
    private JButton savebutton;
    private JButton cancelbutton;
    private JLabel jLabel22;
    private javax.swing.JTextField daelet;
    private javax.swing.JTextField priceTf;
    private javax.swing.JTextField timetf;
    private javax.swing.JTextField nikTf;
    private javax.swing.JTextField roomnumtf;
    private javax.swing.JTextField customerstf;
    private javax.swing.JTextField dateintf;
    private JCalendar calendar;
    private JDateChooser dateChooserIn;
    private JDateChooser dateChooserOut;
    private invoicePanel invo;

    private int NIK;
    private String NAMA;
    private java.sql.Date DATE_IN;
    private java.sql.Date DATE_OUT;
    private int NO_ORDER;
    private int ROOM_NUM;
    private int  NUM_GUEST;
    private String ROOM_TYPE;
    private int TOTAL_PRICE;
    private String BUFFER;


    public reservaPanel(JFrame frame){
        noBookingLabel = new JLabel();
        nameLabel = new JLabel();
        nikLabel = new JLabel();
        phoneNumberLabel = new JLabel();
        classLabel = new JLabel();
        dateOutLabel = new JLabel();
        dateInLabel = new JLabel();
        timeLabel = new JLabel();
        roomNoLabel = new JLabel();
        guestLabel = new JLabel();
        nobooktf = new JTextField();
        nametf = new JTextField();
        savebutton = new JButton();
        cancelbutton = new JButton();
        jLabel22 = new JLabel();
        nobooktf = new javax.swing.JTextField();
        nametf = new javax.swing.JTextField();
        daelet = new javax.swing.JTextField();
        nikTf = new javax.swing.JTextField();
        dateintf = new javax.swing.JTextField();
        timetf = new javax.swing.JTextField();
        roomnumtf = new javax.swing.JTextField();
        customerstf = new javax.swing.JTextField();
        classCB = new javax.swing.JComboBox<>();
        savebutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        totalPrice = new javax.swing.JLabel();
        priceTf = new javax.swing.JTextField();
        calendar = new JCalendar();
        mainPanel = new JPanel();
        headerPanel = new JPanel();
        dateChooserIn = new JDateChooser();
        dateChooserIn.setDateFormatString("dd MMMM yyyy");
        dateChooserOut = new JDateChooser();
        invo = new invoicePanel();
        dateChooserOut.setDateFormatString("dd MMMM yyyy");
        Dimension sizeForTextField = new Dimension(700,50);
        Dimension sizeForPref = new Dimension(700,35);

        //==============================================================================================================

        setPreferredSize(new Dimension((hotelGui.screenWidth-200),hotelGui.screenHeight));
        setBackground(new java.awt.Color(11, 41, 60));

        mainPanel.setBackground(new java.awt.Color(11, 41, 60));
        headerPanel.setBackground(new java.awt.Color(11, 41, 60));

        noBookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        noBookingLabel.setText("NO.BOOKING");
        nobooktf.setMaximumSize(sizeForTextField);
        nobooktf.setPreferredSize(sizeForPref);

        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("NAME");
        nametf.setMaximumSize(sizeForTextField);
        nametf.setPreferredSize(sizeForPref);

        nikLabel.setForeground(new java.awt.Color(255, 255, 255));
        nikLabel.setText("NIK");
        nikTf.setMaximumSize(sizeForTextField);
        nikTf.setPreferredSize(sizeForPref);

        dateInLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateInLabel.setText("DATE IN");
        dateChooserIn.setMaximumSize(sizeForTextField);
        dateChooserIn.setPreferredSize(sizeForPref);

        dateOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateOutLabel.setText("DATE OUT");
        dateChooserOut.setMaximumSize(sizeForTextField);
        dateChooserOut.setPreferredSize(sizeForPref);

        roomNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomNoLabel.setText("ROOM NUMBER");
        roomnumtf.setMaximumSize(sizeForTextField);
        roomnumtf.setPreferredSize(sizeForPref);

        classLabel.setForeground(new java.awt.Color(255, 255, 255));
        classLabel.setText("CLASS");
        classCB.setMaximumSize(sizeForTextField);
        classCB.setPreferredSize(sizeForPref);

        guestLabel.setForeground(new java.awt.Color(255, 255, 255));
        guestLabel.setText("GUESTS");
        customerstf.setMaximumSize(sizeForTextField);
        customerstf.setPreferredSize(sizeForPref);

        totalPrice.setForeground(new java.awt.Color(255, 255, 255));
        totalPrice.setText("TOTAL PRICE");
        priceTf.setMaximumSize(sizeForTextField);
        priceTf.setPreferredSize(sizeForPref);


        classCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STANDARD", "DELUXE", "SUITES" }));
        savebutton.setBackground(Color.white);
        savebutton.setText("SAVE");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButton1();
            }
        });

        cancelbutton.setBackground(Color.WHITE);
        cancelbutton.setText("CANCEL");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTextField();
            }
        });

        try {
            jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/hr.jpg"))); // NOI18N
            savebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/save.png"))); // NOI18N
            cancelbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/caic_1.png"))); // NOI18N
        }catch (Exception e){

        }

        javax.swing.GroupLayout reservepanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(reservepanelLayout);
        reservepanelLayout.setHorizontalGroup(reservepanelLayout.createSequentialGroup()
            .addGroup(reservepanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(noBookingLabel)
                    .addComponent(nameLabel)
                    .addComponent(dateInLabel)
                    .addComponent(dateOutLabel)
                    .addComponent(nikLabel)
                    .addComponent(roomNoLabel)
                    .addComponent(guestLabel)
                    .addComponent(classLabel)
                    .addComponent(totalPrice))
                .addGroup(reservepanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(50)
                        .addComponent(nobooktf)
                        .addComponent(nametf)
                        .addComponent(dateChooserIn)
                        .addComponent(dateChooserOut)
                        .addComponent(nikTf)
                        .addComponent(roomnumtf)
                        .addComponent(customerstf)
                        .addComponent(classCB)
                        .addComponent(priceTf)
                .addGroup(reservepanelLayout.createSequentialGroup()
                .addComponent(savebutton)
                        .addComponent(cancelbutton))
                        )
        );

        reservepanelLayout.setVerticalGroup(
                reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(reservepanelLayout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nobooktf)
                                        .addComponent(noBookingLabel))
                                .addGap(19, 19, 19)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nametf)
                                        .addComponent(nameLabel))
                                .addGap(16, 16, 16)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nikTf)
                                        .addComponent(nikLabel))
                                .addGap(18, 18, 18)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateChooserIn)
                                        .addComponent(dateInLabel))
                                .addGap(18, 18, 18)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateChooserOut)
                                        .addComponent(dateOutLabel))
                                .addGap(18, 18, 18)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(roomnumtf)
                                        .addComponent(roomNoLabel))
                                .addGap(18, 18, 18)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(guestLabel))
                                .addGap(18, 18, 18)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(classLabel)
                                        .addComponent(classCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(reservepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalPrice)
                                        .addComponent(priceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(reservepanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(savebutton)
                                .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 5978, Short.MAX_VALUE))
        );


        headerPanel.add(jLabel22);
        add(headerPanel);
        add(mainPanel);
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
    }


    public void actionButton1(){
        try{
            NAMA = nametf.getText();
            NIK = parseInt(nikTf.getText());
            NO_ORDER = parseInt(nobooktf.getText());
            ROOM_NUM = parseInt(roomnumtf.getText());
            DATE_IN = new java.sql.Date(dateChooserIn.getDate().getTime());
            DATE_OUT = new java.sql.Date(dateChooserOut.getDate().getTime());
            NUM_GUEST = parseInt(customerstf.getText());
            ROOM_TYPE = classCB.getSelectedItem().toString();
            TOTAL_PRICE = parseInt(priceTf.getText());

            clearTextField();
            sendDataToDB();
            invo.setVisible(true);
            String b1 = String.valueOf(NO_ORDER);
            String b2 = String.valueOf(TOTAL_PRICE);
            getNoBOOK();
            invo.setInvoice(BUFFER,NAMA,DATE_IN.toString(),DATE_OUT.toString(),ROOM_TYPE,b2);
        }catch (Exception e){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),e.getMessage(),"Error",JOptionPane.WARNING_MESSAGE);
        }

    }

    private  void sendDataToDB(){
        int buffer;
        try {
            if (ROOM_TYPE.equals("DELUXE")){
                buffer =1;
            }else if (ROOM_TYPE.equals("STANDARD")){
                buffer=2;
            }else {
                buffer=3;
            };
            Connection conn =  com.koneksi.koneksiSQL.getKoneksi();
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO `H_Pesan_Hotel` (`NIK`, `nama`, `date_in`, `date_out`, `jumlah_penginap`, `tipe_kamar`, `no_order`, `NO_Kamar`, `total_biaya`) VALUES ('%d', '%s', '%s', '%s', '%d', '%d', '0', '%d', '%d')";
            query = String.format(query,NIK, NAMA, DATE_IN, DATE_OUT, NUM_GUEST, buffer,ROOM_NUM, TOTAL_PRICE);
            System.out.println(query);
            stmt.execute(query);
            stmt.close();
            conn.close();
        }catch (SQLException e){
        }
    }

    private void getNoBOOK(){
        try{
            Connection conn =  com.koneksi.koneksiSQL.getKoneksi();
            Statement stmt = conn.createStatement();
            String query = "SELECT no_order FROM H_Pesan_Hotel";

            ResultSet rs = stmt.executeQuery(query);
            System.out.println(query);
            stmt.close();
            conn.close();
            BUFFER = rs.getString("no_order");

        }catch (Exception e){

        }
    }

    private void clearTextField(){
        nametf.setText("");
        nobooktf.setText("");
        daelet.setText("");
        dateChooserIn.cleanup();
        dateChooserOut.cleanup();
        nikTf.setText("");
        timetf.setText("");
        roomnumtf.setText("");
        customerstf.setText("");
        priceTf.setText("");
    }
}
