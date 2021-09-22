/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.practice;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author tylerpowell
 */
public class HandleEvent extends JFrame {
    
        private JButton buttonOK = new JButton("OK");
        private JButton buttonCancel = new JButton("Cancel");
        
    
    
    public HandleEvent(){
        // create subobject -- user controls 
        
        // step 2 -- create panel to hold the buttons 
        JPanel panel = new JPanel();
        panel.add(buttonCancel);
        panel.add(buttonOK);
        
        // we call the add method on JFrame to give it the panel 
        add(panel);
        
        // tell buttons that they should call methods when they get clicked
        // --- register listeners ( which implements listener methods )
        ButtonOKListener bok = new ButtonOKListener();
        ButtonCancelListener bcncl = new ButtonCancelListener();
        
        // code to interfaces 
        // telling buttons which method to call when clicked 
        // by giving them a class that implemenets the action listener interface
        buttonOK.addActionListener(bok);
        buttonCancel.addActionListener(bcncl);
     
    } // end constructors 
    public static void main(String[] args) {
        JFrame myFrame = new HandleEvent();
        myFrame.setTitle("Practice swing stuff");
        myFrame.setSize(500,500);
        myFrame.setLocation(231, 411);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
    
    class ButtonOKListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked the ok button you lucky salmon!");
        buttonCancel.setText("dont change me dammit!");
        buttonOK.setText("ok");
    }
 
} // close listener class 

class ButtonCancelListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You canceled me!");
        buttonCancel.setText("Cancel");
        buttonOK.setText("Accept it!!!!!!");
    } // close listener inner class
    
} // close action listener class


} // close public class
