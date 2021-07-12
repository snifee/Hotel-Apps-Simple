package com.gui;

import com.koneksi.koneksiSQL;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class bookingPanel extends JPanel {
    private JTable jTable1;
    private JScrollPane jScrollPane1;
    private JComboBox sortroomcombobox;
    private JLabel jLabel14;
    private JLabel jLabel3;
    private JPanel headerPanel;
    private DefaultTableModel model;
    private JTable table ;

    public bookingPanel(){
        jTable1 = new JTable();
        jScrollPane1 = new JScrollPane();
        sortroomcombobox = new JComboBox();
        jLabel14 = new JLabel();
        jLabel3 = new JLabel();
        headerPanel = new JPanel();
        model = new DefaultTableModel();
        table = new JTable();

        setPreferredSize(new Dimension((hotelGui.screenWidth-200),hotelGui.screenHeight));
        setBackground(new java.awt.Color(11, 41, 60));

        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        model.addColumn("NO KAMAR");
        model.addColumn("TYPE");
        model.addColumn("HARGA");
        model.addColumn("DATE TAMBAH");
        model.addColumn("KETERSEDIAAN");
        table.setShowGrid(true);
        table.setRowHeight(30);
        loadDataFromDB("SELECT * FROM H_Data_Hotel WHERE Tersedia=1");

        jScrollPane1.setViewportView(table);

        sortroomcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL ROOMS", "STANDARD", "DELUXE", "SUITES" }));
        sortroomcombobox.setMaximumSize(new Dimension(200,30));
        sortroomcombobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (sortroomcombobox.getSelectedItem().toString().equals("DELUXE")){
                    loadDataFromDB("SELECT * FROM H_Data_Hotel WHERE Tersedia=1 AND Type=1");
                }else if (sortroomcombobox.getSelectedItem().toString().equals("STANDARD")){
                    loadDataFromDB("SELECT * FROM H_Data_Hotel WHERE Tersedia=1 AND Type=2");
                }else if(sortroomcombobox.getSelectedItem().toString().equals("SUITES")){
                    loadDataFromDB("SELECT * FROM H_Data_Hotel WHERE Tersedia=1 AND Type=3");
                }else {
                    loadDataFromDB("SELECT * FROM H_Data_Hotel WHERE Tersedia=1");
                }

            }
        });

        jLabel14.setText("SORT");

        try{
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/bs.jpg")));
        }catch (Exception e){

        }


        headerPanel.add(jLabel3);
        headerPanel.setMaximumSize(new Dimension((hotelGui.screenWidth-200),200));
        headerPanel.setBackground(new java.awt.Color(11, 41, 60));

        add(headerPanel);
        add(sortroomcombobox);
        add(jScrollPane1);

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));


    }

    public void loadDataFromDB(String query){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try{
            Connection conn = koneksiSQL.getKoneksi();
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);

            while(resultSet.next()){
                Object[] data = new Object[6];
                data[0] = resultSet.getString("No_ID");
                data[1] = resultSet.getString("Type");
                if (data[1].equals("1")){
                    data[1] = "DELUXE";
                }else if (data[1].equals("2")){
                    data[1] = "STANDARD";
                }else if (data[1].equals("3")){
                    data[1] = "SUITES";
                }
                data[3] = resultSet.getString("Harga");
                data[4] = resultSet.getString("Date_Tambah");
                data[4] = resultSet.getString("Tersedia");
                if (data[4].equals("1")){
                    data[4]="Tersedia";
                }else {
                    data[4] = "Tidak Tersedia";
                }
                model.addRow(data);
            }

            conn.close();
            stmt.close();
        }catch (SQLException e){
            System.err.println(e);
        }
    }
}
