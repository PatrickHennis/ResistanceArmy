
public class Jedi extends Resistance implements Force{
	
	//
	private Lightsaber newSaber;
	private int force;
	
	public Jedi(String string, Lightsaber lightsaber) {
		super(string);
		newSaber = lightsaber;
		force = 10;
	}

	public void setForce(int i) {
		if(i > 0) {
			force = i;
		}
	}

	public Lightsaber getLightsaber() {
		return newSaber;
	}

	public int getForce() {
		return force;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj instanceof Jedi) {
			Jedi n = (Jedi) obj;
			if(this.getForce() == n.getForce()) {
				if(this.getLightsaber().equals(n.getLightsaber())) {
					return super.equals(n);
				}
			}
		}
		return false;
    }
	
	@Override
	public int compareTo(Object o) {
		Jedi n = (Jedi) o;
		return this.getForce() - n.getForce();
	}

}
