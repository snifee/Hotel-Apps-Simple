package com.gui;

import javax.swing.*;
import java.awt.*;

public class homePanel extends JPanel {
    private JLabel homeLabel;
    public homePanel(){
        homeLabel = new JLabel();

        setBackground(new java.awt.Color(11, 41, 60));
        setPreferredSize(new Dimension((hotelGui.screenWidth-200),hotelGui.screenHeight));
        try{
            homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/homep (1).png"))); // NOI18N
        }catch (Exception e){

        }

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(this);
        homePanelLayout.setAutoCreateGaps(true);
        homePanelLayout.setAutoCreateContainerGaps(true);
        setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
                homePanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addGap(500)
                                .addComponent(homeLabel))
        );
        homePanelLayout.setVerticalGroup(
                homePanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent( homeLabel,100, 250, Short.MAX_VALUE))
        );


    }
}
