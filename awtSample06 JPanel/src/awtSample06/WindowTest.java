package awtSample06;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class WindowTest extends JFrame implements ActionListener {
	JTextField textField;//
	JTextArea textArea;//
	
	JButton btn1,btn2;
	public WindowTest() {
		super("textfield");
		JPanel panel = new JPanel();
		//텍스트 영역
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		
		JScrollPane scrPane =  new JScrollPane(textArea);
		scrPane.setPreferredSize(new Dimension(400,300));
		panel.add(scrPane);
	
		JPanel botpan = new JPanel();
		
		textField = new JTextField(20);
		 
		btn1 = new JButton("next insert");
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

	}

}
