
public abstract class Weapon {

	private int strength = 0;
	
	public int getStrength() {
		return strength;
	}

	public void changeStrength(int i) {
		this.strength += i;
		if (this.getStrength() < 0) {
			this.strength = 0;
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else if(obj instanceof Weapon) { 
			if (((Weapon) obj).getStrength() == (this.getStrength())) {
				return true;
			}
		} 
        return false;
    }
	
}
