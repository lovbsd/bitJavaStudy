package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dao.DaoClass;

public class Windowdelete extends JFrame implements ActionListener {
	JTextField textField;
	JTextArea textArea;
	JLabel label1,babel2;
	
	JButton btn1,btn2;
	public Windowdelete() {
		super("textfield");
		JPanel panel = new JPanel();
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		
		
		textArea.setBounds(50, 50, 300, 300);
		add(textArea);
		textArea.append("");
		textArea.setEnabled(false);
		JPanel botpan = new JPanel();
		
		textField = new JTextField("");
		 
		btn1 = new JButton("검색");
		btn2 = new JButton("previuas insert");
		
		botpan.add(textField);
		botpan.add(btn1);
		botpan.add(btn2);
		
		Container contentPane = getContentPane();
		contentPane.add(panel,BorderLayout.CENTER);
		contentPane.add(botpan,BorderLayout.SOUTH);
				
		
		setBounds(0,0,640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == btn1) {
		}
		String text= textField.getText();
			if (text  !=null&&!"".equals(text)) {
	               tf.setEditable(true);
	               label.setText("");
	            } else {
	               tf.setEditable(false);
	               label.setText("* Enter only numeric digits(0-9)");
			
		if(textField.equals(textField.getText()));
		DaoClass h = DaoClass.getInstance();
		for (int i = 0; i < h.list.size(); i++) {
			 h.list.get(i);
			
		}
		
		
		
		}

	}

}