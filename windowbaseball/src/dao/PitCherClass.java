package dao;

import javax.swing.JOptionPane;

import UI.WindowTwo;
import dto.Human;
import dto.Pitcher;

public class PitCherClass extends  WindowTwo{
	PitCherClass(){
		
	}

	public void PitCherClasa(){
		WindowTwo abc = new WindowTwo();
		 String q= r;
		 System.out.println(q);
		 if(q.equals("lose")){
				
				
				DaoClass ball = DaoClass.getInstance();
				Human human =null;
				
				String name = abc.getTextField().getText();
				int age = Integer.parseInt(abc.getTextField1().getText());
				double height = Double.parseDouble(abc.getTextField2().getText());
				int win = Integer.parseInt(abc.getTextField3().getText());
				int lose = Integer.parseInt(abc.getTextField4().getText());
				double defence = Double.parseDouble(abc.getTextField5().getText());
				human = new Pitcher(0, name, age, height, win, lose, defence);
				boolean p =ball.insert(human);
				
				if(p) {
					JOptionPane.showMessageDialog(null, "투수 정보가 성공적으로 추가하였습니다");
			}
	}

	}
}
