package awtSample07;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class WindowTest extends JFrame implements ItemListener{
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	Label label1,label2;
	
	public WindowTest() {
		/*
		 
		 	Check Box(취미) - 다중선택
		 	radio Button   - 하나선택
		 	
		 	AWT : radio ->Checkbox
		 	swing : JRadioButton 찾아볼것
		 */
		
		CheckboxGroup cbg1 = new CheckboxGroup();
		// cb1,cb2,cb3
		cb1 = new Checkbox("C",cbg1,true);
		cb2 = new Checkbox("C++",cbg1,false);
		cb3 = new Checkbox("C#",cbg1,false);

		CheckboxGroup cbg2 = new CheckboxGroup();
		cb4 = new Checkbox("java",cbg2,false);
		cb5 = new Checkbox("pyton",cbg2,true);
		cb5 = new Checkbox("rub",cbg2,false);
		
		cb6 = new Checkbox("exit");
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		
		label1 =new Label("버튼1");
		label2 =new Label("버튼2");
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		
		add(label1);
		add(label2);
		JRadioButton rd1 = new JRadioButton("C");
        JRadioButton rd2 = new JRadioButton("Ruby");
        JRadioButton rd3 = new JRadioButton("Python");
        
        // 1번 라디오 버튼 눌러져있도록
        rd1.setSelected(true);
        
        // 라디오 버튼을 그룹화 하기위한 객체 생성
        ButtonGroup groupRd = new ButtonGroup();
        
        // 그룹에 라디오 버튼 포함시킨다.
        groupRd.add(rd1);
        groupRd.add(rd2);
        groupRd.add(rd3);
        
        this.add(rd1);
        this.add(rd2);
        this.add(rd3);



		
		setLayout(new FlowLayout());
		
		setBounds(0, 0, 640, 480);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
//		JOptionPane.showMessageDialog(null,"클릭");
		Object obj = e.getSource();
//		Button btn = (Button)e.getSource();
		
		if(obj == cb6) {
			Checkbox cb= (Checkbox)obj;
			if(cb.getState()) { //체크되었다
				System.exit(0);
			}else {// 체크가 안되었음
				
			}
		}
		else if(obj == cb1 || obj ==cb2||obj == cb3) {
			Checkbox cb= (Checkbox)obj;
			if(cb.getState()) {
				label1.setText(cb.getLabel());
			}
		}
		else if(obj == cb4 || obj ==cb5) {
			Checkbox cb= (Checkbox)obj;
			if(cb.getState()) {
				label2.setText(cb.getLabel());
			}
		}
	}
}