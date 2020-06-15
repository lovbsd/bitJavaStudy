package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.DaoClass;
import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class WindowTwo extends JFrame implements ActionListener {
	


	JButton pit, bat, menu, add;
	
	JTextField textField, textField1, textField2, textField3, textField4, textField5;
	JLabel a, b, c, d, E, f, g;

	public WindowTwo() {
		setLayout(null);

		menu = new JButton("menu");
		menu.setBounds(100, 220, 100, 30);
		add(menu);

		add = new JButton("추가");
		add.setBounds(200, 220, 100, 30);
		add(add);

		pit = new JButton("투수");
		pit.setBounds(100, 50, 100, 30);
		add(pit);

		bat = new JButton("타자");
		bat.setBounds(200, 50, 100, 30);
		add(bat);
		 bat.addActionListener(this);
		
	     pit.addActionListener(this);
	     menu.addActionListener(this);
	     add.addActionListener(this);
		a = new JLabel("name");
		a.setBounds(100, 85, 50, 50);
		b = new JLabel("age");
		b.setBounds(100, 105, 50, 50);
		c = new JLabel("height");
		c.setBounds(100, 125, 50, 50);
		d = new JLabel("win");
		d.setBounds(100, 145, 50, 50);
		E = new JLabel("lose");
		E.setBounds(100, 165, 80, 50);
		f = new JLabel("defence");
		f.setBounds(100, 185, 50, 50);

		textField = new JTextField(20);
		textField.setBounds(200, 100, 100, 20);
		textField1 = new JTextField(20);
		textField1.setBounds(200, 120, 100, 20);
		textField2 = new JTextField(20);
		textField2.setBounds(200, 140, 100, 20);
		textField3 = new JTextField(20);
		textField3.setBounds(200, 160, 100, 20);
		textField4 = new JTextField(20);
		textField4.setBounds(200, 180, 100, 20);
		textField5 = new JTextField(20);
		textField5.setBounds(200, 200, 100, 20);

		add(a);
		add(textField);

		add(b);
		add(textField1);

		add(c);
		add(textField2);

		add(d);
		add(textField3);

		add(E);
		add(textField4);

		add(f);
		add(textField5);

		setBounds(0, 0, 640, 480);
		setVisible(true);
		

	} 
	public void Pitch() {
	String pitt = E.getText();
	
		if(pitt.equals("lose")){
			
		
			DaoClass ball = DaoClass.getInstance();
			Human human =null;
			
			String name = textField.getText();
			int age = Integer.parseInt(textField1.getText());
			double height = Double.parseDouble(textField2.getText());
			int win = Integer.parseInt(textField3.getText());
			int lose = Integer.parseInt(textField4.getText());
			double defence = Double.parseDouble(textField5.getText());
			human = new Pitcher(0, name, age, height, win, lose, defence);
			boolean p =ball.insert(human);
			
			if(p) {
				JOptionPane.showMessageDialog(null, "투수 정보가 성공적으로 추가하였습니다");
		}
		}
	}
	public void bater() {
		String pitt = E.getText();
		if(pitt.equals("hit")) {
			DaoClass ball = DaoClass.getInstance();	
			Human human = null;
			
			String name = textField.getText();
			int age = Integer.parseInt(textField1.getText());
			double height = Double.parseDouble(textField2.getText());
			int batcount = Integer.parseInt(textField3.getText());
			int hit = Integer.parseInt(textField4.getText());
			double hitAvg = Double.parseDouble(textField5.getText());
			
			human = new Batter(0,name, age, height, batcount,hit,hitAvg)	;		
			
			boolean b = ball.insert(human);
			if(b) {
				JOptionPane.showMessageDialog(null, "타자 정보가 성공적으로 추가하였습니다");
				
			}
		}
	}

	
	@Override

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == bat) {
			d.setText("bat");
			E.setText("hit");
			f.setText("hitAvg");
			
		}else if(obj == pit){
			d.setText("win");
			E.setText("lose");
			f.setText("defence");
		}else if(obj == menu) {
			dispose();
			
			new WindowOne();
				}
		if(obj == add) {
			bater();
			Pitch();
		
		
			}
		}
	}

	