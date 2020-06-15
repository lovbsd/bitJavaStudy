package awtSample05;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class WindeowGame extends Frame implements WindowListener ,ActionListener{
	int win,lose,draw;
	
	Label mainshow,com,playshow,comshow,player,victory;
	Button a,b,c;
	int userChoice=0;
	int comChoice = 0;

	
	public WindeowGame() {
		super("짱깸뽀");
		setLayout(null);
		/*
		 * resource(자원) : button,label,textfield - > handle(번호)
		 * 
		 */
		mainshow = new Label(win+"승"+lose+"패"+draw+"무");
		mainshow.setBounds(300,200,150,30);
		mainshow.setBackground(Color.CYAN);
		add(mainshow);
		
		
		playshow = new Label("?");
		playshow.setBounds(150,250,150,30);
		playshow.setBackground(Color.GRAY);
		add(playshow);
		
		victory = new Label("?");
		victory.setBounds(300,250,150,30);
		victory.setBackground(Color.GRAY);
		add(victory);
		
		comshow = new Label("?  ");
		comshow.setBounds(450,250,150,30);
		comshow.setBackground(Color.GRAY);
		add(comshow);
		
		com = new Label("com");
		com.setBounds(450,300,150,50);
		com.setBackground(Color.pink);
		add(com);
		
		player = new Label("player");
		player.setBounds(150,300,150,50);
		player.setBackground(Color.pink);
		add(player);
		
		
		
		
		
		a = new Button();
		a.setLabel("가위");
		a.setBounds(150,360,150,30);
		a.addActionListener(this);
		add(a);
		
		b = new Button("바위");
		b.setBounds(300,360,150,30);
		b.addActionListener(this);
		add(b);
		
		c =new Button("보");
		c.setBounds(450,360,150,30);
		c.addActionListener(this);
		add(c);
		
		
		
		
		
		setSize(800,600);
		setLocation(0,0);
		setVisible(true);

		addWindowListener(this);
		
		
	}
	
	public void loop() {
		int randomChoice = (int)(Math.random() * 2) + 1;
		if(userChoice - randomChoice==0) {
			victory.setText("비겼습니다");
			draw++;
		}else if(userChoice - randomChoice == -1) {
			victory.setText("졋습니다");
			lose++;
		}else{
			victory.setText("이겼습니다");
			win++;
		}
		if(randomChoice == 1) {
			comshow.setText("가위");
		} else if(randomChoice ==2) {
			comshow.setText("바위");
		} else if (randomChoice == 3) {
			comshow.setText("보");
		}
		mainshow.setText(win + "승 " + lose + "패 " + draw + "무");
			
		}
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
			
		
		
		JOptionPane.showMessageDialog(null,"막누르지마세요");
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		
		System.out.println(btn.getLabel());
	
		if(btnTitle.equals("가위")) {
			userChoice = 1;
			playshow.setText("가위");
			loop();
		}else if (btnTitle.equals("바위")){
			userChoice = 2;
			playshow.setText("바위");
			loop();
			
		}else if(btnTitle.equals("보")){
			String c =(playshow.getText());
			playshow.setText("보");
			loop();
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
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
