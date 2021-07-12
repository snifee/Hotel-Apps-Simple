package com.gui;

import javax.swing.*;
import java.awt.*;

public class roomsPanel extends JPanel {
    private JLabel roomLabelType;
    private JLabel stdRoomLabel;
    private JLabel dlxRoomLabel;
    private JLabel suitRoomLabel;
    private JPanel headerPanel;
    private JPanel mainPanel;
    public roomsPanel(){
        roomLabelType = new JLabel();
        stdRoomLabel = new JLabel();
        dlxRoomLabel = new JLabel();
        suitRoomLabel = new JLabel();
        mainPanel = new JPanel();
        headerPanel = new JPanel();

        setBackground(new java.awt.Color(11, 41, 60));
        setPreferredSize(new Dimension((hotelGui.screenWidth-200),hotelGui.screenHeight));
//        headerPanel.setPreferredSize(new Dimension(getParent().getWidth(),200));

        headerPanel.add(roomLabelType);
//        mainPanel.setPreferredSize(new Dimension(getParent().getWidth(),getParent().getHeight()-200));

        try{
            roomLabelType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/rt.jpg"))); // NOI18N
            stdRoomLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/std (3).png"))); // NOI18N
            dlxRoomLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/delu (3).png"))); // NOI18N
            suitRoomLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/sui (2).png"))); // NOI18N
        }catch (Exception e){

        }

        javax.swing.GroupLayout roomsPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(roomsPanelLayout);
        roomsPanelLayout.setHorizontalGroup(
                roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roomsPanelLayout.createSequentialGroup()
                                .addGroup(roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roomsPanelLayout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(stdRoomLabel)
                                                .addGap(38, 38, 38)
                                                .addComponent(dlxRoomLabel)
                                                .addGap(44, 44, 44)
                                                .addComponent(suitRoomLabel))
                                        .addGroup(roomsPanelLayout.createSequentialGroup()
                                                .addGap(265, 265, 265)
                                                .addComponent(roomLabelType)))
                                .addContainerGap(204, Short.MAX_VALUE)
        ));
        roomsPanelLayout.setVerticalGroup(
                roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roomsPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(roomLabelType)
                                .addGroup(roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(roomsPanelLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(stdRoomLabel))
                                        .addGroup(roomsPanelLayout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(roomsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(suitRoomLabel)
                                                        .addComponent(dlxRoomLabel))))
                                .addGap(0, 5930, Short.MAX_VALUE))
        );


        mainPanel.setBackground(new java.awt.Color(11, 41, 60));
        add(mainPanel);

    }
}
