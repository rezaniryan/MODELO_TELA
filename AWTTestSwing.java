package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class AWTTestSwing {
	    public static void main(String[] args) {
	        
	    	//criaçao de um novo JFrame com o titulo "AWT Test"
	        JFrame frame = new JFrame("AWT Test");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 200);
	        frame.setLayout(new BorderLayout());
	        
	        //criaçao de um JLabel e um JTextField
	        JLabel label1 = new JLabel("Label1");
	        JTextField textField1 = new JTextField(15);
	               
	        //criaçao de um JPanel para o topo com layout FlowLayout
	        JPanel topPanel = new JPanel(); 
	        topPanel.setLayout(new FlowLayout());
	        topPanel.add(label1); 
	        topPanel.add(textField1);
	        
	        //criaçao dos tres botoes 
	        JButton button1 = new JButton("Button 1"); 
	        JButton button2 = new JButton("Button 2"); 
	        JButton button3 = new JButton("Button 3"); 
	        
	        //criaçao de um JPanel para os botões com layout FlowLayout
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setLayout(new FlowLayout());
	        buttonPanel.add(button1);
	        buttonPanel.add(button2);
	        buttonPanel.add(button3);
	        
	        //adiciona os paineis ao JFrame nas posiçoes especificadas
	        frame.add(topPanel, BorderLayout.NORTH);
	        frame.add(buttonPanel, BorderLayout.CENTER);
	        
	        // deixa o JFrame visivel 
	        frame.setVisible(true);
	    }
	}

