
public class Blaster extends Weapon{

	public Blaster(int i) {
		super.changeStrength(i);
	}

	@Override
    public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else if(obj instanceof Blaster) {
			Blaster n = (Blaster) obj;
			if (n.getStrength() == this.getStrength()) {
				return true;
			}
		} 
        return false;
    }
}
