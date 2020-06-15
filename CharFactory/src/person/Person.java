package person;

import bomb.Bomb;
import types.Abstractitem;
import weapon.Weapon;

public class Person {
	
	
	public Weapon m_Weapon;
	public Bomb m_Bomb;
	
	public void create(Abstractitem ai) {
						
		
		m_Weapon = ai.createWeapon();//new sword()
		m_Bomb = ai.createBomb(); // new Dynamite()
		
	}
}
