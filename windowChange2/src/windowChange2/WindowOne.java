package windowChange2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import windowChange2.SingletonClass;

public class WindowOne extends Frame {
	
	

	public WindowOne() {
		
		setLayout(null);
		
		Button btn =new Button("move window");
		btn.setBounds(100,100,100,30);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);// 부분 멈춤일때 사용하면안됨 위험성 전부꺼져버림
				SingletonClass sc =SingletonClass.getInstance();
				
				sc.one.setVisible(false);
				sc.two.setVisible(true);
				
			
				
			
				
			}
		});
		add(btn);
		
		
		setBounds(0, 0, 640, 480);
		setVisible(false);
		setBackground(Color.red);
		
	}
}
