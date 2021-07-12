package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.formdev.flatlaf.FlatLightLaf;

public class hotelGui extends JFrame {
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addresstf;
    private javax.swing.JButton bookingButton;
    private javax.swing.JLabel bookingPanel;
    private javax.swing.JPanel bookingpanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JTextField customerstf;
    private javax.swing.JLabel dateinLabel;
    private javax.swing.JTextField dateintf;
    private javax.swing.JLabel dlxRoomLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel nobookLabel;
    private javax.swing.JTextField nobookTf;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phonetf;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JButton reserveButton;
    private javax.swing.JPanel reservePanel;
    private javax.swing.JLabel reservetionLabel;
    private javax.swing.JPanel restoreportpnl;
    private javax.swing.JLabel roomLabelType;
    private javax.swing.JLabel roomNumber;
    private javax.swing.JComboBox<String> roomTypeCb;
    private javax.swing.JTextField roomnumtf;
    private javax.swing.JButton roomsButton;
    private javax.swing.JPanel roomsPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> sortRoomCb;
    private javax.swing.JLabel stdRoomLabel;
    private javax.swing.JLabel suitRoomLabel;
    private javax.swing.JTextField timetf;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JTextField totalPriceTf;
    private JButton loginButton;
    private loginPanel loginpanel;

    public static int screenWidth;
    public static int screenHeight;


    public hotelGui() {
        jDialog1 = new javax.swing.JDialog();
        buttonPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        reserveButton = new javax.swing.JButton();
        bookingButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        roomsButton = new javax.swing.JButton();
        menuLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        reportPanel = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        roomsPanel = new javax.swing.JPanel();
        roomLabelType = new javax.swing.JLabel();
        stdRoomLabel = new javax.swing.JLabel();
        dlxRoomLabel = new javax.swing.JLabel();
        suitRoomLabel = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        reservePanel = new javax.swing.JPanel();
        nobookLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        dateinLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nobookTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        phonetf = new javax.swing.JTextField();
        addresstf = new javax.swing.JTextField();
        dateintf = new javax.swing.JTextField();
        timetf = new javax.swing.JTextField();
        roomnumtf = new javax.swing.JTextField();
        customerstf = new javax.swing.JTextField();
        roomTypeCb = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        totalPriceLabel = new javax.swing.JLabel();
        totalPriceTf = new javax.swing.JTextField();
        reservetionLabel = new javax.swing.JLabel();
        bookingpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sortRoomCb = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        bookingPanel = new javax.swing.JLabel();
        restoreportpnl = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        loginButton = new JButton();
        loginpanel=  new loginPanel();

        screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;

        Container container = this.getContentPane();
        CardLayout cardLayout = new CardLayout();


        //END OF VARIABLE===============================================================================================

        //BUTTON PANEL
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setPreferredSize(new Dimension(200,screenHeight));
        buttonPanel.setMaximumSize(new Dimension(200,screenHeight));
        buttonPanel.add(new JLabel("hello"));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"home");
            }
        });

        reserveButton.setBackground(new java.awt.Color(255, 255, 255));
        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"reserva");
            }
        });

        bookingButton.setBackground(new java.awt.Color(255, 255, 255));
        bookingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"booking");
            }
        });

        reportButton.setBackground(new java.awt.Color(255, 255, 255));
        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"report");
            }
        });

        roomsButton.setBackground(new java.awt.Color(255, 255, 255));
        roomsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(mainPanel,"rooms");
            }
        });

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent){

            }
        });

        menuLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuLabel.setText("MENU");

        try{
            homeButton.setIcon(new ImageIcon(getClass().getResource("/com/icon/home.png")));
            roomsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/bed.png"))); // NOI18N
            reserveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/fd_1.png")));
            bookingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/book.png"))); // NOI18N
            reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/report.png"))); // NOI18N
            loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/admin.png")));
        }catch (Exception e){

        }

        GroupLayout buttonPanelLayout = new GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(menuLabel))
                                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(roomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                   )))
                                .addGap(33, 33, 33))
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(homeButton)
                                .addGap(30, 30, 30)
                                .addComponent(reserveButton)
                                .addGap(30, 30, 30)
                                .addComponent(bookingButton)
                                .addGap(30, 30, 30)
                                .addComponent(reportButton)
                                .addGap(30, 30, 30)
                                .addComponent(roomsButton)
                                .addGap(400))
//                                .addContainerGap(5971, Short.MAX_VALUE))
        );

        container.add(buttonPanel);
        //MAIN PANEL====================================================================================================
        mainPanel.setPreferredSize(new Dimension((screenWidth-200),screenHeight));
        mainPanel.setLayout(cardLayout);



        mainPanel.add(new homePanel(), "home");
        mainPanel.add(new bookingPanel(),"booking");
        mainPanel.add(new reservaPanel(this),"reserva");
        mainPanel.add(new roomsPanel(),"rooms");
        mainPanel.add(new reportPanel(),"report");



        container.add(mainPanel);
        setLayout(new BoxLayout(container,BoxLayout.X_AXIS));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {
        FlatLightLaf.install();

        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        }catch (Exception e){

        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotelGui().setVisible(true);
            }
        });
    }

}
