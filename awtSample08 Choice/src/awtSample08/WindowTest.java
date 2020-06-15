package awtSample08;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowTest extends JFrame implements WindowListener{
	Choice choice;
	Label label;
	public WindowTest() {
	setLayout(new FlowLayout());
	
	choice = new Choice();
	choice.add("C");
	choice.add("C++");
	choice.add("C#");
	choice.add("JAVA");
	choice.add("pyton");
	
	choice.addItemListener(new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			label.setText(choice.getSelectedItem());// 선택된 Choice를  문자열로 레이블 에담긴다 
			
			
		}
	});
	add(choice);
	
	label = new Label("```");// 여기있는부분이 바뀜
	add(label);
	
	setLayout(new FlowLayout());
	
	setBounds(0, 0, 640, 480);
	setVisible(true);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
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
