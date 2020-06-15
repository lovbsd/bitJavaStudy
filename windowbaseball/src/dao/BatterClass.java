package dao;

import javax.swing.JOptionPane;

import UI.WindowTwo;
import dto.Batter;
import dto.Human;
public class BatterClass extends WindowTwo{
	
	public BatterClass(){
		WindowTwo abc = new WindowTwo();
		 String q= abc.getE().getText();
		
		if(q.equals("hit")) {
			DaoClass ball = DaoClass.getInstance();	
			Human human = null;
			
			String name = getTextField().getText();
			int age = Integer.parseInt(textField1().getText());
			double height = Double.parseDouble(getTextField2().getText());
			int batcount = Integer.parseInt(getTextField3().getText());
			int hit = Integer.parseInt(getTextField4().getText());
			double hitAvg = Double.parseDouble(getTextField5().getText());
			
			human = new Batter(0, name, age, height, batcount,hit,hitAvg)	;		
			
			boolean b = ball.insert(human);
			if(b) {
				JOptionPane.showMessageDialog(null, "타자 정보가 성공적으로 추가하였습니다");
				
			}
		}
	}
	}
	
	

