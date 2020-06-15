package awtSample05;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener ,ActionListener{
	

	Label label;
	Button button1,button2,button3;
	
	public WindowTest() {
		setLayout(null);
		/*
		 * resource(자원) : button,label,textfield - > handle(번호)
		 * 
		 */
		label = new Label("0");
		label.setBounds(150,300,300,60);
		label.setBackground(Color.CYAN);
		add(label);
		
		button1 = new Button();
		button1.setLabel("+");
		button1.setBounds(150,360,150,30);
		button1.addActionListener(this);
		add(button1);
		
		button2 = new Button("-");
		button2.setBounds(300,360,150,30);
		button2.addActionListener(this);
		add(button2);
		
		button3 =new Button("원상복구");
		button3.setBounds(150,400,300,60);
		button3.addActionListener(this);
		add(button3);
		
		
		
		

		setSize(800,600);
		setLocation(0,0);
		setVisible(true);

		addWindowListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"막누르지마세요");
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		
		
		if(btnTitle.equals("+")) {
			String a=(label.getText());
			int b = Integer.parseInt(a);
			b++;
			a=String.valueOf(b);
			
			label.setText(a);
			
			
			
			
		}else if(btnTitle.equals("-")){
			String a =(label.getText());
			int b = Integer.parseInt(a);
			if(b > 0) {
			b--;
			}
			a=String.valueOf(b);
			
			label.setText(a);
			
			
			
		}else if(btnTitle.equals("원상복구")) {
			String a = (label.getText());
			int b= Integer.parseInt(a);
			b = 0;
			a=String.valueOf(b);
			label.setText(a);
			
		}
		
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
