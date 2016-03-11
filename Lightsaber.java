
public class Lightsaber extends Weapon implements Force{

	private int force = 0;
	
	public Lightsaber(int i, int j) {
		super.changeStrength(i);
		force = j;
	}

	public int getForce() {
		return force;
	}

	@Override
	public int compareTo(Object o) {
		Lightsaber n = (Lightsaber) o;
		return this.getForce() - n.getForce();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else if(obj instanceof Lightsaber) {
			Lightsaber n = (Lightsaber) obj;
			if (n.getStrength() == this.getStrength() && n.getForce() == this.getForce()) {
				return true;
			}
		}
        return false;
    }

}
