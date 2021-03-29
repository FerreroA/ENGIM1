package gui;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String args[]) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        //Panels setup
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BorderLayout());
        frame.setContentPane(boxPanel);


        JMenuBar menuBar = new JMenuBar();

        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Modifica");
        menuBar.add(m1);
        menuBar.add(m2);
        JMenuItem m11 = new JMenuItem("A text-only menu item");
        m1.add(m11);
        JMenuItem m12 = new JMenuItem("Both text and icon");
        m1.add(m12);
        JMenuItem m13 = new JMenuItem("");
        m1.add(m13);
        m1.addSeparator();
        JMenuItem radio1 = new JRadioButtonMenuItem("A radio button menu item");
        radio1.setSelected(true);
        m1.add(radio1);
        JMenuItem radio2 = new JRadioButtonMenuItem("A radio button menu item");
        m1.add(radio2);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        m1.addSeparator();
        JMenuItem checkBox1 = new JCheckBoxMenuItem("A check box menu item");
        JMenuItem checkBox2 = new JCheckBoxMenuItem("Another one");
        m1.add(checkBox1);
        m1.add(checkBox2);
        m1.addSeparator();
        JMenuItem submenu = new JMenu("A submenu");
        m1.add(submenu);
        JMenuItem subSub1 = new JMenuItem("An item in the submenu");
        JMenuItem subSub2 = new JMenuItem("Another item");
        submenu.add(subSub1);
        submenu.add(subSub2);






        JMenuItem m21 = new JMenuItem("Ritaglia");
        m2.add(m21);
        JMenuItem m22 = new JMenuItem("Seleziona");
        m2.add(m22);



        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));
        boxPanel.add(centerPanel, BorderLayout.CENTER);


        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        JButton buttonC = new JButton("C");
        JButton buttonD = new JButton("D");
        centerPanel.add(buttonA);
        centerPanel.add(buttonB);
        centerPanel.add(buttonC);
        centerPanel.add(buttonD);



        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        boxPanel.add(bottomPanel, BorderLayout.SOUTH);

        JPanel bottomLeftPanel = new JPanel();
        bottomLeftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        bottomPanel.add(bottomLeftPanel);

        JPanel bottomRightPanel = new JPanel();
        bottomRightPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(bottomRightPanel);

        JLabel modifyLabel = new JLabel("Modifica in corso...");
        JButton exitButton = new JButton("Exit");
        bottomLeftPanel.add(modifyLabel);
        bottomRightPanel.add(exitButton);


        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);


        frame.setVisible(true);
    }
}
