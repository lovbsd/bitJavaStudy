package types;

import bomb.Bomb;
import bomb.Dynamite;
import weapon.Sword;
import weapon.Weapon;

public class Atype implements Abstractitem {

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	public Bomb createBomb() {
		// TODO Auto-generated method stub
		return new Dynamite();
	}

}
