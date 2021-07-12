package com.gui;

import com.koneksi.koneksiSQL;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class reportPanel extends JPanel {
    private JPanel headerPanel;
    private JLabel reportLabel;
    private JTable table;
    private JScrollPane jScrollPane4;
    private JButton reportButton1;
    private JButton reportButton2;
    private DefaultTableModel model;


    public reportPanel() {
        headerPanel = new JPanel();
        reportLabel = new JLabel();
        jScrollPane4 = new JScrollPane();
        table = new JTable();
        reportButton1 = new JButton();
        reportButton2 = new JButton();
        model = new DefaultTableModel();

        setBackground(new java.awt.Color(11, 41, 60));
        setPreferredSize(new Dimension((hotelGui.screenWidth-200),hotelGui.screenHeight));


        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        model.addColumn("NO ORDER");
        model.addColumn("NAMA");
        model.addColumn("NIK");
        model.addColumn("JUMLAH PENGINAP");
        model.addColumn("NO KAMAR");
        model.addColumn("TIPE KAMAR");
        model.addColumn("DATE IN");
        model.addColumn("DATE OUT");
        model.addColumn("TOTAL BIAYA");
        table.setRowHeight(30);
        loadDataFromDB();

        jScrollPane4.setViewportView(table);

        reportButton1.setBackground(new java.awt.Color(255, 255, 255));
        reportButton2.setBackground(new java.awt.Color(255, 255, 255));

        reportButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataFromDB();
            }
        });


        try{
            reportLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/report.jpg"))); // NOI18N
//            reportButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/hotel.png"))); // NOI18N
        }catch (Exception e){

        }

        reportButton2.setText("RELOAD");

        headerPanel.add(reportLabel);
        headerPanel.setBackground(new java.awt.Color(11, 41, 60));
        headerPanel.setMaximumSize(new Dimension((hotelGui.screenWidth-200),200));

        add(headerPanel);
        add(reportButton2);
        add(jScrollPane4);

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    }

    public void loadDataFromDB(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try{
            Connection conn = koneksiSQL.getKoneksi();
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM H_Pesan_Hotel");

            while(resultSet.next()){
                Object[] data = new Object[9];
                data[0] = resultSet.getString("no_order");
                data[1] = resultSet.getString("nama");
                data[2] = resultSet.getString("NIK");
                data[3] = resultSet.getString("jumlah_penginap");
                data[4] = resultSet.getString("No_Kamar");
                data[5] = resultSet.getString("tipe_kamar");
                data[6] = resultSet.getString("date_in");
                data[7] = resultSet.getString("date_out");
                data[8] = resultSet.getString("total_biaya");
                model.addRow(data);
            }

            conn.close();
            stmt.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),e.getMessage(),"ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }
}