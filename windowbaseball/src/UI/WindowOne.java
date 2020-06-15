package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import dao.DaoClass;






public class WindowOne extends JFrame implements ActionListener {
	JButton insert, delete, selert, update, allprint, save;

	public WindowOne() {
		super("base ball GAME 두둥");
		
		setLayout(null);

		insert = new JButton("선수 추가");
		insert.setBounds(200, 100, 100, 30);
		add(insert);

		delete = new JButton("삭제");
		delete.setBounds(200, 150, 100, 30);
		add(delete);

		selert = new JButton("검색");
		selert.setBounds(200, 200, 100, 30);
		add(selert);

		update = new JButton("수정");
		update.setBounds(200, 250, 100, 30);
		add(update);

		allprint = new JButton("모두 출력");
		allprint.setBounds(200, 300, 100, 30);
		add(allprint);

		save = new JButton("저장");
		save.setBounds(200, 400, 100, 30);
		add(save);

		insert.addActionListener(this); 
		delete.addActionListener(this); 
		selert.addActionListener(this); 
		update.addActionListener(this); 
		allprint.addActionListener(this); 
		save.addActionListener(this); 
			
		
		

		setBounds(0, 0, 640, 480);
		setVisible(true);
		setBackground(Color.red);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			Object obj = e.getSource();
			if(obj == insert) {
				dispose();
				new WindowTwo();
			}else if(obj == delete) {
				dispose();
				new Windowdelete();
			}else if(obj == selert) {
				dispose();
			}else if(obj == update) {
				dispose();
			}else if(obj == allprint) {
				dispose();
			}else if(obj == save ) {
				DaoClass dao = DaoClass.getInstance();
				
				
				JOptionPane.showMessageDialog(null, "저장 돠었습니다.");
				
			}
			
	}
}

