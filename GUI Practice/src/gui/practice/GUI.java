/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.practice;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Demonstration of simple GUI
 *
 * @author tylerpowell
 */
public class GUI {

    private static Frame mainFrame;
    private static Panel topPanel;
    private static Panel bottomPanel;
    private static Button button1;
    private static Button button2;
    private static Label instructionLabel;
    private static Label pushButton1;
    private static Label pushButton2;
    private static FlowLayout centerText;
    private static Font labelFont;
    private static Panel push;
    private static Label pushed;
    private static Font font;
    
    int count;

    

    public GUI() {

        // create new project Frame (title)
        System.out.println("Making Frame");
        mainFrame = new Frame("AWT");

        // set mainframe layout 
        mainFrame.setLayout(new GridLayout(1, 2));

        // set mainframe size
        mainFrame.setSize(700, 350);

        // set mainframe as visible 

        // program exit button 
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            } // close Window closing
        }); // close add window listener

        // create top and bottom panels 
        centerText = new FlowLayout(FlowLayout.CENTER, 20, 20);
        topPanel = new Panel(centerText);
        bottomPanel = new Panel(centerText);
        push = new Panel(centerText);

        // add panels to mainframe 
        mainFrame.add(topPanel, BorderLayout.EAST);
        mainFrame.add(bottomPanel, BorderLayout.WEST);
        mainFrame.add(push, BorderLayout.LINE_END);

        // create buttons
        button1 = new Button("Option A");
        button2 = new Button("Option B");

        // adjust size of buttons 
        Dimension buttonSize = new Dimension(200, 60);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);

        // change button font
        Font buttonFont = new Font("", Font.BOLD, 30);
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);

        // add buttons to top panel 
        topPanel.add(button1);
        bottomPanel.add(button2);
        //push.add(pushed);
        

        // create labels
        instructionLabel = new Label("Pick an option, how many clicks can you get in a row?");
        pushButton1 = new Label("A Team");
        pushButton2 = new Label("B Team");
        //pushed = new Label("Clicks" + count);
       
      

        // add instructions label to bottom panel
        bottomPanel.add(instructionLabel);
       
        topPanel.add(instructionLabel);
        push.add(instructionLabel);

        // set label font 
        labelFont = new Font("", Font.BOLD, 25);
       
        pushButton1.setFont(labelFont);
        pushButton2.setFont(labelFont);
        push.setFont(labelFont);
        
        //set instruction label font 
        
        font = new Font("", Font.TRUETYPE_FONT, 12);
        instructionLabel.setFont(font);

        // change color of label / buttons
        instructionLabel.setForeground(Color.CYAN);
        pushButton1.setForeground(Color.CYAN);
        pushButton2.setForeground(Color.CYAN);
        button1.setForeground(Color.BLUE);
        button2.setForeground(Color.MAGENTA);
        push.setForeground(Color.red);

        // set background color for buttons
        instructionLabel.setBackground(Color.BLACK);
        button2.setBackground(Color.DARK_GRAY);
        button1.setBackground(Color.DARK_GRAY);
        push.setBackground(Color.WHITE);

        eventHandlers();
        
        clickCounter();
                
        mainFrame.setVisible(true);


    } // close GUI maker

    /**
     * EVENT HANDLERS FOR BUTTONS
     */
    public static void eventHandlers() {
        // button 1

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // System.out.println("INSIDE EVENT HANDLERS.PRINTLN");
                // System.out.println("action: " + ae.getActionCommand());
                // System.out.println("Source: " + ae.getSource());
                // System.out.println("Modifiers: " + ae.getModifiers());

                //bottomPanel.removeAll();
                topPanel.add(pushButton1);
                mainFrame.setVisible(true);

            } // close action performed
        }); // close button1 action listener

        // button 2 
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // System.out.println("INSIDE EVENT HANDLERS.PRINTLN");
                // System.out.println("action: " + ae.getActionCommand());
                // System.out.println("Source: " + ae.getSource());
                // System.out.println("Modifiers: " + ae.getModifiers());

                //topPanel.removeAll();
                bottomPanel.add(pushButton2);
                mainFrame.setVisible(true);
            } // close action performed
        }); // close button 2 action listener

    } // close event haandlers

    public static void clickCounter() {

        button1.addMouseListener(new MouseAdapter() {
            @Override

            public void mouseClicked(MouseEvent me) {
                
                int count = me.getClickCount();
                count++;

                System.out.println("Clicks" + count);

            } // close mouse event

        }); // close mouse clicked 1

        button2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                int plus = 2;
                int count = me.getClickCount() * plus;

                count++;

                System.out.println("Clicks" + count);

            } // close mouse event

        }); // close mouse clicked 1

    } //close click counter

} // close class

